package threadpack;


class MyTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Task is running");
		
	}
	
}
public class RunnableDemo {

	public static void main(String[] args) {
		
		MyTask myTask = new MyTask();
		Thread thread = new Thread(myTask);
		
		thread.start();
	}

}
