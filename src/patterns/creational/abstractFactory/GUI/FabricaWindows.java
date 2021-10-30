package patterns.creational.abstractFactory.GUI;

public class FabricaWindows implements FabricaGUI {

	@Override
	public Boton crearBoton() {
		// TODO Auto-generated method stub
		return new BotonWindows();
	}

	@Override
	public CasillaVerificacion crearCasillaVerificacion() {
		// TODO Auto-generated method stub
		return new CasillaVerificacionWindows();
	}

	@Override
	public Etiqueta crearEtiqueta() {
		// TODO Auto-generated method stub
		return new EtiquetaWindows();
	}

}
