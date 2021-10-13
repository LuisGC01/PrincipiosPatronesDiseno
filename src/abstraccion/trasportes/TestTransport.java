package abstraccion.trasportes;

public class TestTransport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine motor = new CombustionEngine();
		Driver conductor = new Human();
		Transport transporte1= new Transport(motor, conductor);
		transporte1.deliver("CDMX", "Celulares");

		Engine motor2 = new FusionEngine();
		Driver conductor2 = new Robot();
		Transport transporte2= new Transport(motor2, conductor2);
		transporte2.deliver("Edomex", "Naranjas");

		Engine motor3 = new ElectricEngine();
		Driver conductor3 = new Robot();
		Transport transporte3= new Transport(motor3, conductor3);
		transporte3.deliver("Jalisco", "Papas");
		
	}

}
