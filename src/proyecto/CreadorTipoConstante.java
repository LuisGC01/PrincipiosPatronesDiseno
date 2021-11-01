package proyecto;

public class CreadorTipoConstante extends CreadorTipo {

	@Override
	public ITipoMagnitud crearTipo() {
		// TODO Auto-generated method stub
		return new TipoConstante();
	}

}
