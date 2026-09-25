package jdkfeatures;

import java.util.Optional;

public class OptionalMore {

	public static void main(String[] args) {
		
		Optional<String> ofc=Optional.of("Luminar Technolab");
		
		Optional<String> nothing = Optional.empty();
		
		
		if(ofc.isPresent()) {
			System.out.println("At luminar");
		}
		else {
			System.out.println("No class today");
		}
		
		//orElse() Method
		
		System.out.println(ofc.orElse("value..."));
		System.out.println(nothing.orElse("value..."));
		
		
		Optional<String> myName=Optional.of("ANN");
		System.out.println(myName.filter(n -> n.equals("ann")));
		System.out.println(myName.filter(n -> n.equalsIgnoreCase("ann")));
		System.out.println(myName.filter(n -> n.equals("ANN")));
		System.out.println(nothing.filter(n -> n.equals("ann")));

	}

}
