package abstraccion.gato;

import java.util.Date;

public class TestCat {
	public static void main(String[] args) {
	
		Sausage2 salchicha = new Sausage2(5, "Rojo", new Date(2020, 1, 1));
		Croquetas gatoChaw = new Croquetas(9, "Premium");
		
		Cat2 salem = new Cat2("Salem");
		
		System.out.println("Salem no ha comido: "+salem.getEnergy());
		salem.eat(salchicha);
		salem.eat(gatoChaw);
		System.out.println("Salem ya comio: "+salem.getEnergy());
		
	}
}
