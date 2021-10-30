package patterns.creational.abstractFactory.GUI;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aplicacion appLinux = new Aplicacion(new FabricaLinux());
		appLinux.setTextoBoton("Texto app linux");
		appLinux.setTextoCasillaVerificacion("Texto app linux");
		appLinux.setTextoEtiqueta("Texto app linux");
		appLinux.pintar();
		Aplicacion appMac = new Aplicacion(new FabricaMac());
		appMac.setTextoBoton("Texto app mac");
		appMac.setTextoCasillaVerificacion("Texto app mac");
		appMac.setTextoEtiqueta("Texto app mac");
		appMac.pintar();
		Aplicacion appWindows = new Aplicacion(new FabricaWindows());
		appWindows.setTextoBoton("Texto app windows");
		appWindows.setTextoCasillaVerificacion("Texto app windows");
		appWindows.setTextoEtiqueta("Texto app windows");
		appWindows.pintar();

	}

}
