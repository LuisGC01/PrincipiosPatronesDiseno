package solid.liskov.figuras;

public class Circulo extends Elipse {

	public Circulo(double radio) {
		super(radio, radio);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI*this.getRadioMayor()*this.getRadioMayor();
	}

}
