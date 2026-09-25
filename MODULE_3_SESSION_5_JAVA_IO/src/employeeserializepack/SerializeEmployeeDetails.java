//package employeeserializepack;
//
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
// 
//public class SerializeEmployeeDetails {
//
//	public static void main(String[] args) {
//
//		
//try {
//			
//	
//	
//	List<EmployeeDetails> empDetails = new ArrayList<EmployeeDetails>();
//	
//	empDetails.add(new EmployeeDetails(101,"Ann Mary"));
//	empDetails.add(new EmployeeDetails(102,"Arun"));
//	empDetails.add(new EmployeeDetails(103,"Manu"));
//	empDetails.add(new EmployeeDetails(104,"Emma"));
//	empDetails.add(new EmployeeDetails(105,"Thomas"));
//	empDetails.add(new EmployeeDetails(106,"Aswin"));
//	empDetails.add(new EmployeeDetails(107,"Neenu"));
//	empDetails.add(new EmployeeDetails(108,"Amal"));
//	empDetails.add(new EmployeeDetails(109,"Mathew"));
//	empDetails.add(new EmployeeDetails(110,"Riya"));
//	
//	
//	
//	
//			
//			FileOutputStream fout=new FileOutputStream("D:\\JAVA_FULLSTACK_LUMINAR\\javaio\\employeedetails.txt");
//			
//			ObjectOutputStream out = new ObjectOutputStream(fout);
//			
//			out.writeObject(emp1);
//			
//			out.flush();
//			
//			out.close();
//			
//			System.out.println("persist the object");
//			
//		}catch(Exception e){
//			
//			e.printStackTrace();
//		}
//		
//
//	}
//	}
//
//
