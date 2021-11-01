package proyecto;

public class CreadorTipoConstante extends CreadorTipoMagnitud {

	@Override
	public ITipoMagnitud crearTipo() {
		// TODO Auto-generated method stub
		return new TipoConstante();
	}

}
