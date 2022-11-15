//SumArrayRange.java
//Sum of Array Elements with in the respective range.
import java.util.*;
class SumArrayRange{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter range of Array...");
		int range=sin.nextInt();
		int a[]=new int[range];
		System.out.println("Enter Array Elements");
		for (int i=0;i<range;i++)
			a[i]=sin.nextInt();
		System.out.println("Enter start Index");
		int si=sin.nextInt();
		System.out.println("Enter end index");
		int ei=sin.nextInt();
		int ra[]=new int[range];
		if(si<0){
			System.out.println("Start Index out of Boundary");
			return;
		}
        else if(ei>=range-1){
            System.out.println("End Index out of Boundary");
			return;
		}
        else{
			int sum=0;
			for(int i=si;i<=ei;i++){
				sum=sum+a[i];
			}
			System.out.println("Array Elements with in respective range...");
			for(int i=si;i<=ei;i++){
				System.out.println(a[i]);
			}	
			System.out.println("Sum of Array Elements from"+si+" index element is"+a[si]+" to "+ei+" index element"+a[ei]+"="+sum);
		}
	}
}	
		
				
        			
			