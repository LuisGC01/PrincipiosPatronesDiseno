package proyecto.creadores;

import proyecto.concretos.PuntoDialogo;

public class CreadorPuntoDialogo extends CreadorTipoPunto {

	@Override
	public ITipoPunto crearTipoPunto() {
		// TODO Auto-generated method stub
		return new PuntoDialogo();
	}

	@Override
	public String toString() {
		return "CreadorPuntoDialogo []";
	}

}
