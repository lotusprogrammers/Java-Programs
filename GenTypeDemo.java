//GenDemo.java
class Gen<T,V>{
	T ob1;
	V ob2;
	Gen(T ob1,V ob2){
		this.ob1=ob1;
		this.ob2=ob2;
	}
    T getOb1(){
		return ob1;
	}
    V getOb2(){
		return ob2;
	}
}
class GenTypeDemo{
	public static void main(String[] args){
		Gen<Integer,String> gis=new Gen<>(70,"AITS");
		System.out.println("College Code="+gis.getOb1());
		System.out.println("College Name="+gis.getOb2());
	}
}
/*
F:\BHAVAJAVA\GENERICS>javac GenTypeDemo.java

F:\BHAVAJAVA\GENERICS>java GenTypeDemo
College Code=70
College Name=AITS

*/	
		
	
		
		