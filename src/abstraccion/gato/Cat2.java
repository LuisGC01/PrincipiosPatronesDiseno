package abstraccion.gato;

public class Cat2  {
    private String name;
    private double energy;

    public Cat2(String name)
    {
        this.name = name;
    }

    public void eat(Food sausage) {
        energy += sausage.getNutrition();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getEnergy()
    {
        return energy;
    }

    public void setEnergy(double energy)
    {
        this.energy = energy;
    }
}
