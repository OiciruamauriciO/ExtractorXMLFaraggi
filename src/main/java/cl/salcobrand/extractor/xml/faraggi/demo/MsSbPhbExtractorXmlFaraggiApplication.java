package cl.salcobrand.extractor.xml.faraggi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"cl.salcobrand.extractor.xml.faraggi"})
public class MsSbPhbExtractorXmlFaraggiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSbPhbExtractorXmlFaraggiApplication.class, args);
		//System.out.println("TEST");
	}

}
