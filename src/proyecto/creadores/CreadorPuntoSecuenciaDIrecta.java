package proyecto.creadores;

import proyecto.concretos.PuntoSecuenciaDIrecta;

public class CreadorPuntoSecuenciaDIrecta extends CreadorTipoPunto {

	@Override
	public ITipoPunto crearTipoPunto() {
		// TODO Auto-generated method stub
		return new PuntoSecuenciaDIrecta();
	}

	@Override
	public String toString() {
		return "CreadorPuntoSecuenciaDIrecta []";
	}

}
