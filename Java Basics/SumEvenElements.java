//Sum of Even Elements from Array
import java.util.*;
class SumEvenElements{
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
        for(int i=0;i<n;i++){
			if(a[i]%2==0)
			   sum=sum+a[i];  
		}
        System.out.println("\nSum of Even Elemnets of Array="+sum);
    }
}	

/*
F:\BHAVAJAVA\bhavawipro>javac SumEvenElements.java

F:\BHAVAJAVA\bhavawipro>java SumEvenElements
Enter Size of Array
5
Enter Array Elements...
2
3
12
5
14

Displaying Array Elements Using for each loop...
2       3       12      5       14
Sum of Even Elemnets of Array=28

*/





















			
		