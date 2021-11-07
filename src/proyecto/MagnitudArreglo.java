package proyecto;
import java.util.Objects;

public class MagnitudArreglo implements IManejoBaseDatos {
	private int id;
	private String magnitud;
	private String unidad;
	private String definicion;
	private boolean capturar;
	private boolean repetir;
	private String asociado;
	private MagnitudDetalle magnitudDetalle;
	private Imagen imagen;

	public MagnitudArreglo() {
		// TODO Auto-generated constructor stub
	}

	public MagnitudArreglo(int id, String magnitud, String unidad, String definicion, boolean capturar, boolean repetir,
			String asociado, MagnitudDetalle magnitudDetalle, Imagen imagen) {
		this.id = id;
		this.magnitud = magnitud;
		this.unidad = unidad;
		this.definicion = definicion;
		this.capturar = capturar;
		this.repetir = repetir;
		this.asociado = asociado;
		this.magnitudDetalle = magnitudDetalle;
		this.imagen = imagen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMagnitud() {
		return magnitud;
	}

	public void setMagnitud(String magnitud) {
		this.magnitud = magnitud;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getDefinicion() {
		return definicion;
	}

	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

	public boolean isCapturar() {
		return capturar;
	}

	public void setCapturar(boolean capturar) {
		this.capturar = capturar;
	}

	public boolean isRepetir() {
		return repetir;
	}

	public void setRepetir(boolean repetir) {
		this.repetir = repetir;
	}

	public String getAsociado() {
		return asociado;
	}

	public void setAsociado(String asociado) {
		this.asociado = asociado;
	}

	public MagnitudDetalle getMagnitudDetalle() {
		return magnitudDetalle;
	}

	public void setMagnitudDetalle(MagnitudDetalle magnitudDetalle) {
		this.magnitudDetalle = magnitudDetalle;
	}

	public Imagen getImagen() {
		return imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

	public void detectarOperando(String m) {
		// Determina si es un operando o el resultado, dependiendo de su ubicacione en
		// la ecuacion
		// porque la varible de resultado no funciona igual que los operandos de la
		// ecuacion
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
		return Objects.hash(asociado, capturar, definicion, id, imagen, magnitud, magnitudDetalle, repetir, unidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MagnitudArreglo other = (MagnitudArreglo) obj;
		return Objects.equals(asociado, other.asociado) && capturar == other.capturar
				&& Objects.equals(definicion, other.definicion) && id == other.id
				&& Objects.equals(imagen, other.imagen) && Objects.equals(magnitud, other.magnitud)
				&& Objects.equals(magnitudDetalle, other.magnitudDetalle) && repetir == other.repetir
				&& Objects.equals(unidad, other.unidad);
	}

	@Override
	public String toString() {
		return "MagnitudArreglo [id=" + id + ", magnitud=" + magnitud + ", unidad=" + unidad + ", definicion="
				+ definicion + ", capturar=" + capturar + ", repetir=" + repetir + ", asociado=" + asociado
				+ ", magnitudDetalle=" + magnitudDetalle + ", imagen=" + imagen + "]";
	}



}
