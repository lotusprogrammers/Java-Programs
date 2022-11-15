//GenDemo.java
class Gen<T extends Number>{
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
class BoundedGenDemo{
	public static void main(String[] args){
		Gen<Integer> iob=new Gen<Integer>(7);
		System.out.println("Generic is Integer Type...");
		System.out.println("iob value="+iob.getOb());
		System.out.println("iob type="+iob.showType());
		Gen<Double> dob=new Gen<Double>(7.979);
		System.out.println("Generic is Double Type...");
		System.out.println("dob value="+dob.getOb());
		System.out.println("dob type="+dob.showType());
   }
}
/*
F:\BHAVAJAVA\GENERICS>javac BoundedGenDemo.java

F:\BHAVAJAVA\GENERICS>java BoundedGenDemo
Generic is Integer Type...
iob value=7
iob type=java.lang.Integer
Generic is Double Type...
dob value=7.979
dob type=java.lang.Double

*/	
		
	
		
		