//Of given 5 numbers, how many are odd?
//OddArray.java
import java.util.*;
class OddArray{
	public static void main(String[] args){
		int arr[]=new int[5];
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter 5 Numbers");
		for(int i=0;i<5;i++)
			arr[i]=sin.nextInt();
		int oddcount=0;
		for(int i=0;i<5;i++){
			if(arr[i]%2!=0)
				oddcount=oddcount+1;
		}
		System.out.println("No of  odd  Numbers="+oddcount);
	}
}	