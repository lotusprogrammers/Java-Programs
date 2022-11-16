//Demonstrate Iterating ArrayList elements Using ForEach Loop.
import java.util.*;
class ForDemo{
	public static void main(String args[]){
		// Create an array list for integers.
        ArrayList<String> al = new ArrayList<String>();
        // Add values to the array list.
        al.add("Ganga");
        al.add("Godhavari");
        al.add("Krishna");
        al.add("Yamuna");
        al.add("Saraswati");
        // Use for loop to display the values.
        System.out.print("Contents of al: ");
        for(String river : al)
			System.out.print(river + " ");
		System.out.println();
		System.out.println(al);
   }
}
/*
Input and Output
F:\BHAVAJAVA\Collections\ITERATORS>javac ForDemo.java
F:\BHAVAJAVA\Collections\ITERATORS>java ForDemo
Contents of al: Ganga Godhavari Krishna Yamuna Saraswati
*/
