package encapsulationExample;

public class EncapsulationExample {
	public static void main(String[] args) {
		EmployeeDetails employeeDetails=new EmployeeDetails();
		
		employeeDetails.seteId(1);
		employeeDetails.seteMobileNumber("9166618267");
		employeeDetails.seteName("Rohit");
		employeeDetails.seteMonthlySalary(20000.0);
		employeeDetails.setePosition("Android Application Developer");
		
		
		System.out.println("Employee ID:"+employeeDetails.geteId());
		System.out.println("Employee Name:"+employeeDetails.geteName());
		System.out.println("Employee Mobile NUmber:"+employeeDetails.geteMobileNumber());
		System.out.println("Employee Monthly Salary:"+employeeDetails.geteMonthlySalary());
		System.out.println("Employee Position in Company:"+employeeDetails.getePosition());
		
		
		
	}

}
