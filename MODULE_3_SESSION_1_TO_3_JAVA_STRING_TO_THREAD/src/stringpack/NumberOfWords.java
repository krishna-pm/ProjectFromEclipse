package stringpack;

public class NumberOfWords {

	public static void main(String[] args) {


		String sent = " Welcome to Luminar Technolab Kochi ";
		
		String[] arr = sent.trim().split(" ");
		
		System.out.println(arr.length);
	}

}
