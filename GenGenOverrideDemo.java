//Demonstration of Inheritance from Generic class to Generic class
class GenSuper<T>{
	T ob;
	GenSuper(T ob){
		this.ob=ob;
	}
    T getOb(){
		System.out.println("From Super class getOb() method");
		return ob;
	}
}
class GenSub<T> extends GenSuper<T>{
	GenSub(T ob){
		super(ob);
	}
	//This method overriden from GenSuper class
	T getOb(){
		System.out.println("From Sub class getOb() method");
		return ob;
	}
}
class GenGenOverrideDemo{
	public static void main(String[] args){
		GenSuper<Integer> gs;
		//Super class Generic reference refering super class generic object
		gs=new GenSuper<Integer>(70);
		System.out.println("Super class ob="+gs.getOb());
		//Super class Generic reference refering sub class generic object
		gs=new GenSub<Integer>(79);
		System.out.println("Calling sub class ob="+gs.getOb());
	}
}	

/*
F:\BHAVAJAVA\GENERICS>java GenGenOverrideDemo
From Super class getOb() method
Super class ob=70
From Sub class getOb() method
Calling sub class ob=79*/
		
 	
		
	
	
		
	