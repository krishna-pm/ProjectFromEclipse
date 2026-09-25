package serializepack;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class EmployeeDemo implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	int empId;
	String empName;
	
	public EmployeeDemo(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
}


public class SerializeEmployee {

	public static void main(String[] args) {
		
		try {
			
			EmployeeDemo emp1=new EmployeeDemo(101,"Arun");
			
			FileOutputStream fout=new FileOutputStream("D:\\JAVA_FULLSTACK_LUMINAR\\javaio\\employee.txt");
			
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(emp1);
			
			out.flush();
			
			out.close();
			
			System.out.println("persist the object");
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		

	}

}
