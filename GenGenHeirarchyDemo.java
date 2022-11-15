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
class GenSub<T> extends GenSuper<T>{
	T ob;
	GenSub(T ob){
		super(ob);
	}
	T getOb(){
		return ob;
	}
}
class GenGenHeirarchyDemo{
	public static void main(String[] args){
		GenSuper<Integer> gsupi=new GenSuper<Integer>(70);
		GenSub<Integer> gsubi=new GenSub<Integer>(90);
		GenSub<String>  gsubs=new GenSub<String>("AITS");
		System.out.print("gsupi is instance of GenSuper?=");
		System.out.println((gsupi instanceof GenSuper<?>));
		System.out.print("gsubi is instance of GenSuper?=");
		System.out.println((gsubi instanceof GenSuper<?>));
		System.out.print("gsubs is instance of GenSuper?=");
		System.out.println((gsubs instanceof GenSuper<?>));
		System.out.print("gsubi is instance of GenSub?=");
		System.out.println((gsubi instanceof GenSub<?>));
		System.out.print("gsubs is instance of GenSub?=");
		System.out.println((gsubs instanceof GenSub<?>));
		System.out.print("gsubi is instance of GenSub?=");
		System.out.println((gsupi instanceof GenSub<?>));
	}
}	

/*
F:\BHAVAJAVA\GENERICS>javac GenGenHeirarchyDemo.java
F:\BHAVAJAVA\GENERICS>java GenGenHeirarchyDemo
gsupi is instance of GenSuper?=true
gsubi is instance of GenSuper?=true
gsubs is instance of GenSuper?=true
gsubi is instance of GenSub?=true
gsubs is instance of GenSub?=true
gsubi is instance of GenSub?=false

*/
		
 	
		
	
	
		
	