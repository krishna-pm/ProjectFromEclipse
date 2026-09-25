package employeeserializepack;

import java.io.Serializable;

public class EmployeeDetails implements Serializable{
	
	private static final long serialVersionUID=1L;

	int empId;
	String empName;
	
	public EmployeeDetails(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	
	

}
