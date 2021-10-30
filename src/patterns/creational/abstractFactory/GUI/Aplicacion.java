package patterns.creational.abstractFactory.GUI;

public class Aplicacion {
	private Boton boton;
	private CasillaVerificacion casillaVerificacion;
	private Etiqueta etiqueta;

	public Aplicacion(FabricaGUI f) {
		// TODO Auto-generated constructor stub
		boton = f.crearBoton();
		casillaVerificacion = f.crearCasillaVerificacion();
		etiqueta = f.crearEtiqueta();
	}

	public void pintar() {
		boton.pintar();
		casillaVerificacion.pintar();
		etiqueta.pintar();
	}

	public void setTextoBoton(String s) {
		boton.setTexto(s);
	}

	public void setTextoCasillaVerificacion(String s) {
		casillaVerificacion.setTexto(s);
	}

	public void setTextoEtiqueta(String s) {
		etiqueta.setTexto(s);
	}

}
