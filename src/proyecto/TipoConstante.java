package proyecto;

public class TipoConstante implements ITipo {

	private int id;
	private double valor;

	public TipoConstante() {
		// TODO Auto-generated constructor stub
	}

	public TipoConstante(int id, double valor) {
		this.id = id;
		this.valor = valor;
	}

	public TipoConstante(double valor) {
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		String[] datos = { getId() + "", getValor() + "" };
		return datos;
	}

}
