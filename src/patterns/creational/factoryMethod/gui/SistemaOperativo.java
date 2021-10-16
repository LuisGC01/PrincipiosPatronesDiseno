package patterns.creational.factoryMethod.gui;

public class SistemaOperativo {
	
	String nombre;
	
	Dialogo d;
	Boton b;
	
	public SistemaOperativo(String n) {
		// TODO Auto-generated constructor stub
		nombre = n;
		generarDialogo();
	}
	
	public void generarDialogo() {
		if (nombre.equals("win")) {
			d = new DialogoWin();
		} else if (nombre.equals("linux")) {
			d = new DialogoLinux();
		}else if(nombre.equals("mac")) {
			d = new DialogoMac();
		}
		b = d.createBoton();
	}
	
	public void usarBotones() {
		b.click();
		b.dClick();
		b.focus();
	}

}
