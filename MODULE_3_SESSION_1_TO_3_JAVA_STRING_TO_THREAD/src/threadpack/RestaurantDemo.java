package threadpack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Restaurant {

	public void placeOrder(String customerName) {
		System.out.println(customerName + " placed an order.");
	}

	public void takeOrder(String waiterName, String customerName,String chefName) {
		System.out.println(waiterName + " took the order from " + customerName + ".");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(waiterName + " gave "+customerName+" order to "+chefName+".");
	}
	
	public void prepareFood(String chefName,String customerName) {
		System.out.println(chefName + " is preparing the food for "+customerName);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(chefName + " finished preparing the food for "+customerName);
	}

	public void serveFood(String waiterName, String customerName) {
		System.out.println(waiterName + " served food to " + customerName + ".");
	}
}

class Customers implements Runnable {

	Restaurant restaurant;
	String customerName;
	String waiterName;
	String chefName;

	Customers(Restaurant restaurant, String customerName, String waiterName, String chefName) {

		this.restaurant = restaurant;
		this.customerName = customerName;
		this.waiterName = waiterName;
		this.chefName = chefName;
	}

	@Override
	public void run() {

		restaurant.placeOrder(customerName);

		restaurant.takeOrder(waiterName, customerName,chefName);

		restaurant.prepareFood(chefName,customerName);

		restaurant.serveFood(waiterName, customerName);

		System.out.println("--------------------------------");
	}
}

public class RestaurantDemo {

	public static void main(String[] args) {

		Restaurant restaurant = new Restaurant();

		ExecutorService executor = Executors.newFixedThreadPool(3);

		executor.execute(new Customers(restaurant, "Customer 1", "Waiter 1", "Chef 1"));

		executor.execute(new Customers(restaurant, "Customer 2", "Waiter 2", "Chef 2"));

		executor.execute(new Customers(restaurant, "Customer 3", "Waiter 1", "Chef 1"));

		executor.execute(new Customers(restaurant, "Customer 4", "Waiter 2", "Chef 2"));

		executor.execute(new Customers(restaurant, "Customer 5", "Waiter 1", "Chef 1"));

		executor.shutdown();
	}
}
