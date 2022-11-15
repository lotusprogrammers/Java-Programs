//MethodOverload.java
class Sum {
	int addition(int a){
		return(a+2);
	}
    int addition(int a,int b,int c){
		return (a+b+c);
	}
    int addition(int a,int b){
		return (a+b);
	}
    float addition(float a,float b,float c,float d) {
		return(a+b+c+d);
	}
    float addition(float a,float b,float c,int d,int e) {
		return (a+b+c+d+e);
	}
}
class MethodOverload {
	public static void main(String[] args) {
		Sum s=new Sum();
		int add;
		add=s.addition(2);
		System.out.println("Calling addition from Single argument sum method="+add);
		add=s.addition(2,5);
		System.out.println("From 2 arguments sum method="+add);
		add=s.addition(2,5,7);
		System.out.println("From 3 arguments sum method="+add);
		float addf;
		addf=s.addition(2.5F,5.7F,7.8F,9.7F);
		System.out.println("From 4 arguments sum method="+addf);
		addf=s.addition(2.5F,5.7F,7.8F,2,5);
		System.out.println("From 5 arguments sum method="+addf);
	}
}	
/*
Output
F:\BHAVAJAVA\UNIT-I>javac MethodOverload.java
F:\BHAVAJAVA\UNIT-I>java MethodOverload
Calling addition from Single argument sum method=4
From 2 arguments sum method=7
From 3 arguments sum method=14
From 4 arguments sum method=25.7
From 5 arguments sum method=23.0
*/	
		
		
		
		
