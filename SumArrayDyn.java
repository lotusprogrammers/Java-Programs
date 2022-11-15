//Sum of Array Elements with Dynamically Initialized Array
import java.util.*;
class SumArrayDyn{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sin.nextInt();
		//Array created dynamically with size n
		int a[]=new int[n];
		System.out.println("Enter Array Elements");
		for(int i=0;i<n;i++){
			a[i]=sin.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
			sum=sum+a[i];
		System.out.println("Sum of Array Elements="+sum);
	}
}	

/*
F:\BHAVAJAVA\EEE>javac SumArrayDyn.java

F:\BHAVAJAVA\EEE>java SumArrayDyn
Enter array size
5
Enter Array Elements
23
45
78
99
57
Sum of Array Elements=302
*/