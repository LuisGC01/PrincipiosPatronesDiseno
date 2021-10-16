package patterns.creational.factoryMethod.gui;

public class DialogoWin extends Dialogo {

	@Override
	public Boton createBoton() {
		// TODO Auto-generated method stub
		return new BotonWin();
	}

}
