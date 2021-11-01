package proyecto;

public class CreadorTipoAResumido extends CreadorTipoMagnitud {

	@Override
	public ITipoMagnitud crearTipoMagnitud() {
		// TODO Auto-generated method stub
		return new TipoAResumido();
	}

}
