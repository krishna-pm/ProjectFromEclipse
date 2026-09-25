package jdkfeatures;

public class GenericsType<T> {

	private T t;
	public T get() {
		return this.t;
	}
	
	public void set(T t1) {
		this.t=t1;
	}
	public static void main(String[] args) {

		GenericsType<String> type = new GenericsType<>();
		type.set("Ann");
		System.out.println(type.get());
		
		GenericsType<Integer> typeOne = new GenericsType<>();
		typeOne.set(10);
		System.out.println(typeOne.get());

	}

}
