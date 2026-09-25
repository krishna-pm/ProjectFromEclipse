package serializepack;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeEmployee {

	public static void main(String[] args) {


		try {
			
			ObjectInputStream obj = new ObjectInputStream(new FileInputStream("D:\\JAVA_FULLSTACK_LUMINAR\\javaio\\employee.txt"));
			
			EmployeeDemo emp=(EmployeeDemo)obj.readObject();
			
			System.out.println("Depersist Employee Objects");
			
			System.out.println(emp.empId+" "+emp.empName);
			
			obj.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
