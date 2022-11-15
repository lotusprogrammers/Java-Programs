//Bitwise operators
import java.util.*;
class Bitwise{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a,b");
		a=sin.nextInt();
		b=sin.nextInt();
		c=a&b;
		System.out.println("a&b="+c);
		c=a|b;
		System.out.println("a|b="+c);
		c=a^b;
		System.out.println("a^b="+c);
		c=a<<2;
		System.out.println("a<<2="+c);
		c=a>>2;
		System.out.println("a>>2="+c);
		c=a>>>2;
		System.out.println("a>>>2="+c);
	}
}

/*
F:\BHAVAJAVA\EEE>javac Bitwise.java

F:\BHAVAJAVA\EEE>java Bitwise
Enter a,b
60
20
a&b=20
a|b=60
a^b=40
a<<2=240
a>>2=15
a>>>2=15

F:\BHAVAJAVA\EEE>java Bitwise
Enter a,b
-60
20
a&b=4
a|b=-44
a^b=-48
a<<2=-240
a>>2=-15
a>>>2=1073741809

F:\BHAVAJAVA\EEE>java Bitwise
Enter a,b
-2
2
a&b=2
a|b=-2
a^b=-4
a<<2=-8
a>>2=-1
a>>>2=1073741823

*/








	
    