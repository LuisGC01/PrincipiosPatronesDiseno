package proyecto;
import java.util.Objects;

public class Imagen implements IManejoBaseDatos {
	private int id;
	private String imagen;
	private String leyenda;
	private String descripcion;

	public Imagen() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getLeyenda() {
		return leyenda;
	}

	public void setLeyenda(String leyenda) {
		this.leyenda = leyenda;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
		Imagen other = (Imagen) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(imagen, other.imagen)
				&& Objects.equals(leyenda, other.leyenda);
	}

	@Override
	public String toString() {
		return "Imagen [imagen=" + imagen + ", leyenda=" + leyenda + ", descripcion=" + descripcion + "]";
	}

}
