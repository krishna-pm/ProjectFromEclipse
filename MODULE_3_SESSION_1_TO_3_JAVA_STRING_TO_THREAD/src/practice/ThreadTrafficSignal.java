package practice;

class RedSignal extends Thread {

	@Override
	public void run() {
		System.out.println("Signal is Red");
		System.out.println("Vehicle stopped");
		
		for(int i=10;i>0;i--) {
			System.out.println(i+":00");
			
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class GreenSignal extends Thread {
	
	@Override
	public void run() {
		System.out.println("Signal is Green");
		System.out.println("Vehicle started moving");
		
		for(int i=10;i>0;i--) {
			System.out.println(i+":00");
			
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}

class YellowSignal extends Thread {
	
	@Override
	public void run() {
		System.out.println("Signal is Yellow");
		System.out.println("Vehicle slow down");
		
		for(int i=10;i>0;i--) {
			System.out.println(i+":00");
			
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}

public class ThreadTrafficSignal {

	public static void main(String[] args) {
		
		System.out.println("Driving.....");
		
		YellowSignal yellowSignal = new YellowSignal();
		yellowSignal.start();
		
		try {
			yellowSignal.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		RedSignal redSignal = new RedSignal();
		redSignal.start();
		
		try {
			redSignal.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		GreenSignal greenSignal = new GreenSignal();
		greenSignal.start();
		
		try {
			greenSignal.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
