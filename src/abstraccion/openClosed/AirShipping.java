package abstraccion.openClosed;

public class AirShipping implements Shipping {

	@Override
	public double getShippingCost(Order o) {
		// TODO Auto-generated method stub
		return Double.max(20, o.getTotalWeight() * 3);
	}

}
