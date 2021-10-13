package solid.singleResponsibility;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee2 Juan = new Employee2("Juan");
		TimeSheetReport report = new TimeSheetReport();
		report.printTimeSheetReport(Juan);
		

	}

}
