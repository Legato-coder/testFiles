package Collections;


// removeLast(); to remove last elements
// declaration at the white Board.

import java.util.LinkedList;


public class Removelastmethod {
	public static void main(String[] args) {
		
		LinkedList<String> pop = new LinkedList<String>();
		
		pop.add("changes");
		pop.add("put more hours to get good");
		pop.add("hard work is needed");
		
		pop.removeLast();
		System.out.println(pop);
	}

}
