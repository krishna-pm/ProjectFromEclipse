package threadpack;

public class Demothread extends Thread{
	
	public Demothread(String name) {
		super(name);
	}
	
	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+" is Daemon thread");
		}
		else {
			System.out.println(getName()+" is User thread");
		}
	}

	public static void main(String[] args) {
		
		Demothread demothreadOne = new Demothread("threadOne");
		
		Demothread demothreadTwo = new Demothread("threadTwo");
		
		demothreadOne.setDaemon(true);
		
		demothreadOne.start();
		demothreadTwo.start();

	}

}
