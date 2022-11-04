//Sum of Prime Numbers from Array and Printing Prime Numbers from Array
//SumOddIndElements.java
import java.util.*;
class SumOddIndElements{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n=sin.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Elements...");
		for(int i=0;i<n;i++){
			a[i]=sin.nextInt();
		}
		System.out.println("\nDisplaying Array Elements Using for each loop...");
		for(int x:a){
			System.out.print(x+"\t");
	    }		
		int sum=0;
		System.out.println("\nOdd Indexed Elements...");
        for(int i=0;i<n;i++){
			if(i%2==1){
				sum=sum+a[i];
                System.out.print(a[i]+"\t");
            }				
		}
        System.out.println("\nSum of Odd Indexed Elements of Array="+sum);
    }
}	

/*
F:\BHAVAJAVA\bhavawipro>javac SumOddIndElements.java

F:\BHAVAJAVA\bhavawipro>java SumOddIndElements
Enter Size of Array
5
Enter Array Elements...
2
3
4
9
12

Displaying Array Elements Using for each loop...
2       3       4       9       12
Odd Indexed Elements...
3       9
Sum of Odd Indexed Elements of Array=12
*/





















			
		