package solid.dependencyInversion;

public class BudgetReport implements Entity
{
    private DataBase database;

    public BudgetReport()
    {
    	//this.database = new MySQLDatabase();
    	//this.database = new MariaDBDataBase();
    	this.database = new HFSQLDataBase();
        database.connect("projects");
    }

    public void save() {
        database.insert(this);
    }
}
