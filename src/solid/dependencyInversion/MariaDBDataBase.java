package solid.dependencyInversion;

public class MariaDBDataBase implements DataBase
{
    MariaDBConnection connection;

    public void connect(String database) {
        connection = new MariaDBConnection(database);
    }

    public void insert(Entity entity) {
        System.out.println("Inserting " + entity + " in MariaDB using " + connection.getDatabase());
    }

    public void update(Entity entity) {
        System.out.println("Updating " + entity + " in MariaDB using " + connection.getDatabase());
    }

    public void delete(Entity entity) {
        System.out.println("Deleting " + entity + " in MariaDB using " + connection.getDatabase());
    }

    public void disconnect() {
        connection = null;
    }
}
