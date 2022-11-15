//Demonstration of Bridge Methods
class GenSuper<T>{
	T ob;
	GenSuper(T ob){
		this.ob=ob;
	}
    T getOb(){
		System.out.println("From Super class getOb()");
		return ob;
	}
}
class GenSub extends GenSuper<String>{
	GenSub(String ob){
		super(ob);
	}
	String getOb(){
		System.out.println("From Sub class getOb()");
		return ob;
	}
}
class GenBridgeDemo{
	public static void main(String[] args){
		// Create a Gen2 object for Strings.
		GenSub sob = new GenSub("AITS is Great College");
		System.out.println(sob.getOb());
	}
}	

/*
F:\BHAVAJAVA\GENERICS>javac GenBridgeDemo.java

F:\BHAVAJAVA\GENERICS>java GenBridgeDemo
AITS is Great College
*/
		
 	
		
	
	
		
	