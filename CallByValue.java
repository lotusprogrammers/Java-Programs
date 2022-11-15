//Call by Value
class Test {
	void meth(int i,int j) {
		i=i*2;
		j=j/2;
		System.out.println("Inside method"+"i="+i+"\t"+"j="+j);
    }
}
class CallByValue{
	public static void main(String[] args) {
		Test ob=new Test();
		int i=15,j=20;
		System.out.println("Before Calling method"+"i="+i+"\t"+"j="+j);
		ob.meth(i,j);
		System.out.println("After Calling Method"+"i="+i+"\t"+"j="+j);
	}
}	
/*
F:\BHAVAJAVA\UNIT-I>javac CallByValue.java

F:\BHAVAJAVA\UNIT-I>java CallByValue
Before Calling methodi=15       j=20
Inside methodi=30       j=10
After Calling Methodi=15        j=20
*/	