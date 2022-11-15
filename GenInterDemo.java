//Demonstration of Generic Interfaces
//GenInterDemo.java
interface GenInter<T>{
	void setOb(T ob);
	T getOb();
	String showType();
}	
	
class Gen<T> implements GenInter<T>{
	T ob;
	public void setOb(T ob){
		this.ob=ob;
	}
    public T getOb(){
		return ob;
	}
    public String showType(){
		String type=ob.getClass().getName();
		return type;
	}
}
class GenInterDemo{
	public static void main(String[] args){
		Gen<Integer> iob=new Gen<Integer>();
		System.out.println("Generic is Integer Type...");
		iob.setOb(7);
		System.out.println("iob value="+iob.getOb());
		System.out.println("iob type="+iob.showType());
		Gen<Double> dob=new Gen<Double>();
		dob.setOb(7.979);
		System.out.println("Generic is Double Type...");
		System.out.println("dob value="+dob.getOb());
		System.out.println("dob type="+dob.showType());
		System.out.println("Generic is String Type...");
		Gen<String> sob=new Gen<String>();
		sob.setOb("AITS is Great College");
		System.out.println("sob value="+sob.getOb());
		System.out.println("sob type="+sob.showType());
	}
}
/*
F:\BHAVAJAVA\GENERICS>javac GenInterDemo.java

F:\BHAVAJAVA\GENERICS>java GenInterDemo
Generic is Integer Type...
iob value=7
iob type=java.lang.Integer
Generic is Double Type...
dob value=7.979
dob type=java.lang.Double
Generic is String Type...
sob value=AITS is Great College
sob type=java.lang.String
*/	
		
	
		
		