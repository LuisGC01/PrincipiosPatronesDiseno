package proyecto;

public class CreadorTipoAResumido extends CreadorTipo {

	@Override
	public ITipoMagnitud crearTipo() {
		// TODO Auto-generated method stub
		return new TipoAResumido();
	}

}
