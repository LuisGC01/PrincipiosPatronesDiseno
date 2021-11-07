package proyecto.creadores;

import proyecto.concretos.TipoConstante;

public class CreadorTipoConstante extends CreadorTipoMagnitud {

	@Override
	public ITipoMagnitud crearTipoMagnitud() {
		// TODO Auto-generated method stub
		return new TipoConstante();
	}

	@Override
	public String toString() {
		return "CreadorTipoConstante []";
	}

}
