package stringpack;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new  StringBuilder();
		
		StringBuilder sbOne = new StringBuilder(12);
		
		StringBuilder sbTwo = new StringBuilder("Hello World");
		
		System.out.println(sb.length());
		sb.append("Luminar");
		System.out.println(sb.length());
		
		
		System.out.println(sbOne.capacity());
		sbOne.append("Welcome to Java Fullstack");
		System.out.println(sbOne.capacity());
		
		
		sbTwo.append(" Welcome to Java Fullstack");
		System.out.println(sbTwo);
		
		
	}

}
