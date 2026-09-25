package threadpack;

class Tables{
	
	synchronized static void printTable(int num) {
		
		System.out.println("Multiplication table of : "+num);
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
	
	class MyThreadOnes extends Thread{
		
		public void run() {
			Tables.printTable(5);
		}
		
	}

	class MyThreadTwos extends Thread{
		
		public void run() {
			Tables.printTable(100);
		}
	}

public class StaticSync {

	public static void main(String[] args) {
		
		
		
		MyThreadOnes myThreadOnes = new MyThreadOnes();
		
		MyThreadTwos myThreadTwos = new MyThreadTwos();
		
		myThreadOnes.start();
		myThreadTwos.start();
	}

}

