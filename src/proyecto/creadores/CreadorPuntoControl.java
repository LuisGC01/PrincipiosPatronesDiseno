package proyecto.creadores;

import proyecto.concretos.PuntoControl;

public class CreadorPuntoControl extends CreadorTipoPunto {

	@Override
	public ITipoPunto crearTipoPunto() {
		// TODO Auto-generated method stub
		return new PuntoControl();
	}

}
