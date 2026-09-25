package jdkfeatures;

interface Generic<T>{
	T method(T t);
}



public class GenericFunctionalInterface {

	public static void main(String[] args) {
		
		Generic<String> rev=(str)->{
			
			String s="";
			
			for(int i=str.length()-1;i>-1;i--) {
				s+=str.charAt(i);
			}
					return s;
			
		};
		
		System.out.println("Reverse of string ");
		System.out.println(rev.method("LAMBDA"));

	
	
	Generic<Integer> revNum=(num)->{
		
		int n=0;
	
		
		while(num>0) {
			n=n*10+num%10;
			num=num/10;
		}
		return n;
	
	};
	
	System.out.println("Reverse of a number ");
	System.out.println(revNum.method(12345));
	

}
}


