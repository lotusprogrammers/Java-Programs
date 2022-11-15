//Display Numbers from 1...n using while loop
import java.util.*;
class DisplayNumbersFor{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter range to display numbers");
		int n=sin.nextInt();
		System.out.println("Numbers...");
		for(int i=1;i<=n;i++){
			System.out.print(i+"\t");
		}	
        System.out.println("\nFor Loop Completed");
    }
}	

/*
F:\BHAVAJAVA\EEE>javac DisplayNumbersFor.java

F:\BHAVAJAVA\EEE>java DisplayNumbersFor
Enter range to display numbers
10
Numbers...
1       2       3       4       5       6       7       8       9       10
For Loop Completed
*/