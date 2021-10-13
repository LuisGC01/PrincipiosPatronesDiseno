package abstraccion.company;

public class TestCompany
{
    public static void main(String[] args) {
        Company company = new Company("A tu medida");
        company.addEmmpleado(new Designer());
        company.addEmmpleado(new Programmer());
        company.addEmmpleado(new Tester());
        System.out.println(company.createSoftware("Nomina"));
    }
}
