package cl.salcobrand.extractor.xml.faraggi.util;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import cl.salcobrand.extractor.xml.faraggi.response.ExtractorFaraggiSBResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UGeneraDataListImpl implements IUGeneraDataList{
	
	private ArrayList<String> listfinal = new ArrayList<String>();	
	private String xml = "";
	
	//CABECERA
	//CodigoDeVenta
	private int codigo_autorizacion;
	//Estado
	private String tipo_autorizacion;
	//CiaSeguros
	private String atributo1;
	//Poliza
	private String atributo2;
	//CodigoUnico
	private int folio_cliente;
	//FechaVenta		
	private Date fecha_registro;
	//Local
	private int lo_codigo;
	//Caja
	private int caja;
	//Boleta
	private int nro_docto;
	//RutTitular
	private int rut_titular;
	//CorrelativoDeCarga
	private int correlativo;
	//RutBeneficiario
	private int rut_benef;
	//RutMedico
	private int rut_medico;
	//NombreMedico
	private String nombre_medico;	
	//NroProductosBoleta
	private int nro_productos;
	
	//DETALLE
	//CodigoProducto
	private String codigo;
	//NombreProducto
	private String nombre_producto;
	//TipoProducto
	private String tipo_producto;
	//UnidadesVendidas
	private int cantidad;
	//PrecioUnitario
	private int monto_transaccion;	
	//MontoBonificado
	private int monto_bonificado;
	//MontoDeducible
	private int monto_deducible;
	//MontoCopago
	private int monto_copago;
	
	
	/*-sin usar-
	private int precio;			
	private String atributo3;
	private int vendedor;
	private String dir_local;	
	private int parametro_aplicacion;
	private int id_ws;
	private String id_servicio;
	private String id_servicio_resp;
	private int ind_equivalencia;
	private String ind_ws_contrato;
	*/

	@Override
	public String getXML(List<ExtractorFaraggiSBResponse> list) {
		
		xml+="<?xml version="+"\""+"1.0"+"\""+"encoding="+"\""+"ISO-8859-1"+"\""+"?><CargoVenta><CodigoDeVenta>";
				
		//CABECERA
		//CodigoDeVenta
		listfinal.add(String.valueOf(list.get(0).getCodigo_autorizacion()));
		xml+=String.valueOf(list.get(0).getCodigo_autorizacion())+"</CodigoDeVenta>";
		//Estado
		listfinal.add(String.valueOf(list.get(0).getTipo_autorizacion()));
		xml+="<Estado>"+String.valueOf(list.get(0).getTipo_autorizacion())+"</Estado>";
		//CiaSeguros
		listfinal.add(String.valueOf(list.get(0).getAtributo1()));
		xml+="<CiaSeguros>"+String.valueOf(list.get(0).getAtributo1())+"</CiaSeguros>";
		//Poliza
		listfinal.add(String.valueOf(list.get(0).getAtributo2()));
		xml+="<Poliza>"+String.valueOf(list.get(0).getAtributo2())+"</Poliza>";
		//CodigoUnico
		listfinal.add(String.valueOf(list.get(0).getFolio_cliente()));
		xml+="<CodigoUnico>"+String.valueOf(list.get(0).getFolio_cliente())+"</CodigoUnico>";
		//FechaVenta
		listfinal.add(String.valueOf(list.get(0).getFecha_registro()));
		xml+="<FechaVenta>"+String.valueOf(list.get(0).getFecha_registro())+"</FechaVenta>";
		//Local
		listfinal.add(String.valueOf(list.get(0).getLo_codigo()));
		xml+="<Local>"+String.valueOf(list.get(0).getLo_codigo())+"</Local>";
		//Caja
		listfinal.add(String.valueOf(list.get(0).getCaja()));
		xml+="<Caja>"+String.valueOf(list.get(0).getCaja())+"</Caja>";
		//Boleta
		listfinal.add(String.valueOf(list.get(0).getNro_docto()));
		xml+="<Boleta>"+String.valueOf(list.get(0).getNro_docto())+"</Boleta>";
		//RutTitular
		listfinal.add(String.valueOf(list.get(0).getRut_titular()));
		xml+="<RutTitular>"+String.valueOf(list.get(0).getRut_titular())+"</RutTitular>";
		//CorrelativoDeCarga
		listfinal.add(String.valueOf(list.get(0).getCorrelativo()));
		xml+="<CorrelativoDeCarga>"+String.valueOf(list.get(0).getCorrelativo())+"</CorrelativoDeCarga>";
		//RutBeneficiario
		listfinal.add(String.valueOf(list.get(0).getRut_benef()));
		xml+="<RutBeneficiario>"+String.valueOf(list.get(0).getRut_benef())+"</RutBeneficiario>";
		//RutMedico
		listfinal.add(String.valueOf(list.get(0).getRut_medico()));
		xml+="<RutMedico>"+String.valueOf(list.get(0).getRut_medico())+"</RutMedico>";
		//NombreMedico
		listfinal.add(String.valueOf(list.get(0).getNombre_medico()));
		xml+="<NombreMedico>"+String.valueOf(list.get(0).getNombre_medico())+"</NombreMedico>";
		//NroProductosBoleta (determinado por el largo de la lista + 1)
		listfinal.add(String.valueOf(list.size()));
		xml+="<NroProductosBoleta>"+String.valueOf(list.size())+"</NroProductosBoleta>";
		
		for(int i=0; i<3; i++) {
			xml+="<DetalleVenta>";
			//CodigoProducto
			listfinal.add(String.valueOf(list.get(i).getCodigo()));
			xml+="<CodigoProducto>"+String.valueOf(list.get(i).getCodigo())+"</CodigoProducto>";
			//NombreProducto
			listfinal.add(String.valueOf(list.get(i).getNombre_producto()));
			xml+="<NombreProducto>"+String.valueOf(list.get(i).getNombre_producto())+"</NombreProducto>";
			//TipoProducto
			listfinal.add(String.valueOf(list.get(i).getTipo_producto()));
			xml+="<TipoProducto>"+String.valueOf(list.get(i).getTipo_producto())+"</TipoProducto>";
			//UnidadesVendidas
			listfinal.add(String.valueOf(list.get(i).getCantidad()));
			xml+="<UnidadesVendidas>"+String.valueOf(list.get(i).getCantidad())+"</UnidadesVendidas>";
			//PrecioUnitario
			listfinal.add(String.valueOf(list.get(i).getMonto_transaccion()));
			xml+="<PrecioUnitario>"+String.valueOf(list.get(i).getMonto_transaccion())+"</PrecioUnitario>";
			//MontoBonificado
			listfinal.add(String.valueOf(list.get(i).getMonto_bonificado()));
			xml+="<MontoBonificado>"+String.valueOf(list.get(i).getMonto_bonificado())+"</MontoBonificado>";
			//MontoDeducible
			listfinal.add(String.valueOf(list.get(i).getMonto_deducible()));
			xml+="<MontoDeducible>"+String.valueOf(list.get(i).getMonto_deducible())+"</MontoDeducible>";
			//MontoCopago
			listfinal.add(String.valueOf(list.get(i).getMonto_copago()));	
			xml+="<MontoCopago>"+String.valueOf(list.get(i).getMonto_copago())+"</MontoCopago>";
			xml+="</DetalleVenta>";
		}
		
		xml+="<CargoVenta>";
		System.out.println(xml);
		
		this.setListfinal(this.listfinal);
		this.setXml(this.xml);
					
		return this.getXml();
	}
	
	
}
