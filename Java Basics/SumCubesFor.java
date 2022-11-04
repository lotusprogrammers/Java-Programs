//Sum of Cubes of Numbers from 1...n using For loop
import java.util.*;
class SumCubesFor{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter n...");
		int n=sin.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i*i*i; 
		}	
		System.out.println("Sum of Cubes="+sum);
	}
}
/*
F:\BHAVAJAVA\bhavawipro>java SumCubes
Enter n...
5
Sum of Cubes=225

F:\BHAVAJAVA\bhavawipro>java SumCubes
Enter n...
10
Sum of Cubes=3025
*/	
			
		