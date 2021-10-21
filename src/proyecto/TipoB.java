package proyecto;

public class TipoB implements ITipo {

	private int id;
	private String distribucionAsumida;

	public TipoB() {
		// TODO Auto-generated constructor stub
	}

	public TipoB(int id, String distribucionAsumida) {
		this.id = id;
		this.distribucionAsumida = distribucionAsumida;
	}

	public TipoB(String distribucionAsumida) {
		this.distribucionAsumida = distribucionAsumida;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		String[] datos = { getId() + "", getDistribucionAsumida() };
		return datos;
	}

}
