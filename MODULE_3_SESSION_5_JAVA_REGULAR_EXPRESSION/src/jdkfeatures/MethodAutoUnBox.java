package jdkfeatures;

public class MethodAutoUnBox {

	static int add(Integer a,Integer b) {
		return a+b;
	}
	public static void main(String[] args) {
		
		int sum=add(10,20);
		System.out.println("Sum = "+sum);

	}

}
