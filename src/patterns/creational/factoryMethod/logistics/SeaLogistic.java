package patterns.creational.factoryMethod.logistics;

public class SeaLogistic extends Logistics {
	
	

	@Override
	public Transport createTransport() {
		// TODO Auto-generated method stub
		return new Ship();
	}

}
