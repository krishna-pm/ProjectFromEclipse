package jdkfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		

		List<String> allNames=Arrays.asList("Ann","Emma,","Bob","Sara");
		
		Stream<String> name = allNames.stream();
		
		Stream<String> longNames=name.filter(str -> str.length()>3);
		
		longNames.forEach(str -> System.out.print(str+" "));
		
		//Method Chaining
		
		List filteredList = allNames.stream().filter(s -> s.length()>3)
				.filter(s -> !s.startsWith("d"))
				.filter(s -> s.contains("R"))	
				.collect(Collectors.toList());
		
		System.out.println("Filtered List"+filteredList);
		
		filteredList.forEach(System.out::println);
	}

}
