package stringpack;

public class StringMethods {

	public static void main(String[] args) {


		String s = "Luminar Technolab";
		String s6 = "Luminar Technolab";
		String s3 = "luminar technolab";
		String s4 = new String("Luminar Technolab");
		String s5 = new String("Luminar Technolab");
		
		
//		String s2 = s.toUpperCase();
//		
//		System.out.println("s : "+s);
//		System.out.println("s2 : "+s2);
//		System.out.println(s.charAt(3));
//		System.out.println(s.substring(4));
//		System.out.println(s.substring(7,17));
//		System.out.println(s.substring(7, 16));
//		System.out.println(s.concat(" Kochi"));
//		String result = s.concat(" Kakkanad");
//		System.out.println(result);
//		
		System.out.println(s.equals(s6));
		System.out.println(s.compareTo(s6));
		System.out.println(s==s6);
		
		System.out.println(s3.equals(s4));
		System.out.println(s4.compareTo(s3));
		System.out.println(s3==s4);
		
		
		System.out.println(s.equals(s4));
		System.out.println(s.compareTo(s4));
		System.out.println(s==s4);
		
		System.out.println(s.length());
		System.out.println(s.lastIndexOf('l'));
		System.out.println(s.codePointAt(8));
		System.out.println(s.replace("Technolab","Kochi"));
		System.out.println();
		
		String s7 = s5.intern();
		System.out.println(s6==s7);
		
		
		int x =100;
		String data = "I have ";
		String out = data+String.valueOf(x);
		System.out.println(10+x); //here + is addition 
		System.out.println(10+String.valueOf(x)); //here + is concatenation
		System.out.println(out);
		

	}

}
