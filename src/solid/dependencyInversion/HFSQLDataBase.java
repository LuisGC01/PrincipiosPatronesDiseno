package solid.dependencyInversion;

public class HFSQLDataBase implements DataBase
{
	HFSQLConnection connection;

    public void connect(String database) {
        connection = new HFSQLConnection(database);
    }

    public void insert(Entity entity) {
        System.out.println("Inserting " + entity + " in HFSQL using " + connection.getDatabase());
    }

    public void update(Entity entity) {
        System.out.println("Updating " + entity + " in HFSQL using " + connection.getDatabase());
    }

    public void delete(Entity entity) {
        System.out.println("Deleting " + entity + " in HFSQL using " + connection.getDatabase());
    }

    public void disconnect() {
        connection = null;
    }
}
