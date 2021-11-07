package proyecto.concretos;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoConstante other = (TipoConstante) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	@Override
	public String toString() {
		return "TipoConstante [valor=" + valor + "]";
	}

}
