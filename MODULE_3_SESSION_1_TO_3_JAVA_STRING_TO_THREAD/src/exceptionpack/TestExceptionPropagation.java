package exceptionpack;

public class TestExceptionPropagation {
	
	void display() {
		int data;
		data=50/0;
		
		System.out.println(data);
	}
	
	void print() {
		display();
	}
	
	void test() {
		
		try {
			print();
			
		}catch(Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) {
		
		TestExceptionPropagation obj = new TestExceptionPropagation();
		
		obj.test();
		
		System.out.println("normal flow...");
	}

}
