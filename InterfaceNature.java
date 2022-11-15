interface Nature{
	String resource="air";
	void useIt();
	void protectIt();
}
class Human implements Nature{
	public void useIt(){
		System.out.println("I am Using nature air in right way");
		resource=resource+"polution"; //resource can n't changed
		System.out.println("Nature Resource="+resource);
	}
	/* public void protectIt(){
		System.out.println("I Shall take promise to protect Nature");
		System.out.println("I preserve "+resource+"resource");
	   } */	
}
class InterfaceDemo{
	public static void main(String[] args){
		Nature n1=new Nature(); //Nature can n't instantiated
		Nature n=new Human();
		n.useIt();
		n.protectIt();
	}
}
	
/*
F:\BHAVAJAVA\SUNIT-II>javac InterfaceNature.java
InterfaceNature.java:6: error: Human is not abstract and does not override abstract method protectIt() in Nature
class Human implements Nature{
^
InterfaceNature.java:9: error: cannot assign a value to final variable resource
                resource=resource+"polution"; //resource can n't changed
                ^
InterfaceNature.java:19: error: Nature is abstract; cannot be instantiated
                Nature n1=new Nature(); //Nature can n't instantiated
                          ^
3 errors
*/	
	
