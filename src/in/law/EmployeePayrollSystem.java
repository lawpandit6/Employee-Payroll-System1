package in.law;

public class EmployeePayrollSystem {
	public static void main(String[] args) {
		PayrollSystem payrollSystem = new PayrollSystem();

		FullTimeEmployee emp1 = new FullTimeEmployee("James Gosling", 101, 215000.0);
		FullTimeEmployee emp2 = new FullTimeEmployee("Law Pandit", 102, 500000.0);
		FullTimeEmployee emp3 = new FullTimeEmployee("Sudhir Pandit", 103, 15000.0);

		PartTimeEmployee empPart1 = new PartTimeEmployee("Smith", 104, 30, 15.0);

		payrollSystem.addEmployee(emp1);
		payrollSystem.addEmployee(emp2);
		payrollSystem.addEmployee(emp3);
		payrollSystem.addEmployee(empPart1);

		System.out.println("Initial Employee Details:");
		payrollSystem.displayEmployees();

		System.out.println("\nRemoving Employee...");
		payrollSystem.removeEmployee(103);

		System.out.println("\nRemaining Employee Details:");
		payrollSystem.displayEmployees();
	}
}