package proyecto;
import java.util.Objects;

public class SecuenciaDetalle implements IManejoBaseDatos {
	private int id;
	private int numeroPuntoSecuencia;
	private char tipoPunto;
	private String descripcionPunto;
	private String valor;
	private String barridoPrincipal;
	private String barridoSecundario;
	private int numeroMediciones;
	private String instrucciones;
	private String comentario;
	private ArregloMedicion arreglo;
	private String dialogoTxt;
	private String dialogoEntrada;
	private String dialogoValidacion;
	private String dialogoMagnitud;

	public SecuenciaDetalle() {
		// TODO Auto-generated constructor stub
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

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getBarridoPrincipal() {
		return barridoPrincipal;
	}

	public void setBarridoPrincipal(String barridoPrincipal) {
		this.barridoPrincipal = barridoPrincipal;
	}

	public String getBarridoSecundario() {
		return barridoSecundario;
	}

	public void setBarridoSecundario(String barridoSecundario) {
		this.barridoSecundario = barridoSecundario;
	}

	public int getNumeroMediciones() {
		return numeroMediciones;
	}

	public void setNumeroMediciones(int numeroMediciones) {
		this.numeroMediciones = numeroMediciones;
	}

	public String getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(String instrucciones) {
		this.instrucciones = instrucciones;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public ArregloMedicion getArreglo() {
		return arreglo;
	}

	public void setArreglo(ArregloMedicion arreglo) {
		this.arreglo = arreglo;
	}

	public String getDialogoTxt() {
		return dialogoTxt;
	}

	public void setDialogoTxt(String dialogoTxt) {
		this.dialogoTxt = dialogoTxt;
	}

	public String getDialogoEntrada() {
		return dialogoEntrada;
	}

	public void setDialogoEntrada(String dialogoEntrada) {
		this.dialogoEntrada = dialogoEntrada;
	}

	public String getDialogoValidacion() {
		return dialogoValidacion;
	}

	public void setDialogoValidacion(String dialogoValidacion) {
		this.dialogoValidacion = dialogoValidacion;
	}

	public String getDialogoMagnitud() {
		return dialogoMagnitud;
	}

	public void setDialogoMagnitud(String dialogoMagnitud) {
		this.dialogoMagnitud = dialogoMagnitud;
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
		return Objects.equals(arreglo, other.arreglo) && Objects.equals(barridoPrincipal, other.barridoPrincipal)
				&& Objects.equals(barridoSecundario, other.barridoSecundario)
				&& Objects.equals(comentario, other.comentario)
				&& Objects.equals(descripcionPunto, other.descripcionPunto)
				&& Objects.equals(dialogoEntrada, other.dialogoEntrada)
				&& Objects.equals(dialogoMagnitud, other.dialogoMagnitud)
				&& Objects.equals(dialogoTxt, other.dialogoTxt)
				&& Objects.equals(dialogoValidacion, other.dialogoValidacion) && id == other.id
				&& Objects.equals(instrucciones, other.instrucciones) && numeroMediciones == other.numeroMediciones
				&& numeroPuntoSecuencia == other.numeroPuntoSecuencia && tipoPunto == other.tipoPunto
				&& Objects.equals(valor, other.valor);
	}

	@Override
	public String toString() {
		return "SecuenciaDetalle [id=" + id + ", numeroPuntoSecuencia=" + numeroPuntoSecuencia + ", tipoPunto="
				+ tipoPunto + ", descripcionPunto=" + descripcionPunto + ", valor=" + valor + ", barridoPrincipal="
				+ barridoPrincipal + ", barridoSecundario=" + barridoSecundario + ", numeroMediciones="
				+ numeroMediciones + ", instrucciones=" + instrucciones + ", comentario=" + comentario + ", arreglo="
				+ arreglo + ", dialogoTxt=" + dialogoTxt + ", dialogoEntrada=" + dialogoEntrada + ", dialogoValidacion="
				+ dialogoValidacion + ", dialogoMagnitud=" + dialogoMagnitud + "]";
	}

}
