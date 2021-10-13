package tienda.encapsulacion.metodo;

import java.util.ArrayList;

public class Order2 {
    private ArrayList<Item> items = new ArrayList<>();
    private String country;

    public Order2(String country) {
        this.country = country;
    }

    public double getTotal() {
        double total = 0;

        for (Item item: items) {
            total += item.getPrice() * item.getQuantity();
        }

        total += total*getTaxRate();

        return total;
        
    }

	private double getTaxRate() {
		if (country == "MX") {
            return 0.16;
        }
        else if (country == "US") {
        	return  0.07;
        }
        else if (country == "EU") {
        	return  0.21;
        }
        else if (country == "JP") {
        	return  0.10;
        }else{
        	return 0;
        }
	}

    public void addItem(Item item) {
        items.add(item);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
