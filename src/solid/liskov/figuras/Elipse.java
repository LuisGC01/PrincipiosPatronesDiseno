package solid.liskov.figuras;

public class Elipse implements Figura {

	private double radioMayor;
	private double radioMenor;

	public Elipse(double radioMayor, double radioMenor) {
		super();
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}

	public double getRadioMayor() {
		return radioMayor;
	}

	public void setRadioMayor(double radioMayor) {
		this.radioMayor = radioMayor;
	}

	public double getRadioMenor() {
		return radioMenor;
	}

	public void setRadioMenor(double radioMenor) {
		this.radioMenor = radioMenor;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub

		return Math.PI * radioMayor * radioMenor;
	}

}
