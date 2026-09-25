package jdkfeatures;

class GenType<T>{
	private T t;
	public T get() {
		return this.t;
	}
	
	public void set(T t1) {
		this.t=t1;
	}
}

public class GenericsMethods {

	public static<T> boolean isEqual(GenType<T>g1,GenType<T>g2) {
		return g1.get().equals(g2.get());
	}
	
	public static void main(String[] args) {
		
		GenType<String> g1=new GenType<>();
		g1.set("Ann");
		
		GenType<String> g2=new GenType<>();
		g1.set("ann");
		
		boolean isEqual = GenericsMethods.<String>isEqual(g1,g2);
		System.out.println(isEqual);
		
		isEqual=GenericsMethods.isEqual(g1, g2);
				System.out.println(isEqual);
				
				
				
				GenType<Integer> g3=new GenType<>();
				g3.set(10);
				
				GenType<Integer> g4=new GenType<>();
				g4.set(20);
				
				isEqual = GenericsMethods.isEqual(g3,g4);
				System.out.println(isEqual);
				
				
				GenType<Float> g5=new GenType<>();
				g5.set(10.5f);
				
				GenType<Float> g6=new GenType<>();
				g6.set(10.5f);
				
				isEqual=GenericsMethods.isEqual(g5, g6);
						System.out.println(isEqual);
	}

}
