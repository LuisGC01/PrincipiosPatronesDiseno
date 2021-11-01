package proyecto.concretos;

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

}
