package threadpack;

class DownloadThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println("Downloading...."+(20*i)+"%");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Downloading Completed");
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		
		DownloadThread downloadThread = new DownloadThread();
		downloadThread.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("User is using WhatsApp");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
		
	}


