package patterns.creational.factoryMethod.logistics;

public class Truck implements Transport
{
    public void deliver()
    {
        System.out.println("Delivering by land in a box.");
    }
}
