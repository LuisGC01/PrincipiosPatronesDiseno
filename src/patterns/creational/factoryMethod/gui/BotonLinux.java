package patterns.creational.factoryMethod.gui;

public class BotonLinux implements Boton {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Click en Linux");
	}

	@Override
	public void dClick() {
		// TODO Auto-generated method stub
		System.out.println("doble Click en Linux");
	}

	@Override
	public void focus() {
		// TODO Auto-generated method stub
		System.out.println("se ilumina en Linux");
	}

}
