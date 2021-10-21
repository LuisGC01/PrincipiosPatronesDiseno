package proyecto;

public class CreadorTipoA extends CreadorTipo {

	@Override
	public ITipo crearTipo() {
		// TODO Auto-generated method stub
		return new TipoA();
	}

}
