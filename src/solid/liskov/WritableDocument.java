package solid.liskov;

public class WritableDocument extends Document {

	public WritableDocument(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}
	


	public void save() //throws Exception
    {
        System.out.println("A document saved.");
//        throw new Exception("A read-only document cannot be modified and saved.");
    }

}
