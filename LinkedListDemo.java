//LinkedListDemo.java
import java.util.*;
class LinkedListDemo {
	public static void main(String args[]) {
		// Create a linked list.
		LinkedList<String> ll = new LinkedList<String>();
		// Add elements to the linked list.
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.add("C");
		System.out.println("Original Contents of Linked List="+ll);
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		System.out.println("Original contents of ll: " + ll);
		// Remove elements from the linked list.
		ll.remove("F");
		System.out.println("Original contents of ll: " + ll);
		ll.remove(2);
		System.out.println("Contents of ll after deletion: "+ll);
		// Remove first and last elements.
		ll.removeFirst();
		ll.removeLast();
		ll.remove("X");
		System.out.println("ll after deleting first and last: "+ll);
		
	}
}