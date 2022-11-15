//DataTypeDemo.java
import java.lang.*;
import java.util.*;
class DataTypesDemo{
	public static void main(String args[]){
		Scanner sin=new Scanner(System.in);
		int i;
		System.out.println("Enter i for integer=");
		i=sin.nextInt();
		float f;
		System.out.println("Enter f for float=");
		f=sin.nextFloat();
	    char c;
		System.out.println("Enter c for character=");
		c=sin.next().charAt(0);
		long l;
		System.out.println("Enter l for long int=");
		l=sin.nextLong();
		byte b;
		System.out.println("Enter b for byte=");
		b=sin.nextByte();
		short s;
		System.out.println("Enter s for short int=");
		s=sin.nextShort();
		boolean bl;
		System.out.println("Enter bl for boolean=");
		bl=sin.nextBoolean();
		System.out.println("Integer i="+i);
		System.out.println("Float f="+f);
		System.out.println("Character c="+c);
		System.out.println("Byte b="+b);
		System.out.println("Long l="+l);
		System.out.println("short i="+s);
		System.out.println("Boolean i="+bl);
	}
}	

/*
F:\BHAVAJAVA\2021>javac DataTypesDemo.java
F:\BHAVAJAVA\2021>java DataTypesDemo
Enter i for integer=
123456789
Enter f for float=
12345678.123456789
Enter c for character=
j
Enter l for long int=
1234567891202345
Enter b for byte=
124
Enter s for short int=
25725
Enter bl for boolean=
true
Integer i=123456789
Float f=1.2345678E7
Character c=j
Byte b=124
Long l=1234567891202345
short i=25725
Boolean i=true
*/
