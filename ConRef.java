// Demonstrate a Constructor reference.
interface MyFunc {
	MyClass func(String s,int n);
}
class MyClass {
	private String sval;
	private int ival;
	MyClass() {
		sval = null;
		ival=0;
       
	}
	MyClass(String sv,int iv) {
		sval = sv; 
		ival=iv;
		
	}
    String getSVal() {
		return sval;
	}
	int getIVal(){
		return ival;
	}	
}
class ConRef {
	public static void main(String args[])
	{
		MyFunc m = MyClass::new;
		MyClass mc = m.func("AITS",70);
		System.out.println("val in mc is " + mc.getSVal( ));
		System.out.println("val in mc is " + mc.getIVal( ));
		
	
    }
}

/*Input and Output
F:\BHAVAJAVA\Lambda>javac ConRef.java
F:\BHAVAJAVA\Lambda>java ConRef
val in mc is 100
*/