//Demonstration of Inheritance from Non Generic class to Generic class
class GenSuper{
	int ob;
	GenSuper(int ob){
		this.ob=ob;
	}
    int getOb(){
		return ob;
	}
}
class GenSub<V> extends GenSuper{
	V ob1;
	GenSub(int ob,V ob1){
		super(ob);
		this.ob1=ob1;
	}
	V getOb1(){
		return ob1;
	}
}
class GenNonGenDemo{
	public static void main(String[] args){
		GenSub<String> gs=new GenSub<String>(70,"AITS");
		System.out.println("College Code="+gs.getOb());
		System.out.println("College Name="+gs.getOb1());
	}
}	

/*
F:\BHAVAJAVA\GENERICS>javac GenNonGenDemo.java

F:\BHAVAJAVA\GENERICS>java GenNonGenDemo
College Code=70
College Name=AITS
*/
		
 	
		
	
	
		
	