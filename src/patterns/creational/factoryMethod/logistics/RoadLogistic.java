package patterns.creational.factoryMethod.logistics;

public class RoadLogistic extends Logistics {
	
	

	@Override
	public Transport createTransport() {
		// TODO Auto-generated method stub
		return new Truck();
	}

}
