package solid.singleResponsibility;

public class TimeSheetReport {

	public void printTimeSheetReport(Employee2 employee2) {
		System.out.println("Time sheet of " + employee2.getName());
		System.out.println("Hours worked: ...");
		System.out.println("Holidays: ...");
		System.out.println("Days off: ...");
	}

}
