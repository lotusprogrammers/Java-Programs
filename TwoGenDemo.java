//TwoGenDemo.java
class TwoGen<T1,T2>{
	T1 ob1;
	T2 ob2;
	TwoGen(T1 ob1,T2 ob2){
		this.ob1=ob1;
		this.ob2=ob2;
	}
    T1 getOb1(){
		return ob1;
	}
	T2 getOb2(){
		return ob2;
	}	
    String showType1(){
		String type=ob1.getClass().getName();
		return type;
	}
	String showType2(){
		String type=ob2.getClass().getName();
		return type;
	}	
	
		
}
class TwoGenDemo{
	public static void main(String[] args){
		TwoGen<Integer,String> ob=new TwoGen<Integer,String>(70,"AITS");
		System.out.println("Two Argument Generic ...");
		System.out.println("College Code="+ob.getOb1());
		System.out.println("Collge Code type="+ob.showType1());
		System.out.println("College Name="+ob.getOb2());
		System.out.println("Collge Name Type="+ob.showType2());
		
		
	}
}
/*
F:\BHAVAJAVA\GENERICS>javac TwoGenDemo.java

F:\BHAVAJAVA\GENERICS>java TwoGenDemo
Two Argument Generic ...
College Code=70
Collge Code type=java.lang.Integer
College Name=AITS
Collge Name Type=java.lang.String
*/	
		
	
		
		