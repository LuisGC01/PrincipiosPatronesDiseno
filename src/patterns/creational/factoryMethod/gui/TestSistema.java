package patterns.creational.factoryMethod.gui;

public class TestSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SistemaOperativo win = new SistemaOperativo("win");
		win.usarBotones();
		
		SistemaOperativo linux = new SistemaOperativo("linux");
		linux.usarBotones();

		SistemaOperativo mac = new SistemaOperativo("mac");
		mac.usarBotones();
		

	}

}
