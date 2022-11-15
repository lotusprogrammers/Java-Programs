class A{
	interface TestNegative{
		boolean isNegative(int num);
	}
}
class B implements A.TestNegative{
	public boolean isNegative(int num){
		if(num<0)
			return true;
		else
           return false;
	}
}
class NestedInterface{
	public static void main(String args[]){
		A.TestNegative at;
		at=new B();
		System.out.println("10 is negative?="+at.isNegative(10));
	    System.out.println("-10 is negative?="+at.isNegative(-10));
	}
}	
	
	
