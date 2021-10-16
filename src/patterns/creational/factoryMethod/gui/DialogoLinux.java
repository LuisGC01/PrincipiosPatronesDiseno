package patterns.creational.factoryMethod.gui;

public class DialogoLinux extends Dialogo {

	@Override
	public Boton createBoton() {
		// TODO Auto-generated method stub
		return new BotonLinux();
	}

}
