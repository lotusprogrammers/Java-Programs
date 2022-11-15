//Print numbers from 1...n Using for loop
import java.util.*;
class NumbersForOdd{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Chitti Counts Odd numbers from step-1 to step-n");
		int n=sin.nextInt();
		for(int i=1;i<=n;i++){
			/*if(i%2==0){
				continue;
			}	
			else{
				System.out.println("Odd Number="+i);
			}*/
			
			if(i%2!=0)
				System.out.println("Odd Number="+i);
			
        }
        		
	}
}	
		