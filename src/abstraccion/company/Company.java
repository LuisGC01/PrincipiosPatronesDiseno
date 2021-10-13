package abstraccion.company;

import java.util.ArrayList;


public class Company
{
    private String name;
    private ArrayList<Empleado> empleados;

    public Company(String name)
    {
        this.name = name;
        this.empleados = new ArrayList<Empleado>();
    }
    
    public void addEmmpleado(Empleado e) {
    	this.empleados.add(e);
    }

    public String createSoftware(String systemName) {
        StringBuilder system = new StringBuilder();
        
        for (Empleado empleado : empleados) {
			system.append(empleado.trabajar(systemName));
		}

        return system.toString();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
