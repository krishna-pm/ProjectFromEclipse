package practice;

class Luminar extends Thread {

	@Override
	public void run() {

		while (true) {
			System.out.println("Luminar");

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Kochi extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("Kochi");

			try {
				sleep(1200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class LuminarKochiThread {

	public static void main(String[] args) {

		Luminar luminar = new Luminar();
		
		Kochi kochi = new Kochi();
		
		luminar.start();
		kochi.start();
		
	}

}
