package Collections;

//To remove an element, use the remove() method and refer to the index number
import java.util.LinkedList;


public class Removemethod {
	
	public static void main(String[] args) {
		
		LinkedList<String> mit = new LinkedList<String>();
		
		mit.add("hey kids, wanna get high");
		mit.add("it is very easy to do if you do more");
		mit.add("it is okayyiiiiiiisshhhhh");
		mit.add("what a lovely place");
		
mit.remove(1);	
mit.remove(2);

System.out.println(mit);
	}

}
