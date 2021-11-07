package proyecto;

import java.util.Date;
import java.util.Objects;

public class ArregloMedicion implements IManejoBaseDatos {
	private int id;
	private String tituloArregloMedicion;
	private Date fechaAlta;
	private Usuario usarioDefine;
	private String version;
	private String descripcion;
	private String formatoCalCert;
	private Imagen imagen;
	private ModeloMatematico modelo;

	public ArregloMedicion() {
		// TODO Auto-generated constructor stub
	}

	public ArregloMedicion(int id, String tituloArregloMedicion, Date fechaAlta, Usuario usarioDefine, String version,
			String descripcion, String formatoCalCert, Imagen imagen, ModeloMatematico modelo) {
		this.id = id;
		this.tituloArregloMedicion = tituloArregloMedicion;
		this.fechaAlta = fechaAlta;
		this.usarioDefine = usarioDefine;
		this.version = version;
		this.descripcion = descripcion;
		this.formatoCalCert = formatoCalCert;
		this.imagen = imagen;
		this.modelo = modelo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTituloArregloMedicion() {
		return tituloArregloMedicion;
	}

	public void setTituloArregloMedicion(String tituloArregloMedicion) {
		this.tituloArregloMedicion = tituloArregloMedicion;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Usuario getUsarioDefine() {
		return usarioDefine;
	}

	public void setUsarioDefine(Usuario usarioDefine) {
		this.usarioDefine = usarioDefine;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFormatoCalCert() {
		return formatoCalCert;
	}

	public void setFormatoCalCert(String formatoCalCert) {
		this.formatoCalCert = formatoCalCert;
	}

	public Imagen getImagen() {
		return imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

	public ModeloMatematico getModelo() {
		return modelo;
	}

	public void setModelo(ModeloMatematico modelo) {
		this.modelo = modelo;
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
		return Objects.hash(descripcion, fechaAlta, formatoCalCert, id, imagen, modelo, tituloArregloMedicion,
				usarioDefine, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArregloMedicion other = (ArregloMedicion) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(fechaAlta, other.fechaAlta)
				&& Objects.equals(formatoCalCert, other.formatoCalCert) && id == other.id
				&& Objects.equals(imagen, other.imagen) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(tituloArregloMedicion, other.tituloArregloMedicion)
				&& Objects.equals(usarioDefine, other.usarioDefine) && Objects.equals(version, other.version);
	}

	@Override
	public String toString() {
		return "ArregloMedicion [id=" + id + ", tituloArregloMedicion=" + tituloArregloMedicion + ", fechaAlta="
				+ fechaAlta + ", usarioDefine=" + usarioDefine + ", version=" + version + ", descripcion=" + descripcion
				+ ", formatoCalCert=" + formatoCalCert + ", imagen=" + imagen + ", modelo=" + modelo + "]";
	}

}
