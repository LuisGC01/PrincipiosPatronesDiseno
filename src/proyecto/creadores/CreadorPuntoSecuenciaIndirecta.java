package proyecto.creadores;

import proyecto.concretos.PuntoSecuenciaIndirecta;

public class CreadorPuntoSecuenciaIndirecta extends CreadorTipoPunto {

	@Override
	public ITipoPunto crearTipoPunto() {
		// TODO Auto-generated method stub
		return new PuntoSecuenciaIndirecta();
	}

}
