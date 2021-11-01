package proyecto;

import java.util.Objects;

import proyecto.creadores.CreadorPuntoControl;
import proyecto.creadores.CreadorPuntoDialogo;
import proyecto.creadores.CreadorPuntoSecuenciaDIrecta;
import proyecto.creadores.CreadorPuntoSecuenciaIndirecta;
import proyecto.creadores.CreadorTipoPunto;
import proyecto.creadores.ITipoPunto;

public class SecuenciaDetalle implements IManejoBaseDatos {
	private int id;
	private int numeroPuntoSecuencia;
	private char tipoPunto;
	private String descripcionPunto;
	private ArregloMedicion arreglo;
	private ITipoPunto punto;

	public SecuenciaDetalle() {
		// TODO Auto-generated constructor stub
	}

	public SecuenciaDetalle(int id, int numeroPuntoSecuencia, char tipoPunto, String descripcionPunto,
			ArregloMedicion arreglo, ITipoPunto punto) {
		this.id = id;
		this.numeroPuntoSecuencia = numeroPuntoSecuencia;
		this.tipoPunto = tipoPunto;
		this.descripcionPunto = descripcionPunto;
		this.arreglo = arreglo;
		this.punto = punto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroPuntoSecuencia() {
		return numeroPuntoSecuencia;
	}

	public void setNumeroPuntoSecuencia(int numeroPuntoSecuencia) {
		this.numeroPuntoSecuencia = numeroPuntoSecuencia;
	}

	public char getTipoPunto() {
		return tipoPunto;
	}

	public void setTipoPunto(char tipoPunto) {
		this.tipoPunto = tipoPunto;
	}

	public String getDescripcionPunto() {
		return descripcionPunto;
	}

	public void setDescripcionPunto(String descripcionPunto) {
		this.descripcionPunto = descripcionPunto;
	}

	public ArregloMedicion getArreglo() {
		return arreglo;
	}

	public void setArreglo(ArregloMedicion arreglo) {
		this.arreglo = arreglo;
	}

	public ITipoPunto getPunto() {
		return punto;
	}

	public void setPunto(ITipoPunto punto) {
		this.punto = punto;
	}

	public void iniDetallePunto() {
		CreadorTipoPunto creadorTipoPunto = iniCreaTipo();
		if (creadorTipoPunto != null) {
			punto = creadorTipoPunto.crearTipoPunto();
		}
	}

	private CreadorTipoPunto iniCreaTipo() {
		if (tipoPunto == 'D') {
			return new CreadorPuntoDialogo();
		} else if (tipoPunto == 'C') {
			return new CreadorPuntoControl();
		} else if (tipoPunto == 'S') {
			return new CreadorPuntoSecuenciaDIrecta();
		} else if (tipoPunto == 'I') {
			return new CreadorPuntoSecuenciaIndirecta();
		} else {
			return null;
		}
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
		SecuenciaDetalle other = (SecuenciaDetalle) obj;
		return Objects.equals(arreglo, other.arreglo) && Objects.equals(descripcionPunto, other.descripcionPunto)
				&& id == other.id && numeroPuntoSecuencia == other.numeroPuntoSecuencia && tipoPunto == other.tipoPunto;
	}

	@Override
	public String toString() {
		return "SecuenciaDetalle [id=" + id + ", numeroPuntoSecuencia=" + numeroPuntoSecuencia + ", tipoPunto="
				+ tipoPunto + ", descripcionPunto=" + descripcionPunto + ", valor=" + ", arreglo=" + arreglo + "]";
	}

}
