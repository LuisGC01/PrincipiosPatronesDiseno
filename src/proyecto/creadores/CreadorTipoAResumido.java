package proyecto.creadores;

import proyecto.concretos.TipoAResumido;

public class CreadorTipoAResumido extends CreadorTipoMagnitud {

	@Override
	public ITipoMagnitud crearTipoMagnitud() {
		// TODO Auto-generated method stub
		return new TipoAResumido();
	}

	@Override
	public String toString() {
		return "CreadorTipoAResumido []";
	}

}
