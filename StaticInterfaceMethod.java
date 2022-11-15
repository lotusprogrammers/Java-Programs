interface Sample{
	//static method
	static void staticMethod(){
		System.out.println("We are AITS students");
	}
	String getMyBranch();
}
class SampleImpl implements Sample{
	public String getMyBranch(){
		return "CSE";
	}
}
class StaticInterfaceMethod{
	public static void main(String args[]){
		Sample s=new SampleImpl();
		//Call static method
		Sample.staticMethod();
		System.out.println("My Branch="+s.getMyBranch());
	}
}	
/*
F:\BHAVAJAVA\UNIT-II>javac StaticInterfaceMethod.java

F:\BHAVAJAVA\UNIT-II>java StaticInterfaceMethod
We are AITS students
My Branch=CSE
*/
		
	
	
		