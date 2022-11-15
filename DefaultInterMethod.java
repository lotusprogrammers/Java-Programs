interface Arithemetic{
	int add(int a,int b);
	int sub(int a,int b);
	int mul(int a,int b);
	float div(int a,int b);
	//deafult method
	default void show(){
		System.out.println("Deafult Method from Arithemetic Interface");
	}
}
class ArithemeticImpl implements Arithemetic{
	public int add(int a,int b){
		return (a+b);
	}	
	public int sub(int a,int b){
		return (a-b);
	}	
    public int mul(int a,int b){
		return (a*b);
	}	
    public float div(int a,int b){
		return (float)a/b;
	}	 	
}
class DefaultInterMethod{
	public static void main(String[] args){
		Arithemetic ar=new ArithemeticImpl();
		//Calling Default method
		ar.show();
		System.out.println("Addition="+ar.add(2,5));
		System.out.println("Subtraction="+ar.sub(5,2));
		System.out.println("Multiplication="+ar.mul(9,9));
		System.out.println("Division="+ar.div(9,7));
		}
}	
/*
F:\BHAVAJAVA\UNIT-II>javac DefaultInterMethod.java

F:\BHAVAJAVA\UNIT-II>java DefaultInterMethod
Deafult Method from Arithemetic Interface
Addition=7
Subtraction=3
Multiplication=81
Division=1.2857143
*/
	