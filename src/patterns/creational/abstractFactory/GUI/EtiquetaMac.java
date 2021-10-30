package patterns.creational.abstractFactory.GUI;

public class EtiquetaMac implements Etiqueta {

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		System.out.println("Se pinta etiqueta en Mac");
	}

	@Override
	public void setTexto(String t) {
		// TODO Auto-generated method stub
		System.out.println("Se pinta el texto en etiqueta Mac: "+t);
	}


}
