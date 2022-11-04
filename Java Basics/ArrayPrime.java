//Sum of Prime Numbers from Array and Printing Prime Numbers from Array
import java.util.*;
class ArrayPrime{
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
		int sum=0;
		int ele;
		int count;
		System.out.println("\nPrime Numbers are...");
        for(int i=0;i<n;i++){
			ele=a[i];
			count=0;
			for(int j=1;j<=ele;j++){
				if(ele%j==0){
					count=count+1;
				}
            }
            if(count==2){
				 sum=sum+ele;
                 System.out.println(ele+"\t");				
			}				
		}
        System.out.println("\nSum of Prime Numbers of Array="+sum);
    }
}	

/*
F:\BHAVAJAVA\bhavawipro>javac ArrayPrime.java

F:\BHAVAJAVA\bhavawipro>java ArrayPrime
Enter Size of Array
10
Enter Array Elements...
2
3
4
8
12
17
23
28
15
18

Displaying Array Elements Using for each loop...
2       3       4       8       12      17      23      28      15      18
Prime Numbers are...
2
3
17
23

Sum of Prime Numbers of Array=45

F:\BHAVAJAVA\bhavawipro>
*/





















*/





















			
		