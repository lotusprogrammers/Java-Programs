//Of given 5 numbers, how many are even?
/*Array:An array is a data type which stores
//collection of data items belongs to same data type.
//How to declare array in java?
Syntax:
datatype arr[]=new datatype[size];
int arr[]=new int[50];
*/
import java.util.*;
class EvenArray{
	public static void main(String[] args){
		int arr[]=new int[5];
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter 5 Numbers");
		for(int i=0;i<5;i++)
			arr[i]=sin.nextInt();
		int evencount=0;
		for(int i=0;i<5;i++){
			if(arr[i]%2==0)
				evencount=evencount+1;
		}	
		System.out.println("No of  Even Numbers="+evencount);
	}
}	
/*
F:\BHAVAWIPRO23\BhavaWiproMettl>javac EvenArray.java

F:\BHAVAWIPRO23\BhavaWiproMettl>java EvenArray
Enter 5 Numbers
2
5
7
9
12
No of  Even Numbers=2
*/
			
