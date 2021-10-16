package patterns.creational.factoryMethod.gui;

public class BotonWin implements Boton {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Click en Win");

	}

	@Override
	public void dClick() {
		// TODO Auto-generated method stub
		System.out.println("doble Click en Win");

	}

	@Override
	public void focus() {
		System.out.println("focus en Win");

	}

}
