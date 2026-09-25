package stringpack;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringDemoTwo {

	public static void main(String[] args) {


//		String s = "Peelu";  //Literal way of string creation
//		
//		//Stores in String constant pool
//		
//		char[] ch = {'P','e','e','l','u'};
//		
//		System.out.println(ch);
//		
//		String str=new String(ch);   //Using new keyword
//		
//		//Stores in Heap area
//		
//		System.out.println(str);
//
//	}
		
		//String s = "Hello World";
//		System.out.println("s : "+s);
//		
//		System.out.println("Character at index 2 : "+s.charAt(2));
//			
//		System.out.println(s.toUpperCase());
//		
//		String s2 = s.toUpperCase();
//		
//		System.out.println("s2 : "+s2);
		
//		
//		String s = "Hello World";
//		
//		System.out.println(s);
//		
//		System.out.println(s.substring(3));
//		
//		System.out.println(s.substring(5,11));
		
	//	String s = "Hello";

		//System.out.println(s.concat(" World"));
		
//		String str = s.concat(" World");
//		
//		System.out.println(str);
		
		
		
		
//		String s1 = "Peelu";
//		String s2 = "peelu";
//		String s3 = "Peelu";
//		
//		String s4 = new String("Peelu");
//		
//		String s5 = new String("Peelu ");
//		
//		System.out.println(s1==s3);
//		
//		System.out.println(s1.equals(s3));
//		
//		System.out.println(s1.compareTo(s3));
		
//		System.out.println(s1.compareTo(s3));
		
	//	System.out.println(s4==s5);
		
	//	System.out.println(s1==s4);
		
	//	System.out.println(s1.equals(s4));
		
		//System.out.println(s1.compareTo(s5));
		
		

		
//		String s = "Welcome back";
//		
//		System.out.println(s.length());
//		System.out.println(s.lastIndexOf('e'));
//		System.out.println(s.codePointAt(2));
//		System.out.println(s.replace("b", "B"));
		
		
//		String s1 = "Hello world";
//		String s2 = "Welcome";
//		
//		String s3 = "Hi";
//		String s4 = "Hi";
//		
//		String s5 = new String("Hi");
//		
//		
//		
//		String s6 = s5.intern();
//		
//		System.out.println(s6);
//		
//		System.out.println(s6.equals(s3));
//		
//		System.out.println(s6.equals(s4));
//		
//		System.out.println(s6==s3);
//		
//		System.out.println(s6==s4);
//		
//		System.out.println(s6.compareTo(s3));
//		System.out.println(s6.compareTo(s4));
//		
//		
		
//		
//		int x = 100;
//		
//		String str = "I have Rs.";
//		
//		String out = str+x;
//		
//		System.out.println(out);
//		
//		System.out.println(10+x);
//		
//		System.out.println(10+String.valueOf(x));
//		
		
//		
//		String str = " Hello World  ";
//		
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
//		
//		System.out.println(str.trim());
//		
//		System.out.println(str.length());
//		
//		System.out.println(str.charAt(7));
//		
//		System.out.println(str.replace("l", "L"));
//		
//		System.out.println(str.startsWith(" "));
//		
		
		
		
//		String s ="Hello World";
		
		
		
//		StringBuffer buffer = new StringBuffer();
//		
//		StringBuffer buffer2 = new StringBuffer(10);
//		
//		StringBuffer buffer3 = new StringBuffer("Welcome to java class");
//		
//		
//		buffer.append("Hello World");
//		System.out.println(buffer);
//		System.out.println(buffer.length());
		
//		System.out.println(buffer2.capacity());
//		System.out.println(buffer2.length());
//		buffer2.append("Hi,Welcome to Java Fullstack developer course");
//		
//		System.out.println(buffer2.length());
//		System.out.println(buffer2.capacity());
//		
//		buffer3.append(",Study well");
//		System.out.println(buffer3);
		
		
		
		
		
//		StringBuilder builder = new StringBuilder();
//		
//		StringBuilder builder2 = new StringBuilder(5);
//		
//		StringBuilder builder3 = new StringBuilder("Thank you!");
//		
//		System.out.println(builder.length());
//		
//		
//		builder.append("Hey,Welcome");
//		System.out.println(builder);
//		System.out.println(builder.length());
//		
//		
//		System.out.println(builder2.length());
//		
//		System.out.println(builder2.capacity());
//		
//		builder2.append("Happy to see you again");
//		
//		System.out.println(builder2);
//		
//		System.out.println(builder2.length());
//		
//		System.out.println(builder2.capacity());
//		
//		
//		System.out.println(builder3);
//		
//		System.out.println(builder3.length());
//		
//		builder3.append(" , Visit again");
//		
//		System.out.println(builder3);
//		
//		System.out.println(builder3.length());
//		
		
		
		
		
//		StringTokenizer  tokenizer = new StringTokenizer("Hey , Welcome , to Luminar Technolab");
//		System.out.println(tokenizer.countTokens());
//		System.out.println(tokenizer.hasMoreTokens());
//		System.out.println(tokenizer.hasMoreElements());
//		System.out.println(tokenizer.nextToken());
//		System.out.println(tokenizer.nextToken());
//		System.out.println(tokenizer.nextToken());
//		System.out.println(tokenizer.nextElement());
		
//		System.out.println(tokenizer.countTokens());
//		
//		while(tokenizer.hasMoreTokens()) {
//			System.out.println(tokenizer.nextToken("y"));
//		}
//		
//		System.out.println(tokenizer.countTokens());
		
		

//		
//		String org = "Hello";
//		
//		for(int i=org.length()-1;i>=0;i--) {
//			System.out.print(org.charAt(i));
//		}
		
//		
//		String str = " Hey , welcome to Luminar Technolab";
//		String[] st = str.trim().split(" ");
//		System.out.println(st.length);
//		
//		for(String s :st) {
//			System.out.println(s);
//		}
		
		
		
		
		String s1 = "CAT";
		String s2="ACT";
		
		char[] chOne = s1.toCharArray();
		
		char[] chTwo = s2.toCharArray();
	
		Arrays.sort(chOne);
		Arrays.sort(chTwo);
		
		if(Arrays.equals(chOne, chTwo)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an anagram");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
