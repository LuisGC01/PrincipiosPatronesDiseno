package solid.dependencyInversion;

public class HFSQLConnection
{
    private String database;

    public HFSQLConnection(String database)
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
