package proyecto;

public class CreadorTipoA extends CreadorTipo {

	@Override
	public ITipoMagnitud crearTipo() {
		// TODO Auto-generated method stub
		return new TipoA();
	}

}
