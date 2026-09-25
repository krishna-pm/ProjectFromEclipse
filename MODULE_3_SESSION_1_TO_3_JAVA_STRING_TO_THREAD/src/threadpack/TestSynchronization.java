package threadpack;


class Table{
	
//	synchronized void printTable(int num) {
//		System.out.println("Multiplication table of : "+num);
//		for(int i=1;i<=10;i++) {
//			System.out.println(i+ "* "+num+" = "+i*num);
//			
//			try {
//				Thread.sleep(400);
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
	
	 void printTable(int num) {
		System.out.println("Multiplication table of : "+num);
		
		synchronized(this) {
		for(int i=1;i<=10;i++) {
			System.out.println(i+ "* "+num+" = "+i*num);
			
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	 }
}


class MyThreadOne extends Thread{
	
	Table t;
	
	MyThreadOne(Table t){
		this.t=t;
	}
	
	public void run() {
		t.printTable(5);
	}
	
}

class MyThreadTwo extends Thread{
	
	Table t;
	
	MyThreadTwo(Table t){
		this.t=t;
	}
	
	public void run() {
		t.printTable(100);
	}
}


public class TestSynchronization {

	public static void main(String[] args) {
		

		Table obj = new Table();
		
		MyThreadOne myThreadOne = new MyThreadOne(obj);
		
		MyThreadTwo myThreadTwo = new MyThreadTwo(obj);
		
		myThreadOne.start();
		myThreadTwo.start();
	}

}
