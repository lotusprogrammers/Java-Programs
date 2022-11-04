//Type Conversion
class TestTypeConversion{
	public static void main(String[] args){
		int a=128;
		short b;
		b=(short)a;//Explicit Type Conversion
		long l;
		l=a;//Implcit Type Conversion
		System.out.println("b="+b);
		System.out.println("l="+l);
	}
}	
/*
F:\BHAVAJAVA\bhavawipro>javac TestTypeConversion.java

F:\BHAVAJAVA\bhavawipro>java TestTypeConversion
b=128
l=128
*/
