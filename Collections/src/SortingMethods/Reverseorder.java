package SortingMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Reverseorder {
	
public static void main(String[] args) {

		
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh goud");  
		al.add("sam");  
		  
		Collections.sort(al,Collections.reverseOrder());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());

}
}
}
