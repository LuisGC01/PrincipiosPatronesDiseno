package patterns.creational.abstractFactory.GUI;

public class CasillaVerificacionWindows implements CasillaVerificacion {

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		System.out.println("Se pinta casilla de verificacion en Windows");
	}

	@Override
	public void setTexto(String t) {
		// TODO Auto-generated method stub
		System.out.println("Se pinta el texto en casilla de verificacion Windows: "+t);
	}

}
