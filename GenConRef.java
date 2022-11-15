// Demonstrate a constructor reference with a generic class.
interface MyFunc<T> {
	MyClass<T> func(T n);
}
class MyClass<T> {
	private T val;
	MyClass(T v) {
		val = v;
	}
	MyClass( ) { 
		val = null;
	}
	T getVal() {
		return val;
	}
}
class GenConRef {
	public static void main(String args[])
	{
	// Create a reference to the MyClass<T> constructor.
	MyFunc<Integer> conRef1 = MyClass<Integer>::new;
	// Create an instance of MyClass<T> through constructor reference
	MyClass<Integer> mi = conRef1.func(70);
	System.out.println("College Code: " + mi.getVal( ));
    // Create a reference to the MyClass<T> constructor.
	MyFunc<String> conRef2 = MyClass<String>::new;
	// Create an instance of MyClass<T> through constructor reference
	MyClass<String> ms = conRef2.func("AITS");
	System.out.println("College Name: " + ms.getVal( ));
   }
}

/*Input and Output
F:\BHAVAJAVA\Lambda>javac GenConRef.java
F:\BHAVAJAVA\Lambda>java GenConRef
College Code: 70
College Name: AITS
*/