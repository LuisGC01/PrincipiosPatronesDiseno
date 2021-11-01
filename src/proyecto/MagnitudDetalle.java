package proyecto;

import java.util.Objects;

public class MagnitudDetalle implements IManejoBaseDatos {
	private int id;
	private String tipo;
	private String descripcion;
	private ITipoMagnitud info;

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

	public ITipoMagnitud getInfo() {
		return info;
	}

	public void setInfo(ITipoMagnitud info) {
		this.info = info;
	}

	public void seleccionTipo(String t) {
		// Se pondran como null los atributos que no tengan que ver con el tipo
		// seleccionado
		CreadorTipo creadorTipo;

		creadorTipo = iniCreaTipo(t);

		this.info = creadorTipo.crearTipo();
	}

	private CreadorTipo iniCreaTipo(String t) {
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

}
