// Demonstrate iterators.
import java.util.*;
class ForEachDemo{
	public static void main(String args[]){
		// Create an array list for integers.
        ArrayList<Integer> al = new ArrayList<Integer>();
        // Add values to the array list.
        al.add(12);
        al.add(25);
        al.add(35);
        al.add(44);
        al.add(59);
        // Use for loop to display the values.
        
		System.out.print("Contents of al through for each Iterator: ");
        for(int ele:al)
			System.out.print(ele+" ");
		System.out.println();
		int ele;
		/*System.out.println("Accessing Elements Using Iterator");
		Iterator<Integer> ii=al.iterator();
		while(ii.hasNext()){
			ele=ii.next();
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.println("Accessing Elements Using ListIterator...");*/
		ListIterator<Integer> li=al.listIterator();
		while(li.hasPrevious()){
			ele=li.previous();
			System.out.print(ele+" ");
		}
		System.out.println();	
		
		int sum = 0;
        for(int v : al)
           sum += v;
        System.out.println("Sum of values: " + sum);
    }
}
/*

*/
