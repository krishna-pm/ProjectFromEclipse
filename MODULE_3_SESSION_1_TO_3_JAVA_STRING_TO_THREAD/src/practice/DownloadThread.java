package practice;

class Downloading extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Downloading started");
		
		for(int i=0;i<=5;i++) {
			System.out.println("Downloading.... "+20*i+"%");
			
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		System.out.println("Downloading completed");
	}
	
}


public class DownloadThread {

	public static void main(String[] args) {
		
		Downloading downloading = new Downloading();
		
		downloading.start();
		
		for(int i=0;i<=5;i++) {
			
			System.out.println("Using WhatsApp");
			
			try {
			Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Using Instagram");
			
			
			try {
				Thread.sleep(800);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			
		}

	}

}
