package practice;

class DeliveryBoy implements Runnable {

	@Override
	public void run() {

		try {
			System.out.println("Delivery partner is on the way to deliver your order");
			for (int i = 5; i > 0; i--) {
				System.out.println("Delivery partner is " + i + "km away from destination");

				Thread.sleep(1000);

			}
			System.out.println("Reached at your location");
			System.out.println("Order completed");
		}

		catch (InterruptedException e) {
			System.out.println("Delivery stopped");

		}

	}

	public void order(String orderId, String foodItem, int quantity, double price) {

		System.out.println("=================== Order details ====================");
		System.out.println("Order ID : " + orderId);
		System.out.println("Food item : " + foodItem);
		System.out.println("Quantity : " + quantity);
		System.out.println("Price : " + price);
	}

}

public class FoodDeliveryRunnable {

	public static void main(String[] args) throws InterruptedException {

		DeliveryBoy deliveryBoy = new DeliveryBoy();

		deliveryBoy.order("ORD123456", "MANGO JUICE", 2, 350);

		Thread threadOne = new Thread(deliveryBoy);

		threadOne.start();

		threadOne.join();

		deliveryBoy.order("ORD345678", "MOMOS", 4, 750);

		Thread threadTwo = new Thread(deliveryBoy);

		threadTwo.start();

		Thread.sleep(1000);

		System.out.println("Order cancelled by the customer");
		threadTwo.interrupt();

	}

}
