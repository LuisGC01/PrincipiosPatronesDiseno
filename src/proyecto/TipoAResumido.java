package proyecto;

public class TipoAResumido implements ITipoMagnitud {

	private String evaluacionIncertidumbre;
	private String distribucionAsumida;

	public TipoAResumido() {
		// TODO Auto-generated constructor stub
	}

	public TipoAResumido(String evaluacionIncertidumbre, String distribucionAsumida) {
		this.evaluacionIncertidumbre = evaluacionIncertidumbre;
		this.distribucionAsumida = distribucionAsumida;
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
		setEvaluacionIncertidumbre(datos[0]);
		setDistribucionAsumida(datos[1]);
	}

	@Override
	public String[] getInfo() {
		// TODO Auto-generated method stub
		String[] datos = { getEvaluacionIncertidumbre(), getDistribucionAsumida() };
		return datos;
	}

}
