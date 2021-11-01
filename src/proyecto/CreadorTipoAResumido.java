package proyecto;

public class CreadorTipoAResumido extends CreadorTipoMagnitud {

	@Override
	public ITipoMagnitud crearTipo() {
		// TODO Auto-generated method stub
		return new TipoAResumido();
	}

}
