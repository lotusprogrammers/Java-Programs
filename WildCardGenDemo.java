//WildCardDemo.java
class WildGen<T>{
	T ob;
	WildGen(T ob){
		this.ob=ob;
	}
    String showType(){
		String type=ob.getClass().getName();
		return type;
	}
	boolean sameType(WildGen<?> wob){
		if(this.showType()==wob.showType())
			return true;
		else
			return false;
    }
}
class WildCardGenDemo{
	public static void main(String[] args){
		WildGen<Integer> iob=new WildGen<Integer>(7);
		WildGen<Integer> iob1=new WildGen<Integer>(7);
		WildGen<Double> dob=new WildGen<Double>(7.979);
		WildGen<String> sob=new WildGen<String>("AITS is Great College");
		System.out.println("Types of iob,iob1 are equal?="+iob.sameType(iob1));
		System.out.println("Types of iob,dob are equal?="+iob.sameType(dob));
		System.out.println("Types of iob,sob are equal?="+iob.sameType(sob));
   }
}
/*
F:\BHAVAJAVA\GENERICS>javac WildCardGenDemo.java

F:\BHAVAJAVA\GENERICS>java WildCardGenDemo
Types of iob,iob1 are equal?=true
Types of iob,dob are equal?=false
Types of iob,sob are equal?=false
*/	
		
	
		
		