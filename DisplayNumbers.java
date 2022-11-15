//Display Numbers from 1...n using while loop
import java.util.*;
class DisplayNumbers{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter range to display numbers");
		int n=sin.nextInt();
		int i=1;
		System.out.println("Numbers...");
		while(i<=n){
			System.out.print(i+"\t");
			i=i+1;
	    }
        System.out.println("\nLoop Completed");
    }
}	

/*
F:\BHAVAJAVA\EEE>javac DisplayNumbers.java

F:\BHAVAJAVA\EEE>java DisplayNumbers
Enter range to display numbers
10
Numbers...
1       2       3       4       5       6       7       8       9       10
Loop Completed
*/