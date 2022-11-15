//NestedTry.java
import java.util.*;
class NestedTry{
	public static void main(String[] args){
		int arr[]={1,2,3,4,5};
		int a,b,c;
		Scanner sin=new Scanner(System.in);
		try{
			System.out.println("Enter index position to access ary element");
			int i=sin.nextInt();
			System.out.println("arr["+i+"]="+arr[i]);
			try{
				System.out.println("Enter a,b");
				a=sin.nextInt();
				b=sin.nextInt();
				c=a/b;
				System.out.println("Division="+c);
			}catch(ArithmeticException e){
                e.printStackTrace();
			}
		 }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
		  }
	}
}

/*
F:\BHAVAJAVA\SUNIT-III>javac NestedTry.java

F:\BHAVAJAVA\SUNIT-III>java NestedTry
Enter index position to access ary element
2
arr[2]=3
Enter a,b
10
5
Division=2

F:\BHAVAJAVA\SUNIT-III>java NestedTry
Enter index position to access ary element
10
java.lang.ArrayIndexOutOfBoundsException: 10
        at NestedTry.main(NestedTry.java:11)

F:\BHAVAJAVA\SUNIT-III>java NestedTry
Enter index position to access ary element
2
arr[2]=3
Enter a,b
10
0
java.lang.ArithmeticException: / by zero
        at NestedTry.main(NestedTry.java:16)

*/	
				
		