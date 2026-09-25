package stringpack;

public class StringConcat {

	public static void main(String[] args) {
		
		String s1="Luminar";
		String s2="Technolab";
		
		//No change in s1 - because String is immutable
//		s1.concat(s2);
//		System.out.println(s1);    // output -  Luminar not Luminar Technolab
		
		String s3=s1.concat(s2);
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);

	}

}
