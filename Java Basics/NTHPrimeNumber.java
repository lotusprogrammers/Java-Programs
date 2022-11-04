//To Check Whether Number is Prime Number or Not
import java.util.*;
class NTHPrimeNumber{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter range to print Prime Numbers...");
		int n;
		int count;
		int input1=sin.nextInt();
		int prime=0;
		int pcount=0;
		int i=1;
		while(true){
		   n=i;
           count=0;		   
		   for(int j=1;j<=n;j++){
			   if(n%j==0){
				  count++;
			   }  
		   }
		   if(count==2){
			   if(pcount==input1)
			   break;
			   prime=n;
			   pcount++;
		   }
           i++;		   
        }
       	System.out.print(prime+"\t");
    }
}

/*
F:\BHAVAJAVA\bhavawipro>javac NTHPrimeNumber.java

F:\BHAVAJAVA\bhavawipro>java NTHPrimeNumber
Enter range to print Prime Numbers...
1000
7919
*/
     		
			