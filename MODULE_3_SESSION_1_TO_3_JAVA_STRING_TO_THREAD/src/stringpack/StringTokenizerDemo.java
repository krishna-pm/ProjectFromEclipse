package stringpack;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		//============================================ nextToken =======================================
		
//		StringTokenizer st = new StringTokenizer("Luminar Technolab Kakkanad Kochi");
		
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		
		//output
//		Luminar
//		Technolab
//		Kakkanad
//		Kochi
		
//		====================================== nextToken =============================================================
		
//		StringTokenizer st = new StringTokenizer("Luminar Technolab , Kakkanad , Kochi");
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken(","));
//		}
		
		//output
//		Luminar Technolab 
//		 Kakkanad 
//		 Kochi
		
		
		//=========================================== nextToken ======================================================
		
//		
//		StringTokenizer st = new StringTokenizer("Luminar Technolab , Kakkanad , Kochi");
//		
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken("a"));
//		}
		
//		//output
//		Lumin
//		r Technol
//		b , K
//		kk
//		n
//		d , Kochi
		
		
//============================================ countTokens ===============================================================
		
		

		StringTokenizer st = new StringTokenizer("Luminar Technolab , Kakkanad , Kochi");
		
		
			System.out.println(st.countTokens());
		


	}

}
