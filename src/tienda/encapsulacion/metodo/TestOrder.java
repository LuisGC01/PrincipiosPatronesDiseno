package tienda.encapsulacion.metodo;


//Para git
public class TestOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item television = new Item(1, 15000.10,1);
		Item blueRay = new Item(2, 1500,1);
		
		Order2 orden = new Order2("MX");
		orden.addItem(blueRay);
		orden.addItem(television);
		System.out.println("Total a pagar en MX: " + orden.getTotal());
		
		orden.setCountry("US");
		System.out.println("Total a pagar en US: " + orden.getTotal());
		orden.setCountry("EU");
		System.out.println("Total a pagar en EU: " + orden.getTotal());
		orden.setCountry("JP");
		System.out.println("Total a pagar en JP: " + orden.getTotal());
		
	}

}
