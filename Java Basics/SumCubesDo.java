//Sum of Cubes of Numbers from 1...n using do-while loop
import java.util.*;
class SumCubesDo{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter n...");
		int n=sin.nextInt();
		int sum=0;
		int i=1;
		do{
			sum=sum+i*i*i; 
			i=i+1;
		}while(i<=n);
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
			
		