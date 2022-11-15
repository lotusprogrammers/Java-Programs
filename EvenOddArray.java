//Of 5 numbers, how many are even or odd?
//EvenOddArray.java
import java.util.*;
class EvenOddArray{
	public static void main(String[] args){
		int arr[]=new int[5];
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter 5 Numbers");
		for(int i=0;i<5;i++)
			arr[i]=sin.nextInt();
		System.out.println("Enter String as 'even' or 'odd' or 'All' ");
		String name=sin.next();
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<5;i++){
			if(arr[i]%2==0)
				evencount=evencount+1;
			else
				oddcount=oddcount+1;
		}
        if(name.equals("even"))		
			System.out.println("No of  Even Numbers="+evencount);
		else if(name.equals("odd"))
			System.out.println("No of Odd Numbers="+oddcount);
		else if(name.equals("All"))
			System.out.println("Total no of odd and even numbers="+arr.length);
	}
}	
/*
F:\BHAVAWIPRO23\BhavaWiproMettl>javac EvenOddArray.java

F:\BHAVAWIPRO23\BhavaWiproMettl>java EvenOddArray
Enter 5 Numbers
7
8
9
12
15
Enter String as 'even' or 'odd' or 'All'
even
No of  Even Numbers=2

F:\BHAVAWIPRO23\BhavaWiproMettl>java EvenOddArray
Enter 5 Numbers
7
8
9
12
15
Enter String as 'even' or 'odd' or 'All'
All
Total no of odd and even numbers5


*/
			
