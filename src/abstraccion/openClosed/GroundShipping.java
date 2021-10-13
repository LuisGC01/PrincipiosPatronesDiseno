package abstraccion.openClosed;

public class GroundShipping implements Shipping {

	@Override
	public double getShippingCost(Order o) {
		// TODO Auto-generated method stub

		if (o.getTotal() > 100) {
			return 0;
		}

		return Double.max(10, o.getTotalWeight() * 1.5);
	}

}
