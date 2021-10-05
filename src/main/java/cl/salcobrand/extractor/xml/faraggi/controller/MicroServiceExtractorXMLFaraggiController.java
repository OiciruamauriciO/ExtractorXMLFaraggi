package cl.salcobrand.extractor.xml.faraggi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.salcobrand.extractor.xml.faraggi.service.IExtractorFaraggiService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MicroServiceExtractorXMLFaraggiController {

	@Autowired(required=true)
	IExtractorFaraggiService service;
	
	@GetMapping(value = "/xmlfaraggi")
	public String methodGetDataFaraggi() {
		
		log.info("Controller::methodGetDataFaraggi");
		return service.serviceMethodGetFaraggiGralData();
	}
}
