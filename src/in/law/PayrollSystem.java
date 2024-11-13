package in.law;

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
	private List<Employee> employeeList;

	public PayrollSystem() {
		employeeList = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}

	public void removeEmployee(int id) {
		Employee employeeToRemove = null;
		for (Employee employee : employeeList) {
			if (employee.getId() == id) {
				employeeToRemove = employee;
				break;
			}
		}
		if (employeeToRemove != null) {
			employeeList.remove(employeeToRemove);
			System.out.println(employeeToRemove);
		}
	}

	public void displayEmployees() {
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}
