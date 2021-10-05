package cl.salcobrand.extractor.xml.faraggi.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.salcobrand.extractor.xml.faraggi.model.ExtractorModeloFaraggi;

public class ExtractorFaraggiSBRowMapper implements RowMapper<ExtractorModeloFaraggi> {

	@Override
	public ExtractorModeloFaraggi mapRow(ResultSet rs, int rowNum) throws SQLException {

		ExtractorModeloFaraggi entity = new  ExtractorModeloFaraggi();
		
			entity.setCodigo_autorizacion(rs.getInt("codigo_autorizacion"));
			entity.setFecha_registro(rs.getDate("fecha_registro"));
			entity.setPrecio(rs.getInt("precio"));
			entity.setCantidad(rs.getInt("cantidad"));
			entity.setCodigo(rs.getString("codigo"));
			entity.setMonto_bonificado(rs.getInt("monto_bonificado"));
			entity.setMonto_copago(rs.getInt("monto_copago"));
			entity.setMonto_deducible(rs.getInt("monto_deducible"));
			entity.setMonto_transaccion(rs.getInt("monto_transaccion"));
			entity.setRut_titular(rs.getInt("rut_titular"));
			entity.setRut_benef(rs.getInt("rut_benef"));
			entity.setRut_medico(rs.getInt("rut_medico"));
			entity.setNombre_medico(rs.getString("nombre_medico"));
			entity.setCorrelativo(rs.getInt("correlativo"));
			entity.setNombre_producto(rs.getString("nombre_producto"));
			entity.setTipo_producto(rs.getString("tipo_producto"));
			entity.setAtributo1(rs.getString("atributo1"));
			entity.setAtributo2(rs.getString("atributo2"));
			entity.setAtributo3(rs.getString("atributo3"));
			entity.setVendedor(rs.getInt("vendedor"));
			entity.setDir_local(rs.getString("dir_local"));
			entity.setLo_codigo(rs.getInt("lo_codigo"));
			entity.setCaja(rs.getInt("caja"));
			entity.setNro_docto(rs.getInt("nro_docto"));
			entity.setFolio_cliente(rs.getInt("folio_cliente"));
			entity.setTipo_autorizacion(rs.getString("tipo_autorizacion"));
			entity.setParametro_aplicacion(rs.getInt("parametro_aplicacion"));
			entity.setId_ws(rs.getInt("id_ws"));
			entity.setId_servicio(rs.getString("id_servicio"));
			entity.setId_servicio_resp(rs.getString("id_servicio_resp"));
			entity.setInd_equivalencia(rs.getInt("ind_equivalencia"));
			entity.setInd_ws_contrato(rs.getString("ind_ws_contrato"));
		
		return entity;
	}

}
