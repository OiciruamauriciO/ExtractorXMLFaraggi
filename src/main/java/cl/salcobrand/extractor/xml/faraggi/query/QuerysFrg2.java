package cl.salcobrand.extractor.xml.faraggi.query;

public class QuerysFrg2 {
	
	private QuerysFrg2() {
		throw new IllegalStateException("Querys class");
	}
	
	public static final String SELECT_SDATA_FRG2 = "SELECT DECODE(ind_prd_generico, 'S','G','N','M',ind_prd_generico)\r\n"
			+ "FROM phb.listas_producto_beneficiario\r\n"
			+ "WHERE codigo = ?";	
}
