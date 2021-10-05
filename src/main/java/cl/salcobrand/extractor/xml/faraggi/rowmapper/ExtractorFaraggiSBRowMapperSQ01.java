package cl.salcobrand.extractor.xml.faraggi.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.salcobrand.extractor.xml.faraggi.model.ExtractorModeloFaraggiSQ01;

public class ExtractorFaraggiSBRowMapperSQ01 implements RowMapper<ExtractorModeloFaraggiSQ01>{

	@Override
	public ExtractorModeloFaraggiSQ01 mapRow(ResultSet rs, int rowNum) throws SQLException {

		ExtractorModeloFaraggiSQ01 entity = new ExtractorModeloFaraggiSQ01();
		
		entity.setTxt_total_copago(rs.getInt("txt_total_copago"));
		entity.setTxt_total_venta(rs.getInt("txt_total_venta"));
		entity.setTxt_estado_envio(rs.getInt("txt_estado_envio"));
		
		return entity;
	}

}
