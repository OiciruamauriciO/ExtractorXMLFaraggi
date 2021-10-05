package cl.salcobrand.extractor.xml.faraggi.query;

public class QuerysFrg3 {
	
	private QuerysFrg3() {
		throw new IllegalStateException("Querys class");
	}
	
	public static final String SELECT_SDATA_FRG3 = "SELECT DECODE (ind_prd_generico, 'S','G','N','M',ind_prd_generico)\r\n"
			+ "FROM phb.parametros_aplicacion_contrato\r\n"
			+ "WHERE codigo = ?";	
}
