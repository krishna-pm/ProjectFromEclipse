package threadpack;

class Luminar extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Luminar");
		}
	}
}

class Kochi extends Thread{
	

	@Override
	public void run() {
		while(true) {
			System.out.println("Kochi");
		}
	}
	
}

public class ThreadDemoTwo {

	public static void main(String[] args) {

		Luminar luminar = new Luminar();
		Kochi kochi = new Kochi();
		
		luminar.start();
		kochi.start();

	}

}
