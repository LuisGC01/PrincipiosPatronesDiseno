package abstraccion.trasportes;

public class Transport {

	private Engine engine;
	private Driver driver;

	public Transport(Engine engine, Driver driver) {
		this.engine = engine;
		this.driver = driver;
	}

	public void deliver(String destino, String cargo) {
		driver.navigate();
		engine.move();
		System.out.println(cargo + " ha sido entregado en " + destino);
	}

}
