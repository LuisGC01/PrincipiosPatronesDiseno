package proyecto.creadores;

public abstract class CreadorTipoMagnitud {
	
	public abstract ITipoMagnitud crearTipoMagnitud();

	@Override
	public String toString() {
		return "CreadorTipoMagnitud []";
	}

}
