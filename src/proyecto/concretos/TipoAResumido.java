package proyecto.concretos;

import java.util.Objects;

import proyecto.creadores.ITipoMagnitud;

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

	@Override
	public int hashCode() {
		return Objects.hash(distribucionAsumida, evaluacionIncertidumbre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoAResumido other = (TipoAResumido) obj;
		return Objects.equals(distribucionAsumida, other.distribucionAsumida)
				&& Objects.equals(evaluacionIncertidumbre, other.evaluacionIncertidumbre);
	}

	@Override
	public String toString() {
		return "TipoAResumido [evaluacionIncertidumbre=" + evaluacionIncertidumbre + ", distribucionAsumida="
				+ distribucionAsumida + "]";
	}

}
