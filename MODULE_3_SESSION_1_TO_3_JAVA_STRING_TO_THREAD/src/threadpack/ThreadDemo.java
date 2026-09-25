package threadpack;

public class ThreadDemo extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("This code is running in a Thread "+
		(Thread.currentThread().getName())+" "+
				Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		ThreadDemo demo = new ThreadDemo();
		demo.setPriority(6);
		
		ThreadDemo demo2 = new ThreadDemo();
		demo2.setPriority(MAX_PRIORITY);
		
		demo.start();
		demo2.start();
		
		System.out.println("This code is outside of the thread");

	}

}
