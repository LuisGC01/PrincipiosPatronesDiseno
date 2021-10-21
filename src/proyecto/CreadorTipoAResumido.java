package proyecto;

public class CreadorTipoAResumido extends CreadorTipo {

	@Override
	public ITipo crearTipo() {
		// TODO Auto-generated method stub
		return new TipoAResumido();
	}

}
