package abstraccion.openClosed;

public class SeaShipping implements Shipping {

	@Override
	public double getShippingCost(Order o) {
		return Double.max(15, o.getTotalWeight() * 2);

	}

}
