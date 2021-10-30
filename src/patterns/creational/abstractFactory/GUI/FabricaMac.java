package patterns.creational.abstractFactory.GUI;

public class FabricaMac implements FabricaGUI {

	@Override
	public Boton crearBoton() {
		// TODO Auto-generated method stub
		return new BotonMac();
	}

	@Override
	public CasillaVerificacion crearCasillaVerificacion() {
		// TODO Auto-generated method stub
		return new CasillaVerificacionMac();
	}

	@Override
	public Etiqueta crearEtiqueta() {
		// TODO Auto-generated method stub
		return new EtiquetaMac();
	}

}
