package patterns.creational.abstractFactory.GUI;

public class EtiquetaWindows implements Etiqueta {

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		System.out.println("Se pinta etiqueta en Windows");
	}

	@Override
	public void setTexto(String t) {
		// TODO Auto-generated method stub
		System.out.println("Se pinta el texto en etiqueta Windows: "+t);
	}


}
