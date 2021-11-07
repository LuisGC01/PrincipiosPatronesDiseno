package proyecto.creadores;

public abstract class CreadorTipoPunto {
	public abstract ITipoPunto crearTipoPunto();

	@Override
	public String toString() {
		return "CreadorTipoPunto []";
	}

}
