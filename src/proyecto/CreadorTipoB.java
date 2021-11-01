package proyecto;

public class CreadorTipoB extends CreadorTipoMagnitud {

	@Override
	public ITipoMagnitud crearTipoMagnitud() {
		// TODO Auto-generated method stub
		return new TipoB();
	}

}
