package practice;

class ThreadDemo extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("This is a thread - "+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {


//		ThreadDemo threadDemoOne = new ThreadDemo();
//		
//		threadDemoOne.start();
//		
//		ThreadDemo threadTwo =new ThreadDemo();
//		threadTwo.start();
		
		ThreadDemo threadDemoOne = new ThreadDemo();
		
		ThreadDemo threadTwo =new ThreadDemo();
		
		threadTwo.setPriority(Thread.MAX_PRIORITY);
		
		threadDemoOne.setPriority(3);
		
		threadDemoOne.start();

		threadTwo.start();
		
		System.out.println("Hello welcome");
	}

}
