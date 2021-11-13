package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.HashSet;

public class IteratorSet {

	public static void main(String[] args) {
		
		
		HashSet<String> ab=new HashSet<String>();
		ab.add("hello world");
		ab.add("APjgn");
		ab.add("baxite"); 
		
		Iterator<String> i=ab.iterator();
				while (i.hasNext()) {
					System.out.println(i.next());
				}
		
		
	}
}
