package threadpack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Banking implements Runnable{
	
	private String customerName;
	private String transactionType;
	
	Banking(String customerName,String transactionType){
		this.customerName=customerName;
		this.transactionType=transactionType;
	}

	@Override
	public void run() {
		
		System.out.println("Processing "+transactionType+" for "+customerName+"\n"+Thread.currentThread().getName());
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("Completed "+transactionType+" for "+customerName+"\n"+Thread.currentThread().getName());
		
	}
	
}

public class ThreadPoolDemo{
	
	public static void main(String[] args) {
		
		ExecutorService  executorService = Executors.newFixedThreadPool(3);
		
		executorService.execute(new Banking("Arun","Deposit"));
		
		executorService.execute(new Banking("Ann","Withdraw"));
		
		executorService.execute(new Banking("Emma","Balance Inquiry"));
		
		executorService.execute(new Banking("Manu","Deposit"));
		
		executorService.execute(new Banking("Anagha","Balance Inquiry"));
		
		executorService.shutdown();
 } }
