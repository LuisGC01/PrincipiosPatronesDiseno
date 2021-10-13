package abstraccion.gato;

public class Croquetas implements Food {
	private double nutrition;
	private String marca;



	public Croquetas(double nutrition, String marca) {
		this.nutrition = nutrition;
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setNutrition(double nutrition) {
		this.nutrition = nutrition;
	}

	@Override
	public double getNutrition() {
		// TODO Auto-generated method stub
		return this.nutrition;
	}

}
