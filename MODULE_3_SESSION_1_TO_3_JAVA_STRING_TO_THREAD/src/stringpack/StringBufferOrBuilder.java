package stringpack;

public class StringBufferOrBuilder {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sbOne = new StringBuffer(6);
		StringBuffer sbTwo = new StringBuffer("Hello");
		
		System.out.println(sb.length());
		sb.append("Hello World!");
		System.out.println(sb);
		System.out.println(sb.length());
		
		
		System.out.println(sbOne.capacity());
		sbOne.append("Welcome to java");  // length of String = 15
		System.out.println(sbOne.capacity());  // (initial capacity *2) + 2   ---> if length of string > initial capacity
		
		
		sbTwo.append(" Luminar Technolab");   // "Hello" + " Luminar Technolab"
		System.out.println(sbTwo);  
		

	}

}
