package abstraccion.company;

public class Programmer implements Empleado
{

	@Override
	public String trabajar(String systemName) {
		// TODO Auto-generated method stub
		return "Here's the code for: " + systemName + "\n";
	}
}
