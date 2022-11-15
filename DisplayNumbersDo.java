//Display Numbers from 1...n using while loop
import java.util.*;
class DisplayNumbersDo{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter range to display numbers");
		int n=sin.nextInt();
		System.out.println("Numbers...");
		int i=1;
		do{
			System.out.print(i+"\t");
			i=i+1;
	    }while(i<=n);
        System.out.println("\ndo-while Loop Completed");
    }
}	

/*
F:\BHAVAJAVA\EEE>javac DisplayNumbersDo.java

F:\BHAVAJAVA\EEE>java DisplayNumbersDo
Enter range to display numbers
10
Numbers...
1       2       3       4       5       6       7       8       9       10
do-while Loop Completed
*/