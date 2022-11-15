//ArmstrongSeries.java
import java.lang.*;
import java.util.*;
class ArmstrongSeries{
	public static void main(String args[]){
		int n,range;
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter range=");
		range=sin.nextInt();
		int rem,count;
		double sum;
	 	int num;
		System.out.println("Armstrong Series...");
		for(int i=1;i<=range;i++){
		   n=i;
           count=0;		   
           while(n>0){
			   n=n/10;
			   count=count+1;
		   }
		   sum=0;
		   num=i;
		   while(num>0){
			   rem=num%10;
			   sum=sum+Math.pow(rem,count);
			   num=num/10;
		   }
		   if(sum==i)
			  System.out.println((int)sum);
		}  
			
	}
}	
/*
F:\BHAVAJAVA\UNIT-I>javac ArmstrongSeries.java

F:\BHAVAJAVA\UNIT-I>java ArmstrongSeries
Enter range=
1000
Armstrong Series...
1
2
3
4
5
6
7
8
9
153
370
371
407

*/