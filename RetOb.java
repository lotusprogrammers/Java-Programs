//Returning Object by Method
class Test {
	int a;
	Test(int a) {
		this.a=a;
	}
    Test incByTen(){
		Test temp=new Test(a+10);
		return temp;
	}
}
class RetOb {
	public static void main(String[] args) {
		Test ob=new Test(2);
		Test ob1=ob.incByTen();
		System.out.println("ob.a="+ob.a);
		System.out.println("ob1.a="+ob1.a);
	}
}	
/*
F:\BHAVAJAVA\UNIT-I>javac RetOb.java
F:\BHAVAJAVA\UNIT-I>java RetOb
ob.a=2
ob1.a=12
*/
		
	
	
		