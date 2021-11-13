package SortingMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ascendingorder {

	public static void main(String[] args) {

		
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh goud");  
		al.add("sam");  
		  
		Collections.sort(al);  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		}
	}
}
