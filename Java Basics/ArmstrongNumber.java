//Armstrong Number
//ArmstrongNumber.java
import java.util.*;
class ArmstrongNumber{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sin.nextInt(); 
		int rem;
		int sum=0;
		int original=n;
		while(n>0){
			rem=n%10; 
		    sum=sum+rem*rem*rem;   
      		n=n/10;
		}
        if(original==sum){
			System.out.println(original+"  number is Armstrong");
		}
        else{
            System.out.println(original+" number not an Armstrong");			
		}	
	}
}	
/*
F:\BHAVAJAVA\bhavawipro>javac ArmstrongNumber.java

F:\BHAVAJAVA\bhavawipro>java ArmstrongNumber
Enter a Number
153
153  number is Armstrong

F:\BHAVAJAVA\bhavawipro>java ArmstrongNumber
Enter a Number
178
178 number not an Armstrong

*/