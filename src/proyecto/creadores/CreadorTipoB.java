package proyecto.creadores;

import proyecto.concretos.TipoB;

public class CreadorTipoB extends CreadorTipoMagnitud {

	@Override
	public ITipoMagnitud crearTipoMagnitud() {
		// TODO Auto-generated method stub
		return new TipoB();
	}

	@Override
	public String toString() {
		return "CreadorTipoB []";
	}

}
