package proyecto.concretos;

import proyecto.creadores.ITipoMagnitud;

public class TipoConstante implements ITipoMagnitud {

	private double valor;

	public TipoConstante() {
		// TODO Auto-generated constructor stub
	}

	public TipoConstante(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public void setInfo(String[] datos) {
		// TODO Auto-generated method stub
		setValor(Double.parseDouble(datos[0]));
	}

	@Override
	public String[] getInfo() {
		// TODO Auto-generated method stub
		String[] datos = { getValor() + "" };
		return datos;
	}

}
