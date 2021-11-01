package proyecto.concretos;

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

}
