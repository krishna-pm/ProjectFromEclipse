package threadpack;

class Product {

    int id;
    String name;
    double price;
    int availableQuantity;
    boolean available;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.availableQuantity = 0;
        this.available = false;
    }

    synchronized void produce(int quantity) {

        availableQuantity += quantity;
        available = true;

        System.out.println("\n===== Producer =====");
        System.out.println("Product Added Successfully");

        System.out.println("Product ID : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Available Quantity : " + availableQuantity);
        System.out.println("Status : Available");

        notify();
    }

    synchronized void consume(int quantity) {

        while (!available) {

            System.out.println("\nProduct Out Of Stock");
            System.out.println("Consumer Waiting...");

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (quantity > availableQuantity) {

            System.out.println("\nRequested Quantity : " + quantity);
            System.out.println("Only " + availableQuantity + " Products Available");
            return;
        }

        double totalPrice = quantity * price;

        availableQuantity -= quantity;

        if (availableQuantity == 0) {
            available = false;
        }

        System.out.println("\n===== Consumer =====");
        System.out.println("Product Purchased Successfully");
        System.out.println("Product Name : " + name);
        System.out.println("Purchased Quantity : " + quantity);
        System.out.println("Total Price : " + totalPrice);
    }
}

class Producer extends Thread {

    Product product;

    Producer(Product product) {
        this.product = product;
    }

    public void run() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        product.produce(10);
    }
}

class Consumer extends Thread {

    Product product;

    Consumer(Product product) {
        this.product = product;
    }

    public void run() {

        product.consume(5);
        product.consume(3);
        product.consume(2);
    }
}

public class ProducerConsumer {

    public static void main(String[] args) {

        Product product = new Product(101, "Laptop", 50000);

        Producer producer = new Producer(product);
        Consumer consumer = new Consumer(product);

        consumer.start();
        producer.start();
    }
}