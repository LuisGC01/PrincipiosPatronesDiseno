package proyecto.concretos;

import java.util.Objects;

import proyecto.creadores.ITipoPunto;

public class PuntoSecuenciaDIrecta implements ITipoPunto {
	private String valor;
	private String barridoPrincipal;
	private String barridoSecundario;
	private int numeroMediciones;
	private String instrucciones;
	private String comentario;

	public PuntoSecuenciaDIrecta() {
		// TODO Auto-generated constructor stub
	}

	public PuntoSecuenciaDIrecta(String valor, String barridoPrincipal, String barridoSecundario, int numeroMediciones,
			String instrucciones, String comentario) {
		this.valor = valor;
		this.barridoPrincipal = barridoPrincipal;
		this.barridoSecundario = barridoSecundario;
		this.numeroMediciones = numeroMediciones;
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

	public int getNumeroMediciones() {
		return numeroMediciones;
	}

	public void setNumeroMediciones(int numeroMediciones) {
		this.numeroMediciones = numeroMediciones;
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
		setNumeroMediciones(Integer.parseInt(datos[3]));
		setInstrucciones(datos[4]);
		setComentario(datos[5]);
	}

	@Override
	public String[] getInfo() {
		// TODO Auto-generated method stub
		String[] datos = { getValor(), getBarridoPrincipal(), getBarridoSecundario(), getNumeroMediciones() + "",
				getInstrucciones(), getComentario() };
		return datos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(barridoPrincipal, barridoSecundario, comentario, instrucciones, numeroMediciones, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PuntoSecuenciaDIrecta other = (PuntoSecuenciaDIrecta) obj;
		return Objects.equals(barridoPrincipal, other.barridoPrincipal)
				&& Objects.equals(barridoSecundario, other.barridoSecundario)
				&& Objects.equals(comentario, other.comentario) && Objects.equals(instrucciones, other.instrucciones)
				&& numeroMediciones == other.numeroMediciones && Objects.equals(valor, other.valor);
	}

	@Override
	public String toString() {
		return "PuntoSecuenciaDIrecta [valor=" + valor + ", barridoPrincipal=" + barridoPrincipal
				+ ", barridoSecundario=" + barridoSecundario + ", numeroMediciones=" + numeroMediciones
				+ ", instrucciones=" + instrucciones + ", comentario=" + comentario + "]";
	}

}
