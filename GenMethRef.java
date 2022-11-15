interface MyFunc<T> {
	int func(T[] vals, T v);
}
class MyArrayOps {
	static <T> int countMatching(T[] vals, T v) {
		int count = 0;
		for(int i=0; i < vals.length; i++)
			if(vals[i] == v) count++;
		return count;
	}
}
class GenMethRef{
	static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
		return f.func(vals, v);
    }
	public static void main(String args[])
	{
		Integer[] vals = { 1, 2, 3, 7, 2, 3, 7, 7, 5 };
		String[] strs = { "One", "Two", "Three", "Two" };
		int count;
		count = myOp(MyArrayOps::<Integer>countMatching, vals,7);
		System.out.println("No of 7's in vals:" + count);
		count = myOp(MyArrayOps::<String>countMatching, strs,"Two");
	    System.out.println("No of Two's in vals:" + count);
   }
}

/*Input and Output
F:\BHAVAJAVA\Lambda>javac GenMethRef.java
F:\BHAVAJAVA\Lambda>java GenMethRef
No of 7's in vals:3
No of Two's in vals:2
*/


