//FibonacciSeries.java
import java.util.*;
class FibonacciSeries{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter range");
		int range=sin.nextInt();
		int a,b,c;
		a=-1;
		b=1;
		for(int i=1;i<=range;i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}	
/*
F:\BHAVAJAVA\UNIT-I>javac FibonacciSeries.java

F:\BHAVAJAVA\UNIT-I>java FibonacciSeries
Enter range
10
0 1 1 2 3 5 8 13 21 34

*/