//StaticEx.java
class StaticSample{
    static int a=20;
    int b=30;
	public void setValues(int a1,int b1){
		a=a+a1;
		b=b+b1;
	}
    public void showValues(){
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
class StaticEx{
	public static void main(String[] args){
		StaticSample s=new StaticSample();
		s.setValues(200,300);
		s.showValues();
		System.out.println("Static Member 'a' Accessible thorugh Class name="+StaticSample.a);
		System.out.println("Non static member 'b' Accessible thorugh object only="+s.b);
	}	
}	
/*
F:\>javac StaticEx.java

F:\>java StaticEx
a=220
b=330
Static Member 'a' Accessible thorugh Class name=220
Non static member 'b' Accessible thorugh object only=330
*/	
	
		
		