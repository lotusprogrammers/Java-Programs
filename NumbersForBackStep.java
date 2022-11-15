//Print numbers from 1...n Using for loop
import java.util.*;
class NumbersForBackStep{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Chitti Walks from step-1 to step-n");
		int n=sin.nextInt();
		for(int i=n;i>=0;i--){
			System.out.println("Chitti steps in backward="+i);
        }
        		
	}
}	
		