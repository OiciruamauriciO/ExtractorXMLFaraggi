package cl.salcobrand.extractor.xml.faraggi.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExtractorModeloFaraggi {

	private int codigo_autorizacion;
	private Date fecha_registro;
	private int precio;
	private int cantidad;
	private String codigo;
	private int monto_bonificado;
	private int monto_copago;
	private int monto_deducible;
	private int monto_transaccion;
	private int rut_titular;
	private int rut_benef;
	private int rut_medico;
	private String nombre_medico;
	private int correlativo;
	private String nombre_producto;
	private String tipo_producto;
	private String atributo1;
	private String atributo2;
	private String atributo3;
	private int vendedor;
	private String dir_local;
	private int lo_codigo;
	private int caja;
	private int nro_docto;
	private int folio_cliente;
	private String tipo_autorizacion;
	private int parametro_aplicacion;
	private int id_ws;
	private String id_servicio;
	private String id_servicio_resp;
	private int ind_equivalencia;
	private String ind_ws_contrato;
	
}
