// Demonstrate iterators.
import java.util.*;
class IterDemo{
	public static void main(String args[]){
		// Create an array list.
		ArrayList<String> al = new ArrayList<String>();
		// Add elements to the array list.
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		// Use iterator to display contents of al.
		System.out.print("Original contents of al: ");
		Iterator<String> itr = al.iterator();//iterator() method called from ArrayList
		while(itr.hasNext()) {
			
			String element = itr.next();
			itr.remove();
			System.out.print(element + " ");
		}
		System.out.println();
	}
}	
