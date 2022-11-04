//Strong Number-Sum of factorialsof input number is equal to given input number
//StrongNumber.java
import java.util.*;
class StrongNumber{
	public static void main(String[] args){
		int a[]=new int[]{1,2,3,4,5};
		for(int i:a){System.out.println(i);}
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sin.nextInt(); 
		int rem;
		long fact;
		long sum=0;
		int original=n;
		while(n>0){
			rem=n%10; 
		    fact=1;
			for(int i=1;i<=rem;i++){
				fact=fact*i;
		    }
            sum=sum+fact;  			
            n=n/10;
		}
        if(original==sum){
			System.out.println(original+"  number is Strong Number");
		}
        else{
            System.out.println(original+" number not a Strong Number");			
		}	
	}
}	
/*
F:\BHAVAJAVA\bhavawipro>javac StrongNumber.java

F:\BHAVAJAVA\bhavawipro>java StrongNumber
Enter a Number
145
145  number is Strong Number

F:\BHAVAJAVA\bhavawipro>java StrongNumber
Enter a Number
123
123 number not a Strong Number
*/