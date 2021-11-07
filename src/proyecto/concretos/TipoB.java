package proyecto.concretos;

import java.util.Objects;

import proyecto.creadores.ITipoMagnitud;

public class TipoB implements ITipoMagnitud {

	private String distribucionAsumida;

	public TipoB() {
		// TODO Auto-generated constructor stub
	}

	public TipoB(String distribucionAsumida) {
		this.distribucionAsumida = distribucionAsumida;
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
		setDistribucionAsumida(datos[0]);
	}

	@Override
	public String[] getInfo() {
		// TODO Auto-generated method stub
		String[] datos = { getDistribucionAsumida() };
		return datos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(distribucionAsumida);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoB other = (TipoB) obj;
		return Objects.equals(distribucionAsumida, other.distribucionAsumida);
	}

	@Override
	public String toString() {
		return "TipoB [distribucionAsumida=" + distribucionAsumida + "]";
	}

}
