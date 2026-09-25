package jdkfeatures;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {

	public static void printList(List<?>list){
		System.out.println(list);
	}
	public static void main(String[] args) {

		List<Integer> intList = new ArrayList();
		intList.add(10);
		intList.add(20);
		
		printList(intList);
		
		List<Double> doubleList = new ArrayList();
		doubleList.add(13.2);
		doubleList.add(15.6);
		
		printList(doubleList);

	}

}
