package proyecto;

public class CreadorTipoB extends CreadorTipoMagnitud {

	@Override
	public ITipoMagnitud crearTipo() {
		// TODO Auto-generated method stub
		return new TipoB();
	}

}
