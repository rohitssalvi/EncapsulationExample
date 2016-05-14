package encapsulationExample;

public class EmployeeDetails {
	
	private int eId;
	private String eName;
	private String eMobileNumber;
	private String ePosition;
	private Double eMonthlySalary;
	
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteMobileNumber() {
		return eMobileNumber;
	}
	public void seteMobileNumber(String eMobileNumber) {
		this.eMobileNumber = eMobileNumber;
	}
	public String getePosition() {
		return ePosition;
	}
	public void setePosition(String ePosition) {
		this.ePosition = ePosition;
	}
	public Double geteMonthlySalary() {
		return eMonthlySalary;
	}
	public void seteMonthlySalary(Double d) {
		this.eMonthlySalary = d;
	}
	
	
	

}
