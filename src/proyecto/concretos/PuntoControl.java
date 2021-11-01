package proyecto.concretos;

import proyecto.creadores.ITipoPunto;

public class PuntoControl implements ITipoPunto {
	private String valor;
	private String barridoPrincipal;
	private String barridoSecundario;
	private String instrucciones;
	private String comentario;

	public PuntoControl() {
		// TODO Auto-generated constructor stub
	}

	public PuntoControl(String valor, String barridoPrincipal, String barridoSecundario, String instrucciones,
			String comentario) {
		this.valor = valor;
		this.barridoPrincipal = barridoPrincipal;
		this.barridoSecundario = barridoSecundario;
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

	public String getBarridoSecundario() {
		return barridoSecundario;
	}

	public void setBarridoSecundario(String barridoSecundario) {
		this.barridoSecundario = barridoSecundario;
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
		setValor(datos[0]);
		setBarridoPrincipal(datos[1]);
		setBarridoSecundario(datos[2]);
		setInstrucciones(datos[3]);
		setComentario(datos[4]);
	}

	@Override
	public String[] getInfo() {
		// TODO Auto-generated method stub
		String[] datos = { getValor(), getBarridoPrincipal(), getBarridoSecundario(), getInstrucciones(),
				getComentario() };
		return datos;
	}

}
