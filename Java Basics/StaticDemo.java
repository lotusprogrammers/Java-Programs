//Static Keyword Demonstration
//StaticDemo.java
class StaticEx{
	int a;
	static int s;
	StaticEx(){
		System.out.println("Constructor Executed");
		a=20;
	}	
	static{//static block
		System.out.println("Static block initiated");
		s=10;
	}
    static void accessS(){
		System.out.println("s accessible="+s);
	}
	void nonstaticA(){
		System.out.println("Non static Member a accessible="+a);
	}	
}
class StaticDemo {
	public static void main(String[] args){
		System.out.println("Static Member from StaticEx class s="+StaticEx.s);
		StaticEx.accessS();
		StaticEx se=new StaticEx();
		System.out.println("Non Static Member from StaticEx class a="+se.a);
		se.nonstaticA();
	}
}	

/*

F:\BHAVAJAVA\bhavawipro>javac StaticDemo.java
F:\BHAVAJAVA\bhavawipro>java StaticDemo
Static block initiated
Static Member from StaticEx class s=10
s accessible=10
Constructor Executed
Non Static Member from StaticEx class a=20
Non static Member a accessible=20
*/
   	
		
