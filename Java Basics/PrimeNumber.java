//To Check Whether Number is Prime Number or Not
//PrimeNumber.java
import java.util.*;
class PrimeNumber{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Number to check whether it is prime or not");
		int count=0;
		int n=sin.nextInt();
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
        }
        if(count==2){
			System.out.println(n+" is prime number");
		}
        else{
             System.out.println(n+" not a prime number");
        }
	}
}

/*
F:\BHAVAJAVA\bhavawipro>javac PrimeNumber.java


F:\BHAVAJAVA\bhavawipro>java PrimeNumber
Enter Number to check whether it is prime or not
7
7 is prime number

F:\BHAVAJAVA\bhavawipro>java PrimeNumber
Enter Number to check whether it is prime or not
100
100 not a prime number

F:\BHAVAJAVA\bhavawipro>java PrimeNumber
Enter Number to check whether it is prime or not
101
101 is prime number

F:\BHAVAJAVA\bhavawipro>java PrimeNumber
Enter Number to check whether it is prime or not
1009
1009 is prime number

F:\BHAVAJAVA\bhavawipro>
*/
     		
			