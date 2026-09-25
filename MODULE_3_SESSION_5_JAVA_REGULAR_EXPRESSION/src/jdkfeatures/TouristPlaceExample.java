package jdkfeatures;

import java.util.ArrayList;
import java.util.List;

class TouristPlaces{
	
	List<String> getPlaces(){
		
	List<String> places = new ArrayList<String>();
	
	places.add("USA - New York");
	places.add("India - Kerala");
	places.add("India - Tamil Nadu");
	
	return places;
	}
	
	
	
}
public class TouristPlaceExample {

	public static void main(String[] args) {
		
		TouristPlaces places = new TouristPlaces();
		
		List<String> myPlace=places.getPlaces();

		myPlace.stream().filter(p -> p.startsWith("India")).map(p ->p.toUpperCase()).sorted();
		System.out.println();
	}

}
