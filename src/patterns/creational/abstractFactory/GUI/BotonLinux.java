package patterns.creational.abstractFactory.GUI;

public class BotonLinux implements Boton {

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		System.out.println("Se pinta boton en Linux");
	}

	@Override
	public void setTexto(String t) {
		// TODO Auto-generated method stub
		System.out.println("Se pinta el texto en boton Linux: "+t);
	}

}
