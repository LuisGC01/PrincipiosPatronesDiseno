package patterns.creational.abstractFactory.GUI;

public class FabricaLinux implements FabricaGUI {

	@Override
	public Boton crearBoton() {
		// TODO Auto-generated method stub
		return new BotonLinux();
	}

	@Override
	public CasillaVerificacion crearCasillaVerificacion() {
		// TODO Auto-generated method stub
		return new CasillaVerificacionLinux();
	}

	@Override
	public Etiqueta crearEtiqueta() {
		// TODO Auto-generated method stub
		return new EtiquetaLinux();
	}

}
