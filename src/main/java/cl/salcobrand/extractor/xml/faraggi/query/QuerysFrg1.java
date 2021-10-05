package cl.salcobrand.extractor.xml.faraggi.query;

public class QuerysFrg1 {
	
	private QuerysFrg1() {
		throw new IllegalStateException("Querys class");
	}
	
	public static final String SELECT_SDATA_FRG1 = "SELECT NVL(SUM(monto_copago), 0) monto_copago,\r\n"
			+ "                  NVL(SUM(monto_transaccion), 0) monto_transaccion,\r\n"
			+ "                  MAX(li_codigo)\r\n"
			+ "           FROM   PHB.detalle_consumos a, PHB.contratos f, PHB.prefactura_cliente g\r\n"
			+ "          WHERE       a.ef_codigo = 1\r\n"
			+ "                  AND a.codigo_autorizacion = 561768008\r\n"
			+ "                  AND a.parametro_aplicacion IS NOT NULL\r\n"
			+ "                  AND a.estado_consumo IN ('1', '2')\r\n"
			+ "                  AND a.resultado_consumo IN ('00', '93')\r\n"
			+ "                  AND f.ef_codigo = a.ef_codigo\r\n"
			+ "                  AND f.numero_contrato = a.ct_numero_contrato\r\n"
			+ "                  AND f.ind_webservices = 'WS27'\r\n"
			+ "                  AND g.codigo_autorizacion = a.codigo_autorizacion\r\n"
			+ "                  AND g.ct_numero_contrato = a.ct_numero_contrato";	
	
}
