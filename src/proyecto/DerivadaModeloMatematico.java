package proyecto;

import java.util.Objects;

public class DerivadaModeloMatematico implements IManejoBaseDatos {
	private int id;
	private String derivadaParcial;
	private String derivadaRespectoA;

	public DerivadaModeloMatematico() {
		// TODO Auto-generated constructor stub
	}

	public DerivadaModeloMatematico(int id, String derivadaParcial, String derivadaRespectoA) {
		this.id = id;
		this.derivadaParcial = derivadaParcial;
		this.derivadaRespectoA = derivadaRespectoA;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDerivadaParcial() {
		return derivadaParcial;
	}

	public void setDerivadaParcial(String derivadaParcial) {
		this.derivadaParcial = derivadaParcial;
	}

	public String getDerivadaRespectoA() {
		return derivadaRespectoA;
	}

	public void setDerivadaRespectoA(String derivadaRespectoA) {
		this.derivadaRespectoA = derivadaRespectoA;
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
		return Objects.hash(derivadaParcial, derivadaRespectoA, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DerivadaModeloMatematico other = (DerivadaModeloMatematico) obj;
		return Objects.equals(derivadaParcial, other.derivadaParcial)
				&& Objects.equals(derivadaRespectoA, other.derivadaRespectoA) && id == other.id;
	}

	@Override
	public String toString() {
		return "DerivadaModeloMatematico [id=" + id + ", derivadaParcial=" + derivadaParcial + ", derivadaRespectoA="
				+ derivadaRespectoA + "]";
	}

}
