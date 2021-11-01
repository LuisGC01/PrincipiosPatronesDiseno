package proyecto;

public class CreadorTipoConstante extends CreadorTipoMagnitud {

	@Override
	public ITipoMagnitud crearTipoMagnitud() {
		// TODO Auto-generated method stub
		return new TipoConstante();
	}

}
