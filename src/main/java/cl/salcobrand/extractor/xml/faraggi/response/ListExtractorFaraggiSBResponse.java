package cl.salcobrand.extractor.xml.faraggi.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListExtractorFaraggiSBResponse extends GenericResponse{
	
	private List<ExtractorFaraggiSBResponse> list;
	
	
}
