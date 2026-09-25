package stringpack;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {


		String wordOne ="listen".toLowerCase();
		String wordTwo="silent".toLowerCase();
		
		char[] chOne=wordOne.toCharArray();
		char[] chTwo=wordTwo.toCharArray();
		
		Arrays.sort(chOne);
		Arrays.sort(chTwo);
		if(Arrays.equals(chOne, chTwo)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an Anagram");
		}	
	}

}
