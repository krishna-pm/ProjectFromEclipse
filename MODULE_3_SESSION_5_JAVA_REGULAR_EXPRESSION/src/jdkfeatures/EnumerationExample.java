package jdkfeatures;

enum Size{
	SMALL,MEDIUM,LARGE,EXTRALARGE
}

class Test{
	
	Size pizzaSize;

	public Test(Size pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small size pizza");
			break;
		case MEDIUM:
			System.out.println("I ordered a medium size pizza");
			break;
		case LARGE:
			System.out.println("I ordered a large size pizza");
			break;
		case EXTRALARGE:
			System.out.println("I ordered a extra large size pizza");
			break;
		default:
			System.out.println("I don't know which size to order");
		}
	}
}

public class EnumerationExample {

	public static void main(String[] args) {
		
		Test t1= new Test(Size.EXTRALARGE);
		t1.orderPizza();
	}

}
