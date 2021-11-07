package proyecto.creadores;

import proyecto.concretos.TipoA;

public class CreadorTipoA extends CreadorTipoMagnitud {

	@Override
	public ITipoMagnitud crearTipoMagnitud() {
		// TODO Auto-generated method stub
		return new TipoA();
	}

	@Override
	public String toString() {
		return "CreadorTipoA []";
	}

}
