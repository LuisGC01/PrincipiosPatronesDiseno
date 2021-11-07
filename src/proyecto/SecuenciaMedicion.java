package proyecto;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class SecuenciaMedicion implements IManejoBaseDatos {
	private int id;
	private String titulo;
	private String descripcion;
	private Usuario usarioDefine;
	private Date fechaDefinicion;
	private SecuenciaDetalle[] detalles;

	public SecuenciaMedicion() {
		// TODO Auto-generated constructor stub
	}

	public SecuenciaMedicion(int id, String titulo, String descripcion, Usuario usarioDefine, Date fechaDefinicion,
			SecuenciaDetalle[] detalles) {
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.usarioDefine = usarioDefine;
		this.fechaDefinicion = fechaDefinicion;
		this.detalles = detalles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Usuario getUsarioDefine() {
		return usarioDefine;
	}

	public void setUsarioDefine(Usuario usarioDefine) {
		this.usarioDefine = usarioDefine;
	}

	public Date getFechaDefinicion() {
		return fechaDefinicion;
	}

	public void setFechaDefinicion(Date fechaDefinicion) {
		this.fechaDefinicion = fechaDefinicion;
	}

	public SecuenciaDetalle[] getDetalles() {
		return detalles;
	}

	public void setDetalles(SecuenciaDetalle[] detalles) {
		this.detalles = detalles;
	}

	public void generarPuntosDialogo(int n) {
		// generacion de puntos a revisar, no necesariamente es obtencion de lecturas
	}

	public void generarPuntosPrecarga(int n, int r, int m, String s) {
		// generacion de puntos para preparar y validar los instrumentos y equipos a
		// usar
		// se generan n puntos distribuidos de 0% a m % repetidos r veces en la
		// secuencia s
	}

	public void generarPunosSecuenciaDirecta(int n, int r, int m, String s) {
		// se generan n puntos distribuidos de 0% a m % repetidos r veces en la
		// secuencia s
	}

	public void generarPuntosSecuenciaIndirecta(String s, int r) {
		// Se generan puntos para la secuencia s con r repeticiones
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
		result = prime * result + Arrays.hashCode(detalles);
		result = prime * result + Objects.hash(descripcion, fechaDefinicion, id, titulo, usarioDefine);
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
		SecuenciaMedicion other = (SecuenciaMedicion) obj;
		return Objects.equals(descripcion, other.descripcion) && Arrays.equals(detalles, other.detalles)
				&& Objects.equals(fechaDefinicion, other.fechaDefinicion) && id == other.id
				&& Objects.equals(titulo, other.titulo) && Objects.equals(usarioDefine, other.usarioDefine);
	}

	@Override
	public String toString() {
		return "SecuenciaMedicion [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", usarioDefine="
				+ usarioDefine + ", fechaDefinicion=" + fechaDefinicion + ", detalles=" + Arrays.toString(detalles)
				+ "]";
	}

}
