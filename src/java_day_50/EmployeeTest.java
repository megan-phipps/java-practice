package java_day_50;

public class EmployeeTest {

	public static void main(String[] args) {
	
	Employee employee = new Employee();
	FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
	Contractor contractor = new Contractor();
	
	employee.calculatePay(40, 40);
	fullTimeEmployee.calculatePay(40, 40);
	contractor.calculatePay(40, 40);
	
	
	}
}
