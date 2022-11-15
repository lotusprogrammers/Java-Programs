//GenDemo.java
class Gen<T,V>{
	T ob1;
	V ob2;
	Gen(T o1,V o2){
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
class GenTypeInferenceDemo{
	public static void main(String[] args){
		Gen<Integer,String> gis=new Gen<>(70,"AITS");
		System.out.println("Generic is Integer Type...");
		System.out.println("College Code="+gis.getOb1());
		System.out.println("College Name="+gis.getOb2());
	}
}
/*

*/	
		
	
		
		