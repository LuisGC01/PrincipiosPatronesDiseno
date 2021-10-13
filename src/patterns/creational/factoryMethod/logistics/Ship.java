package patterns.creational.factoryMethod.logistics;

public class Ship implements Transport
{
    public void deliver()
    {
        System.out.println("Delivering by sea in a container.");
    }
}
