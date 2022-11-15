//Print numbers from 1...n Using for loop
import java.util.*;
class NumbersFor{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter range to find sum of sqaures");
		int sum=0;
		int n=sin.nextInt();
		for(int i=1;i<=n;i++){
			 sum=sum+i*i;
        }
        System.out.println("Sum of Squares="+sum);		
	}
}	
		