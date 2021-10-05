package cl.salcobrand.extractor.xml.faraggi.serviceimpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.filechooser.FileSystemView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.salcobrand.extractor.xml.faraggi.model.ExtractorModeloFaraggi;
import cl.salcobrand.extractor.xml.faraggi.repository.IExtractorFaraggiRepository;
import cl.salcobrand.extractor.xml.faraggi.response.ExtractorFaraggiSBResponse;
import cl.salcobrand.extractor.xml.faraggi.service.IExtractorFaraggiService;
import cl.salcobrand.extractor.xml.faraggi.util.UGeneraDataListImpl;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class ExtractorFaraggiServiceImpl implements IExtractorFaraggiService{
	
	@Autowired(required=true)
	IExtractorFaraggiRepository repository;
	
	String listgen = null;

	@Override
	public String serviceMethodGetFaraggiGralData() {
		log.info("Service:Impl::serviceMethodGetFaraggiGralData");
				
		List<ExtractorFaraggiSBResponse> list = new ArrayList<>();
		List<ExtractorModeloFaraggi> forxmldata = null;
		
			forxmldata = repository.repositoryGetGralData();
			
			if(forxmldata!=null) {
				
				for(ExtractorModeloFaraggi xfm: forxmldata) {
					
					ExtractorFaraggiSBResponse xmlResponse = new ExtractorFaraggiSBResponse(xfm.getCodigo_autorizacion(), xfm.getFecha_registro(), xfm.getPrecio(), 
							xfm.getCantidad(), xfm.getCodigo(), xfm.getMonto_bonificado(), xfm.getMonto_copago(), xfm.getMonto_deducible(), 
							xfm.getMonto_transaccion(), xfm.getRut_titular(), xfm.getRut_benef(), xfm.getRut_medico(), xfm.getNombre_medico(), 
							xfm.getCorrelativo(), xfm.getNombre_producto(), xfm.getTipo_producto(), xfm.getAtributo1(), xfm.getAtributo2(), 
							xfm.getAtributo3(), xfm.getVendedor(), xfm.getDir_local(), xfm.getLo_codigo(), xfm.getCaja(), xfm.getNro_docto(), 
							xfm.getFolio_cliente(), xfm.getTipo_autorizacion(), xfm.getParametro_aplicacion(), xfm.getId_ws(), xfm.getId_servicio(), 
							xfm.getId_servicio_resp(), xfm.getInd_equivalencia(), xfm.getInd_ws_contrato());
								
					list.add(xmlResponse);
				}
				
				UGeneraDataListImpl genList = new UGeneraDataListImpl();
				listgen = genList.getXML(list);
				
				File path = FileSystemView.getFileSystemView().getHomeDirectory(); 
				String absPath = path.getAbsolutePath();
				String so = System.getProperty("os.name");
				String separador = System.getProperty("file.separator");
				String userhome = System.getProperty("user.home");
				
				String ruta_carpeta = absPath+separador+"XML_Faraggi";
				String ruta_archivo = ruta_carpeta + separador + String.valueOf(list.get(0).getCodigo_autorizacion())+"xml.xml";
				
				File directorioFile = new File(ruta_carpeta);  
				File archivoFile = new File(ruta_archivo);  
				
				if (!directorioFile.exists()) {
					
					if (directorioFile.mkdirs()) {
						System.out.println("Directorio creado");
							try {
								archivoFile.createNewFile();
								FileWriter fw = new FileWriter(archivoFile);
								BufferedWriter bufferedWriter = new BufferedWriter(fw);
								bufferedWriter.write(listgen);
								bufferedWriter.close();			
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

					} else {
						System.out.println("No se pudo crear el directorio. Ejecute nuevamente el microservicio.");
					}
				} else {
					System.out.println("El directorio ya está creado, por seguridad elimine el directorio y ejecute nuevamente el microservicio. Si gusta, respalde esa información.");

				}				
				
			}else {
				log.error("Error al obtener lista, forxmldata es null - Revisar Logs");		
			}		
		
		return "Proceso ejecutado";
	}

}
