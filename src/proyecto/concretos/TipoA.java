package proyecto.concretos;

import java.util.Objects;

import proyecto.creadores.ITipoMagnitud;

public class TipoA implements ITipoMagnitud {

	private String metodoObservacion;
	private String evaluacionIncertidumbre;
	private String distribucionAsumida;

	public TipoA() {
		// TODO Auto-generated constructor stub
	}

	public TipoA(String metodoObservacion, String evaluacionIncertidumbre, String distribucionAsumida) {
		this.metodoObservacion = metodoObservacion;
		this.evaluacionIncertidumbre = evaluacionIncertidumbre;
		this.distribucionAsumida = distribucionAsumida;
	}

	public String getMetodoObservacion() {
		return metodoObservacion;
	}

	public void setMetodoObservacion(String metodoObservacion) {
		this.metodoObservacion = metodoObservacion;
	}

	public String getEvaluacionIncertidumbre() {
		return evaluacionIncertidumbre;
	}

	public void setEvaluacionIncertidumbre(String evaluacionIncertidumbre) {
		this.evaluacionIncertidumbre = evaluacionIncertidumbre;
	}

	public String getDistribucionAsumida() {
		return distribucionAsumida;
	}

	public void setDistribucionAsumida(String distribucionAsumida) {
		this.distribucionAsumida = distribucionAsumida;
	}

	@Override
	public void setInfo(String[] datos) {
		// TODO Auto-generated method stub
		setMetodoObservacion(datos[0]);
		setEvaluacionIncertidumbre(datos[1]);
		setDistribucionAsumida(datos[2]);
	}

	@Override
	public String[] getInfo() {
		// TODO Auto-generated method stub
		String[] datos = { getMetodoObservacion(), getEvaluacionIncertidumbre(), getDistribucionAsumida() };
		return datos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(distribucionAsumida, evaluacionIncertidumbre, metodoObservacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoA other = (TipoA) obj;
		return Objects.equals(distribucionAsumida, other.distribucionAsumida)
				&& Objects.equals(evaluacionIncertidumbre, other.evaluacionIncertidumbre)
				&& Objects.equals(metodoObservacion, other.metodoObservacion);
	}

	@Override
	public String toString() {
		return "TipoA [metodoObservacion=" + metodoObservacion + ", evaluacionIncertidumbre=" + evaluacionIncertidumbre
				+ ", distribucionAsumida=" + distribucionAsumida + "]";
	}

}
