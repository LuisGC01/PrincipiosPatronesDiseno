package patterns.creational.abstractFactory.furniture;

public interface FurnitureFactory
{
    Chair createChair();
    Table createTable();
    Sofa createSofa();
}
