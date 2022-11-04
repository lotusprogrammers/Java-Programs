//Sum of Palindrome Numbers from Array and Printing Prime Numbers from Array
import java.util.*;
class ArrayPalindrome{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n=sin.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Elements...");
		for(int i=0;i<n;i++){
			a[i]=sin.nextInt();
		}
		System.out.println("\nDisplaying Array Elements Using for each loop...");
		for(int x:a){
			System.out.print(x+"\t");
	    }		
		int sum=0,sump;
		int ele;
		int rem;
		System.out.println("\nPalindrome Numbers are...");
        for(int i=0;i<n;i++){
			ele=a[i];
			sump=0;
			while(ele>0){
				rem=ele%10;
				sump=sump*10+rem;
				ele=ele/10;
			}
            if(sump==a[i]){
               sum=sum+a[i];//sum=sum+sump;
               System.out.println(a[i]);   			   
			}	
		}
        System.out.println("\nSum of Palindrome Numbers of Array="+sum);
    }
}	

/*
F:\BHAVAJAVA\bhavawipro>javac ArrayPalindrome.java

F:\BHAVAJAVA\bhavawipro>java ArrayPalindrome
Enter Size of Array
5
Enter Array Elements...
1
153
275
989
2555

Displaying Array Elements Using for each loop...
1       153     275     989     2555
Palindrome Numbers are...
1
989

Sum of Palindrome Numbers of Array=990

F:\BHAVAJAVA\bhavawipro>

*/








































			
		