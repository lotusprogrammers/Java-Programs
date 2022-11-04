//Increment and Decrement Operators
class IncDec{
	public static void main(String[] args){
		int a=10;
		int x;
		x=++a;
		System.out.println("x="+x);
		System.out.println("a="+a);//At line 6 a=11
		x=a++;//x=11 a=12
		System.out.println("x="+x);
		System.out.println("a="+a);//At line 9 a=12
		x=--a;//x=11 a=11
		System.out.println("x="+x);
		System.out.println("a="+a);//At line 12 a=11 
		x=a--;//x=11 a=10
		System.out.println("x="+x);
		System.out.println("a="+a);//At line 15 a=10
		x=++a + a++;//x=11+11=22
		System.out.println("x="+x);
		System.out.println("a="+a);//At line 18=12
	}
}	
/*
F:\BHAVAJAVA\bhavawipro>javac IncDec.java

F:\BHAVAJAVA\bhavawipro>java IncDec
x=11
a=11
x=11
a=12
x=11
a=11
x=11
a=10
x=22
a=12
*/