//StaticDemo.java
class StaticDemo {
	//static data 
	static int s=5;
	static {
		System.out.println("Static block Initiated");
		s=s*50;
	}
	static void smethod() {
		s=s+10;//250+10=260
		System.out.println("From Static Method s="+s);//260
	}
    //Non static method
	void method() {
		//Static data accesing
		System.out.println("Calling from Non static method....");
		System.out.println("From method="+StaticDemo.s);//250
		StaticDemo.smethod();
    }		
		
	public static void main(String[] args) {
		StaticDemo sd=new StaticDemo();
		sd.method();
	}
}	
/*
F:\BHAVAJAVA\UNIT-I>javac StaticDemo.java
F:\BHAVAJAVA\UNIT-I>java StaticDemo
Static block Initiated
Calling from Non static method....
From method=250
From Static Method s=260
*/