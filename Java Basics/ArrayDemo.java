//Array Demonstration
import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n=sin.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Elements...");
		for(int i=0;i<n;i++){
			a[i]=sin.nextInt();
		}
		System.out.println("Displaying Array Elements Using for loop...");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+"\t");
		}
        System.out.println("\nDisplaying Array Elements Using for each loop...");
		for(int x:a){//x varible gets value from each iteration 
			System.out.print(x+"\t");
	    }		
				//sum of Array Elements
        int sum=0;// 3 5 7 9 12
        for(int i=0;i<n;i++){
			sum=sum+a[i];  
		}
        System.out.println("\nSum of Array Elements="+sum);
    }
}	

/*
F:\BHAVAJAVA\bhavawipro>javac ArrayDemo.java

F:\BHAVAJAVA\bhavawipro>java ArrayDemo
Enter Size of Array
5
Enter Array Elements...
3
5
7
9
12
Displaying Array Elements Using for loop...
3       5       7       9       12
Displaying Array Elements Using for each loop...
3       5       7       9       12
Sum of Array Elements=36


*/





















			
		