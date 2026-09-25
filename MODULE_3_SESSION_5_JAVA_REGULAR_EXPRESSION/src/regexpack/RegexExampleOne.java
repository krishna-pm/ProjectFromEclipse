package regexpack;

public class RegexExampleOne {

	public static void main(String[] args) {
		System.out.println("123".matches("\\d{3}"));
		System.out.println("12".matches("\\d{3}"));
		
		System.out.println("98765".matches("\\d{2,}"));
		System.out.println("5".matches("\\d{2,}"));
		
		System.out.println("12".matches("\\d{2,4}"));     
		System.out.println("123".matches("\\d{2,4}"));    
		System.out.println("1234".matches("\\d{2,4}"));  

		System.out.println("1".matches("\\d{2,4}"));     
		System.out.println("12345".matches("\\d{2,4}"));  
		
		System.out.println("4".matches("\\d+"));     
		System.out.println("456".matches("\\d+"));  
		System.out.println("".matches("\\d+"));       
		System.out.println("abc".matches("\\d+"));   

	}

}
