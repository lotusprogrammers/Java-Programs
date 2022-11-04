//Static Keyword Demonstration
//static method accessing non-static method same class
//StaticDemo1.java
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
		//nonstaticA(); Error! non static methods not directly called in static methods
		StaticEx se=new StaticEx();
		se.nonstaticA();
	}
	void nonstaticA(){
		System.out.println("Non static Member a accessible="+a);
	}	
}
class StaticDemo1 {
	public static void main(String[] args){
		System.out.println("Static Member from StaticEx class s="+StaticEx.s);
		StaticEx.accessS();
		StaticEx se=new StaticEx();
		System.out.println("Non Static Member from StaticEx class a="+se.a);
		se.nonstaticA();
	}
}	

/*
F:\BHAVAJAVA\bhavawipro>javac StaticDemo1.java

F:\BHAVAJAVA\bhavawipro>java StaticDemo1
Static block initiated
Static Member from StaticEx class s=10
s accessible=10
Constructor Executed
Non static Member a accessible=20
Constructor Executed
Non Static Member from StaticEx class a=20
Non static Member a accessible=20

*/
   	
		
