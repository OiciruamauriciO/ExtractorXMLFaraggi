package cl.salcobrand.extractor.xml.faraggi.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import cl.salcobrand.extractor.xml.faraggi.model.ExtractorModeloFaraggiSQ01;
import cl.salcobrand.extractor.xml.faraggi.query.QuerysFrg1;
import cl.salcobrand.extractor.xml.faraggi.repository.IExtractorFaraggiRepositorySQ01;
import cl.salcobrand.extractor.xml.faraggi.rowmapper.ExtractorFaraggiSBRowMapperSQ01;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ExtractorFaraggiRepositorySQ01Impl implements IExtractorFaraggiRepositorySQ01{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;	
	
	@Override
	public List<ExtractorModeloFaraggiSQ01> repositoryGetDataSQ01() {
		log.info("Repository::Impl::repositoryGetDataSQ01");		
		
		List<ExtractorModeloFaraggiSQ01> forxmldatasq01 = null;
		
		try {
			
			RowMapper<ExtractorModeloFaraggiSQ01> rm = new ExtractorFaraggiSBRowMapperSQ01();
			forxmldatasq01 = jdbcTemplate.query(QuerysFrg1.SELECT_SDATA_FRG1, rm);
			
		}catch(Exception e) {
			log.error("ERROR - DAO Exception {} ", e.getMessage());
		}
		
		return forxmldatasq01;
	}

}
