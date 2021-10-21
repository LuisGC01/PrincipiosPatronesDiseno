package proyecto;

public class CreadorTipoConstante extends CreadorTipo {

	@Override
	public ITipo crearTipo() {
		// TODO Auto-generated method stub
		return new TipoConstante();
	}

}
