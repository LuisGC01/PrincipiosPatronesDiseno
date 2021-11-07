package proyecto;

import java.util.Objects;

import proyecto.creadores.CreadorTipoA;
import proyecto.creadores.CreadorTipoAResumido;
import proyecto.creadores.CreadorTipoB;
import proyecto.creadores.CreadorTipoConstante;
import proyecto.creadores.CreadorTipoMagnitud;
import proyecto.creadores.ITipoMagnitud;

public class MagnitudDetalle implements IManejoBaseDatos {
	private int id;
	private String tipo;
	private String descripcion;
	private ITipoMagnitud info;

	public MagnitudDetalle() {
		// TODO Auto-generated constructor stub
	}

	public MagnitudDetalle(int id, String tipo, String descripcion, ITipoMagnitud info) {
		this.id = id;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.info = info;
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

	public ITipoMagnitud getInfo() {
		return info;
	}

	public void setInfo(ITipoMagnitud info) {
		this.info = info;
	}

	public void seleccionTipo(String t) {
		// Se pondran como null los atributos que no tengan que ver con el tipo
		// seleccionado
		CreadorTipoMagnitud creadorTipo = iniCreaTipo(t);
		if (creadorTipo != null) {
			this.info = creadorTipo.crearTipoMagnitud();
		}
	}

	private CreadorTipoMagnitud iniCreaTipo(String t) {
		if (t.equals("Tipo A")) {
			return new CreadorTipoA();
		} else if (t.equals("Tipo A Resumido")) {
			return new CreadorTipoAResumido();
		} else if (t.equals("Tipo B")) {
			return new CreadorTipoB();
		} else if (t.equals("Constante")) {
			return new CreadorTipoConstante();
		} else {
			return null;
		}
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
	public int hashCode() {
		return Objects.hash(descripcion, id, info, tipo);
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
		return Objects.equals(descripcion, other.descripcion) && id == other.id && Objects.equals(info, other.info)
				&& Objects.equals(tipo, other.tipo);
	}

	@Override
	public String toString() {
		return "MagnitudDetalle [id=" + id + ", tipo=" + tipo + ", descripcion=" + descripcion + ", info=" + info + "]";
	}

}
