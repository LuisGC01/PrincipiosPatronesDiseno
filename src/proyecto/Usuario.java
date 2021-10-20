package proyecto;
import java.util.Objects;

public class Usuario implements IManejoBaseDatos {
	private int id;
	private String nombreUsuario;
	private String password;
	private String puesto;
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private boolean activo;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
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
		Usuario other = (Usuario) obj;
		return activo == other.activo && Objects.equals(apellidoM, other.apellidoM)
				&& Objects.equals(apellidoP, other.apellidoP) && id == other.id && Objects.equals(nombre, other.nombre)
				&& Objects.equals(nombreUsuario, other.nombreUsuario) && Objects.equals(password, other.password)
				&& Objects.equals(puesto, other.puesto);
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombreUsuario=" + nombreUsuario + ", password=" + password + ", puesto="
				+ puesto + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", activo="
				+ activo + "]";
	}

}
