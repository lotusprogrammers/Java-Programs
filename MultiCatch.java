//MultipleCatch.java
import java.util.*;
class MultiCatch{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		int x,y,c;
		int a[]={1,2,3,4,5};
		try{
			System.out.println("Enter Choice");
			int ch=sin.nextInt();
			if(ch==1){
				System.out.println("Enter a,b");
				x=sin.nextInt();
				y=sin.nextInt();
				c=x/y;
			    System.out.println("Division="+c);
			}
			else if(ch==2){
				System.out.println("Enter index position");
				int i=sin.nextInt();
			    System.out.println("a["+i+"]="+a[i]);
		    }
		}
        catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
			e.printStackTrace();//void printStackTrace() defined in Throwable class
		}
   }
}	
/*
F:\BHAVAJAVA\SUNIT-III>javac MultiCatch.java

F:\BHAVAJAVA\SUNIT-III>java MultiCatch
Enter Choice
1
Enter a,b
10
5
Division=2

F:\BHAVAJAVA\SUNIT-III>java MultiCatch
Enter Choice
1
Enter a,b
10
0
java.lang.ArithmeticException: / by zero
        at MultiCatch.main(MultiCatch.java:15)

F:\BHAVAJAVA\SUNIT-III>java MultiCatch
Enter Choice
2
Enter index position
2
a[2]=3

F:\BHAVAJAVA\SUNIT-III>java MultiCatch
Enter Choice
2
Enter index position
12
java.lang.ArrayIndexOutOfBoundsException: 12
        at MultiCatch.main(MultiCatch.java:21)

*/




















			
			
	