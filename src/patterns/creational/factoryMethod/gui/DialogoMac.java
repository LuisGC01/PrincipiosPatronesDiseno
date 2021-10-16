package patterns.creational.factoryMethod.gui;

public class DialogoMac extends Dialogo {

	@Override
	public Boton createBoton() {
		// TODO Auto-generated method stub
		return new BotonMac();
	}

}
