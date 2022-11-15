//Demonstration of Inheritance from Generic class to Generic class
class GenSuper<T>{
	T ob;
	GenSuper(T ob){
		this.ob=ob;
	}
    T getOb(){
		return ob;
	}
}
class GenSub<T,V> extends GenSuper<T>{
	V ob1;
	GenSub(T ob,V ob1){
		super(ob);
		this.ob1=ob1;
	}
	V getOb1(){
		return ob1;
	}
}
class GenGenDemo{
	public static void main(String[] args){
		GenSub<Integer,String> gs=new GenSub<Integer,String>(70,"AITS");
		System.out.println("College Code="+gs.getOb());
		System.out.println("College Name="+gs.getOb1());
	}
}	

/*
F:\BHAVAJAVA\GENERICS>javac GenGenDemo.java

F:\BHAVAJAVA\GENERICS>java GenGenDemo
College Code=70
College Name=AITS
*/
		
 	
		
	
	
		
	