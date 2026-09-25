package practice;

class NewTask implements Runnable{
	
	@Override
	public void run() {

		System.out.println("This is a new task");
		
	}
	
}


public class RunnableTest {

	public static void main(String[] args) {
		
		NewTask task = new NewTask();
		
		Thread threadOne = new Thread(task);
		
		threadOne.start();
		
		Thread threadTwo = new Thread(task);
		
		threadTwo.start();
		
		

	}

}
