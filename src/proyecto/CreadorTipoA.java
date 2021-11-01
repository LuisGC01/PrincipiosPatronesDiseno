package proyecto;

public class CreadorTipoA extends CreadorTipoMagnitud {

	@Override
	public ITipoMagnitud crearTipo() {
		// TODO Auto-generated method stub
		return new TipoA();
	}

}
