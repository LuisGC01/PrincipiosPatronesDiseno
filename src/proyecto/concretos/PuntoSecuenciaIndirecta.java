package proyecto.concretos;

import proyecto.creadores.ITipoPunto;

public class PuntoSecuenciaIndirecta implements ITipoPunto {
	private String valor;
	private String barridoPrincipal;
	private String instrucciones;
	private String comentario;

	public PuntoSecuenciaIndirecta() {
		// TODO Auto-generated constructor stub
	}

	public PuntoSecuenciaIndirecta(String valor, String barridoPrincipal, String instrucciones, String comentario) {
		this.valor = valor;
		this.barridoPrincipal = barridoPrincipal;
		this.instrucciones = instrucciones;
		this.comentario = comentario;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getBarridoPrincipal() {
		return barridoPrincipal;
	}

	public void setBarridoPrincipal(String barridoPrincipal) {
		this.barridoPrincipal = barridoPrincipal;
	}

	public String getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(String instrucciones) {
		this.instrucciones = instrucciones;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public void setInfo(String[] datos) {
		// TODO Auto-generated method stub

	}

	@Override
	public String[] getInfo() {
		// TODO Auto-generated method stub
		String[] datos = { "h" };
		return null;
	}

}
