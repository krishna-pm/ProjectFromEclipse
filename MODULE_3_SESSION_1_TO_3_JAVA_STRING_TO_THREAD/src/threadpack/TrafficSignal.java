package threadpack;


class RedSignal extends Thread{
	
	@Override
	public void run() {
		System.out.println("Signal is red");
		System.out.println("Vehicle Stopped");
		
		for(int i=60;i>=0;i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}

}
}

class GreenSignal extends Thread{
	
	@Override
	public void run() {
		System.out.println("Signal is green");
		System.out.println("Vehicle Starts");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}

class YellowSignal extends Thread{
	
	@Override
	public void run() {
		System.out.println("Signal is yellow");
		System.out.println("Vehicle slow down");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}

}
public class TrafficSignal {

	public static void main(String[] args) {
		
		System.out.println("I am driving....");
		
		RedSignal redSignal = new RedSignal();
			
		GreenSignal greenSignal = new GreenSignal();
		
		YellowSignal yellowSignal = new YellowSignal();
		
		greenSignal.start();
		try {
			greenSignal.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		redSignal.start();
		
		try {
			redSignal.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		yellowSignal.start();
		try {
			yellowSignal.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}

		
	

