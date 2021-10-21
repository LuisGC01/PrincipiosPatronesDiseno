package proyecto;

public class TipoAResumido implements ITipo {

	private int id;
	private String evaluacionIncertidumbre;
	private String distribucionAsumida;

	public TipoAResumido() {
		// TODO Auto-generated constructor stub
	}

	public TipoAResumido(int id, String evaluacionIncertidumbre, String distribucionAsumida) {
		this.id = id;
		this.evaluacionIncertidumbre = evaluacionIncertidumbre;
		this.distribucionAsumida = distribucionAsumida;
	}

	public TipoAResumido(String evaluacionIncertidumbre, String distribucionAsumida) {
		this.evaluacionIncertidumbre = evaluacionIncertidumbre;
		this.distribucionAsumida = distribucionAsumida;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		String[] datos = { getId() + "", getEvaluacionIncertidumbre(), getDistribucionAsumida() };
		return datos;
	}

}
