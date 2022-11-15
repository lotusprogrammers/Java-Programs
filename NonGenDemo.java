class NonGen {
	Object ob; 
	NonGen(Object o) {
		ob = o;
	}
	Object getob() {
		return ob;
	}
	String showType() {
		String type=ob.getClass().getName();
		return type;
	}
}
class NonGenDemo {
	public static void main(String args[]) {
		NonGen iob= new NonGen(70);
        int v = (Integer) iob.getob();
        System.out.println("Code=" + v);
        System.out.println("Type="+iob.showType());
        NonGen sob = new NonGen("AITS is Great College");
        String str = (String)sob.getob();
        System.out.println("Name=" + str);
		System.out.println("Type="+sob.showType());
       // This compiles, but is conceptually wrong!
       //iOb = strOb;
       //v = (Integer) iOb.getob(); // run-time error!
    }
}
/*
F:\BHAVAJAVA\GENERICS>javac NonGenDemo.java

F:\BHAVAJAVA\GENERICS>java NonGenDemo
Code=70
Type=java.lang.Integer
Name=AITS is Great College
Type=java.lang.String
*/
