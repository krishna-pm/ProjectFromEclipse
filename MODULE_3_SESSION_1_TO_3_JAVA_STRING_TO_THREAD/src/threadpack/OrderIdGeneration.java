package threadpack;

class Flipkart {

    static int orderId = 5000;

    synchronized static void generateOrder(String customer) {

        orderId++;
        System.out.println(customer + " Order ID : #ORD" + orderId);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Customer extends Thread {

    String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void run() {
        Flipkart.generateOrder(customerName);
    }
}

public class OrderIdGeneration {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Customer 1");
        Customer customer2 = new Customer("Customer 2");
        Customer customer3 = new Customer("Customer 3");

        customer1.start();
        customer2.start();
        customer3.start();
    }
}