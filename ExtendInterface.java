//ExtendInterface.java
interface A{
	void methodA1();
	void methodA2();
}
interface B extends A{
	void methodB();
}
class ABImpl implements A,B{
	public void methodA1(){
		System.out.println("From methodA1-Interface A");
	}	
	public void methodA2(){
		System.out.println("From methodA2-Interface A");
	}
	public void methodB(){
		System.out.println("From methodB-Interface B");
	}
}
class ExtendInterface{
	public static void main(String[] args) {
		B bobj=new ABImpl();
		bobj.methodA1();
		bobj.methodA2();
        bobj.methodB();
	}
}	
/*
F:\BHAVAJAVA\UNIT-II>javac ExtendInterface.java
F:\BHAVAJAVA\UNIT-II>java ExtendInterface
From methodA1-Interface A
From methodA2-Interface A
From methodB-Interface B
*/
	
