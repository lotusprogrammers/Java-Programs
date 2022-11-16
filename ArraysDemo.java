// Demonstrate various algorithms.
import java.util.*;
class ArraysDemo {
	public static void main(String args[]) {
       // Allocate and initialize array.
	   int array[] = new int[10];
       for(int i = 0; i <10; i++)
         array[i] = 3 * i;
       // Display, sort, and display the array.
       System.out.print("Original contents: ");
       display(array);
       Arrays.sort(array);
       System.out.print("Sorted: ");
       display(array);
       // Fill and display the array.
       Arrays.fill(array, 2, 6, 99);
       System.out.print("After fill(): ");
       display(array);
       // Sort and display the array.
       Arrays.sort(array);
       System.out.print("After sorting again: ");
       display(array);
       // Binary search for 9.
       System.out.print("The value 9 is at location ");
       int index =Arrays.binarySearch(array,18);
       System.out.println(index);
	   int a[]={1,2,3,4,5};
	   Arrays.fill(a,99);
	   display(a);
	   int x[]=Arrays.copyOf(a,3);
	   display(x);
     }
	 static void display(int array[]) {
           for(int i: array)
              System.out.print(i + " ");
           System.out.println();
     }
}	
/*
Input and Output
F:\BHAVAJAVA\Collections>javac ArraysDemo.java
F:\BHAVAJAVA\Collections>java ArraysDemo
Original contents: 0 3 6 9 12 15 18 21 24 27
Sorted: 0 3 6 9 12 15 18 21 24 27
After fill(): 0 3 99 99 99 99 18 21 24 27
After sorting again: 0 3 18 21 24 27 99 99 99 99
The value 9 is at location 2
*/