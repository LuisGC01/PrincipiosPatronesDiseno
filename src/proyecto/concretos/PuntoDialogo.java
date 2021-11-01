package proyecto.concretos;

import proyecto.MagnitudArreglo;
import proyecto.creadores.ITipoPunto;

public class PuntoDialogo implements ITipoPunto {
	private String dialogoTxt;
	private String dialogoEntrada;
	private String dialogoValidacion;
	private MagnitudArreglo magnitudArreglo;

	public PuntoDialogo() {
		// TODO Auto-generated constructor stub
	}

	public PuntoDialogo(String dialogoTxt, String dialogoEntrada, String dialogoValidacion,
			MagnitudArreglo magnitudArreglo) {
		this.dialogoTxt = dialogoTxt;
		this.dialogoEntrada = dialogoEntrada;
		this.dialogoValidacion = dialogoValidacion;
		this.magnitudArreglo = magnitudArreglo;
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

	public MagnitudArreglo getMagnitudArreglo() {
		return magnitudArreglo;
	}

	public void setMagnitudArreglo(MagnitudArreglo magnitudArreglo) {
		this.magnitudArreglo = magnitudArreglo;
	}

	@Override
	public void setInfo(String[] datos) {
		// TODO Auto-generated method stub
		setDialogoTxt(datos[0]);
		setDialogoEntrada(datos[1]); ;
		setDialogoValidacion(datos[2]);
		setMagnitudArreglo(new MagnitudArreglo());
		magnitudArreglo.cargar(Integer.parseInt(datos[3]));
	}

	@Override
	public String[] getInfo() {
		// TODO Auto-generated method stub
		String[] datos = { getDialogoTxt(), getDialogoEntrada(), getDialogoValidacion(),
				getMagnitudArreglo().getId() + "" };
		return datos;
	}

}
