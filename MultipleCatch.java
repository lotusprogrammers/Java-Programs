// Demonstrate the multiple-catch feature.
//MultipleCatch.java
import java.util.*;
class MultipleCatch {
	public static void main(String args[]) {
		Scanner sin=new Scanner(System.in);
		int a=10,b=0;
		int arr[]={1,2,3};
		try {
			 System.out.println("1 for Division 2 for Array Accessing");
			 System.out.println("Enter Choice c=");
			 int c=sin.nextInt();
			 if(c==1){
			    //Generate an ArithmeticException
				c=a/b;
			    System.out.println("Division="+c);
			 }	
			 else if(c==2){
				 //Generate an ArrayIndexOutOfBoundsException
			   	 arr[10]=19;
			 }	 
		   } catch(ArithmeticException  e) {
		        //The below method prints Exception Information 
				e.printStackTrace();
             }
			 catch(ArrayIndexOutOfBoundsException e){
				 e.printStackTrace();//prints Exception Information
			 }	 
	System.out.println("After multiple catch...");
  }
}

/*
F:\BHAVAJAVA\UNIT-III>javac MultipleCatch.java

F:\BHAVAJAVA\UNIT-III>java MultipleCatch
1 for Division 2 for Array Accessing
Enter Choice c=
1
java.lang.ArithmeticException: / by zero
        at MultipleCatch.main(MultipleCatch.java:15)
After multiple catch...

F:\BHAVAJAVA\UNIT-III>java MultipleCatch
1 for Division 2 for Array Accessing
Enter Choice c=
2
java.lang.ArrayIndexOutOfBoundsException: 10
        at MultipleCatch.main(MultipleCatch.java:20)
After multiple catch...
*/