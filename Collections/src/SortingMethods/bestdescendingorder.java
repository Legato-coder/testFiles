package SortingMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bestdescendingorder {

	
	public static void main(String[] args) {
		
		List<Integer> lisa = new ArrayList<>();
		
		lisa.add(12);   //12 is an Element
		lisa.add(4);  //4 is an Element
		lisa.add(11);
		lisa.add(560);
		lisa.add(200); // to achieve descending, just use collections.reverse
		
		Collections.sort(lisa);
		Collections.reverse(lisa);
		System.out.println(lisa);

	}
}
