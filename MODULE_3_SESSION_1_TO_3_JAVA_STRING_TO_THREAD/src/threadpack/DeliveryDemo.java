package threadpack;

class DeliveryBoy implements Runnable {

	private String orderId;
	private String foodItem;
	private double price;

	DeliveryBoy(String orderId, String foodItem, double price) {
		this.orderId = orderId;
		this.foodItem = foodItem;
		this.price = price;
	}

	@Override
	public void run() {

		try {

			System.out.println("Delivery partner is on the way to pickup your food");
			Thread.sleep(1000);
			System.out.println("Delivery partner reached at the resturant");
			Thread.sleep(1000);
			System.out.println("Waiting for pickup");
			Thread.sleep(1000);
			System.out.println("Timely pickup");
			Thread.sleep(1000);
			System.out.println("Out for delivery");
			Thread.sleep(1000);
			System.out.println("Delivery partner is on the way to deliver your order");
			Thread.sleep(1000);
			System.out.println("Delivery partner reached your destination");

			System.out.println("Delivered");
			System.out.println("OrderId : " + orderId);
			System.out.println("Food Item : " + foodItem);
			System.out.println("Price : " + price);
		} catch (InterruptedException e) {
			System.out.println("Order Cancelled and delivery stopped");
		}

	}

}

public class DeliveryDemo {

	public static void main(String[] args) throws InterruptedException {

		Thread threadOne = new Thread(new DeliveryBoy("ORD123", "Veg Noodles", 150));
		Thread threadTwo = new Thread(new DeliveryBoy("ORD234", "Cake", 950));

		threadOne.start();
		threadOne.join();

		threadTwo.start();
		Thread.sleep(1000);
		System.out.println("Customer cancelled the order");
		threadTwo.interrupt();
		threadTwo.join();

	}

}
