// Demonstrate iterators.
import java.util.*;
class ListIterDemo{
	public static void main(String args[]){
		// Create an array list.
		ArrayList<String> al = new ArrayList<String>();
		// Add elements to the array list.
		al.add("Rajesh");
		al.add("Suresh");
		al.add("Ravi");
		al.add("Charan");
		al.add("Siva");
		al.add("Satya");
		//create ListIterator object
		ListIterator<String> litr = al.listIterator();
		System.out.print("List Elements:" );
		while(litr.hasNext()) {
           String element = litr.next();
           System.out.print(element + " ");
        }
		System.out.println(); 
		litr = al.listIterator();
		//Modifify ArrayList elements using set method
		while(litr.hasNext()) {
			String element = litr.next();
			litr.set(element + "Sir");
		}
		System.out.println("Modified Array List="+al);
		litr = al.listIterator();
        System.out.print("Modified contents of al: ");
        while(litr.hasNext()) {
           String element = litr.next();
		   //litr.remove();
           System.out.print(element + " ");
        }
		System.out.println(); 
		// Now, display the list backwards.
        System.out.print("Modified list backwards: ");
        while(litr.hasPrevious()) {
			String element = litr.previous();
			System.out.print(element + " ");
        }
        System.out.println();   
	}
}	

/*

*/
