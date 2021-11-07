package proyecto;

import java.util.Arrays;
import java.util.Objects;

public class ModeloMatematico implements IManejoBaseDatos {
	private int id;
	private String ecuacion;
	private MagnitudArreglo[] magnitudes;
	private DerivadaModeloMatematico[] derivadas;

	public ModeloMatematico() {
		// TODO Auto-generated constructor stub
	}

	public ModeloMatematico(int id, String ecuacion, MagnitudArreglo[] magnitudes,
			DerivadaModeloMatematico[] derivadas) {
		this.id = id;
		this.ecuacion = ecuacion;
		this.magnitudes = magnitudes;
		this.derivadas = derivadas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEcuacion() {
		return ecuacion;
	}

	public void setEcuacion(String ecuacion) {
		this.ecuacion = ecuacion;
	}

	public MagnitudArreglo[] getMagnitudes() {
		return magnitudes;
	}

	public void setMagnitudes(MagnitudArreglo[] magnitudes) {
		this.magnitudes = magnitudes;
	}

	public DerivadaModeloMatematico[] getDerivadas() {
		return derivadas;
	}

	public void setDerivadas(DerivadaModeloMatematico[] derivadas) {
		this.derivadas = derivadas;
	}

	public void obtenerMagnitudes() {
		// se obtiene las magnitudes de la ecuacion
	}

	public void obtenerDerivadas() {
		// Se obtienen derivadas parciales con cada variable de la ecuacion
	}

	@Override
	public void crear() {
		// TODO Auto-generated method stub
		// Se crea nuevo elemento en la base de datos
	}

	@Override
	public void cargar(int id) {
		// TODO Auto-generated method stub
		// Se obtiene informacion de la base de datos y se guardan en los atributos
	}

	@Override
	public void modificar(int id) {
		// TODO Auto-generated method stub
		// Se actualiza la informacion que se encontraba en la base de datos
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		// Se elimina el registro en la base de datos
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(derivadas);
		result = prime * result + Arrays.hashCode(magnitudes);
		result = prime * result + Objects.hash(ecuacion, id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModeloMatematico other = (ModeloMatematico) obj;
		return Arrays.equals(derivadas, other.derivadas) && Objects.equals(ecuacion, other.ecuacion) && id == other.id
				&& Arrays.equals(magnitudes, other.magnitudes);
	}

	@Override
	public String toString() {
		return "ModeloMatematico [id=" + id + ", ecuacion=" + ecuacion + ", magnitudes=" + Arrays.toString(magnitudes)
				+ ", derivadas=" + Arrays.toString(derivadas) + "]";
	}

}
