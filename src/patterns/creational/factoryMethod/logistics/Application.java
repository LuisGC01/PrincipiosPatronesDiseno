package patterns.creational.factoryMethod.logistics;

import java.security.Principal;
import java.util.Scanner;

public class Application {
	public Logistics miPrincipal(String entrega) {
		if (entrega.equals("road")) {
			return new RoadLogistic();
		} else if (entrega.equals("sea")) {
			return new SeaLogistic();
		}else {
		return null;
		}

	}

	public static void main(String[] args) {
		Logistics l;
		Application app = new Application();
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese una forma de entrega (road/sea)");
		String entrega = "";
		entrega = s.nextLine();
		l = app.miPrincipal(entrega);
		l.planDelivery();
		
		

	}
}
