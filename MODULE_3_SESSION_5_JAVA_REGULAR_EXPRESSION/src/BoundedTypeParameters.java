//
//class GenericTypes<T> {
//
//	private T t;
//	public T get() {
//		return this.t;
//	}
//	
//	public void set(T t1) {
//		this.t=t1;
//	}
//	
//public class BoundedTypeParameters {
//
//	public static<T>boolean checkEquals(GenericTypes<T>g1,GenericTypes<T>g2){
//		return g1.get().equals(g2.get());
//		
//	}
//	
//	public static<T extends Comparable<T>>int compare(T t1,T t2){
//		return t1.compareTo(t2);
//		
//	}
//	public static void main(String[] args) {
//		
//		GenericTypes<String> g1 = new GenericTypes<>();
//		g1.set("Ann");
//		
//		GenericTypes<String> g2 = new GenericTypes<>();
//		g1.set("ann");
//		
//		boolean check = GenericsMethodsBounds.<String>checkEquals(g1,g2);
//		System.out.println(check);
//		
//		check=GenericsMethodsBounds.checkEquals(g1,g2);
//		System.out.println(check);
//		
//		System.out.println(GenericsMethodsBounds.compare("ann","ann"));
//		System.out.println(GenericsMethodsBounds.compare("ann","Ann"));
//		System.out.println(GenericsMethodsBounds.compare("ann","anu"));
//		
//	}
//
//}
