package abstraccion.company;

public class Tester implements Empleado
{
  

	@Override
	public String trabajar(String systemName) {
		// TODO Auto-generated method stub
		return "Tested: " + systemName + "\n";
	}
}
