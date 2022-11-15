// Demonstrate the multi-catch feature.
//MultiException.java
import java.util.*;
class MultiException {
	public static void main(String args[]) {
		Scanner sin=new Scanner(System.in);
		int a=10,b=0;
		int arr[]={1,2,3};
		try {
			 System.out.println("1 for Division 2 for Array Accessing");
			 System.out.println("Enter Choice c=");
			 int c=sin.nextInt();
			 if(c==1){
			    c=a/b;//Generate an ArithmeticException
			    System.out.println("Division="+c);
			 }	
			 else if(c==2)
				arr[10]=19; //Generate an ArrayIndexOutOfBoundsException
		   } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception caught="+e);
    }
	System.out.println("After multi-catch...");
  }
}

/*

*/