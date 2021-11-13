package Collections;

//addLast()	Add an item to the end of the list I(only for Linked List).
import java.util.LinkedList;

public class Addlastmethod {

	public static void main(String[] args) {
		
		LinkedList<String> go = new LinkedList<String>();
		
		go.add("hello beautiful");
		go.add("what im i doing");
		go.add("missing since few days");
		go.add("easy to understand");
		
		go.addLast("testing linked list");
		
		System.out.println(go);
		
		
	}
}
