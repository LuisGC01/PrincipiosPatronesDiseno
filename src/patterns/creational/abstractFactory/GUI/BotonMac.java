package patterns.creational.abstractFactory.GUI;

public class BotonMac implements Boton {

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		System.out.println("Se pinta boton en Mac");
	}

	@Override
	public void setTexto(String t) {
		// TODO Auto-generated method stub
		System.out.println("Se pinta el texto en boton Mac: "+t);
	}

}
