//GenDemo.java
class Gen<T>{
	T ob;
	Gen(T ob){
		this.ob=ob;
	}
    T getOb(){
		return ob;
	}
    String showType(){
		String type=ob.getClass().getName();
		return type;
	}
}
class GenDemo{
	public static void main(String[] args){
		Gen<Integer> iob=new Gen<Integer>(70);
		System.out.println("Generic is Integer Type...");
		System.out.println("iob value="+iob.getOb());
		System.out.println("iob type="+iob.showType());
		Gen<Double> dob=new Gen<Double>(7.979);
		System.out.println("Generic is Double Type...");
		System.out.println("dob value="+dob.getOb());
		System.out.println("dob type="+dob.showType());
		System.out.println("Generic is String Type...");
		Gen<String> sob=new Gen<String>("AITS is Great College");
		System.out.println("sob value="+sob.getOb());
		System.out.println("sob type="+sob.showType());
	}
}
/*
F:\BHAVAJAVA\GENERICS>javac GenDemo.java
F:\BHAVAJAVA\GENERICS>java GenDemo
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
		
	
		
		