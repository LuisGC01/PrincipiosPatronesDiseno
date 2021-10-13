package solid.dependencyInversion;

public class MariaDBConnection
{
    private String database;

    public MariaDBConnection(String database)
    {
        this.database = database;
    }

    public String getDatabase()
    {
        return database;
    }

    public void setDatabase(String database)
    {
        this.database = database;
    }
}
