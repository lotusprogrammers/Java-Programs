//SumDigits.java
import java.lang.*;
import java.util.*;
class SumCountDigits{
	public static void main(String args[]){
		int n;
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter n=");
		n=sin.nextInt();
		int rem,sum=0,count=0;
		int num=n;
		while(n>0){
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		    count=count+1;
		}	
		System.out.println("No of digits in "+num+"="+count);
		System.out.println("Sum of digits of "+num+"="+sum);	
	}
}	
/*
F:\BHAVAJAVA\2021>javac SumCountDigits.java
F:\BHAVAJAVA\2021>java SumCountDigits
Enter n=
123456789
No of digits in 123456789=9
Sum of digits of 123456789=45
*/