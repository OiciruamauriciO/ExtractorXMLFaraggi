package cl.salcobrand.extractor.xml.faraggi.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import cl.salcobrand.extractor.xml.faraggi.model.ExtractorModeloFaraggi;
import cl.salcobrand.extractor.xml.faraggi.query.Querys;
import cl.salcobrand.extractor.xml.faraggi.repository.IExtractorFaraggiRepository;
import cl.salcobrand.extractor.xml.faraggi.rowmapper.ExtractorFaraggiSBRowMapper;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ExtractorFaraggiRepositoryImpl implements IExtractorFaraggiRepository{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;	

	@Override
	public List<ExtractorModeloFaraggi> repositoryGetGralData() {		
		log.info("Repository::Impl::repositoryGetGralData");
		
		List<ExtractorModeloFaraggi> forxmldata = null;
		
		try {
			
			RowMapper<ExtractorModeloFaraggi> rm = new ExtractorFaraggiSBRowMapper();
			forxmldata = jdbcTemplate.query(Querys.SELECT_GRAL_DATA, rm);
			
		}catch(Exception e) {
			log.error("ERROR - DAO Exception {} ", e.getMessage());
		}
		
		return forxmldata;
	}

}
