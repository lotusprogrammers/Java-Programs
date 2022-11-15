//Call By Reference
//Call by Value
class Test {
	int i,j;
	Test(int i,int j){
		this.i=i;
		this.j=j;
    }		
	void meth(Test ob) {
		ob.i=ob.i*2;
		ob.j=ob.j/2;
		System.out.println("Inside method"+"i="+i+"\t"+"j="+j);
    }
}
class CallByRef{
	public static void main(String[] args) {
		int i=15,j=20;
		Test ob=new Test(i,j);
		System.out.println("Before Calling method"+"ob.i="+ob.i+"\t"+"ob.j="+ob.j);
		ob.meth(ob);
		System.out.println("After Calling Method"+"ob.i="+ob.i+"\t"+"ob.j="+ob.j);
	}
}	

/*
F:\BHAVAJAVA\UNIT-I>javac CallByRef.java

F:\BHAVAJAVA\UNIT-I>java CallByRef
Before Calling methodob.i=15    ob.j=20
Inside methodi=30       j=10
After Calling Methodob.i=30     ob.j=10
*/	