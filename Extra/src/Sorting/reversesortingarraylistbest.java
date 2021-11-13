package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reversesortingarraylistbest {
	
	public static void main(String[] args) {
		
		List<Integer> lisa = new ArrayList<>();
		
		lisa.add(12);   //12 is an Element
		lisa.add(4);  //4 is an Element
		lisa.add(11);
		lisa.add(56);
		lisa.add(20); // to achieve descending, just use collections.reverse
		
		Collections.sort(lisa);
		Collections.reverse(lisa);
		System.out.println(lisa);

}
}