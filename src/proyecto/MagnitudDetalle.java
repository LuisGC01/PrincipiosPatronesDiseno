package proyecto;
import java.util.Objects;

public class MagnitudDetalle implements IManejoBaseDatos {
	private int id;
	private String tipo;
	private String descripcion;
	private String distribucionAsumida;
	private String evaluacionIncertidumbre;
	private String metodoObservacion;
	public double valor;

	public MagnitudDetalle() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDistribucionAsumida() {
		return distribucionAsumida;
	}

	public void setDistribucionAsumida(String distribucionAsumida) {
		this.distribucionAsumida = distribucionAsumida;
	}

	public String getEvaluacionIncertidumbre() {
		return evaluacionIncertidumbre;
	}

	public void setEvaluacionIncertidumbre(String evaluacionIncertidumbre) {
		this.evaluacionIncertidumbre = evaluacionIncertidumbre;
	}

	public String getMetodoObservacion() {
		return metodoObservacion;
	}

	public void setMetodoObservacion(String metodoObservacion) {
		this.metodoObservacion = metodoObservacion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void seleccionTipo(String t) {
		// Se pondran como null los atributos que no tengan que ver con el tipo
		// seleccionado
	}

	public void seleccionEvaluacionIncertidumbre(String e) {
		// Se pondran como null los atributos que no tengan que ver con el tipo
		// seleccionado
	}

	public void deteccionConstante(String c) {
		// Se determinara si es una constante estandar para precargar su valor
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MagnitudDetalle other = (MagnitudDetalle) obj;
		return Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(distribucionAsumida, other.distribucionAsumida)
				&& Objects.equals(evaluacionIncertidumbre, other.evaluacionIncertidumbre) && id == other.id
				&& Objects.equals(metodoObservacion, other.metodoObservacion) && Objects.equals(tipo, other.tipo)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	@Override
	public String toString() {
		return "MagnitudDetalle [id=" + id + ", tipo=" + tipo + ", descripcion=" + descripcion
				+ ", distribucionAsumida=" + distribucionAsumida + ", evaluacionIncertidumbre="
				+ evaluacionIncertidumbre + ", metodoObservacion=" + metodoObservacion + ", valor=" + valor + "]";
	}

}
