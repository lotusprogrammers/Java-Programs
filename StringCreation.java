//Demonstrates String creation with different constructors
class StringCreation{
	public static void main(String[] args){
		String s1="AITS is our College";
		System.out.println("s1="+s1);
		String s2=new String("AITS");
		System.out.println("s2="+s2);
		byte b[]={65,66,67,68,69,70,71};
		String s3=new String(b);
		System.out.println("s3="+s3);
		String s4=new String(b,2,3);
		System.out.println("s4="+s4);
		char ch[]={'A','I','T','S','C','O','L','L','E','G','E'};
		String s5=new String(ch);
		System.out.println("s5="+s5);
		String s6=new String(ch,4,7);
		System.out.println("s6="+s6);
		String s7=new String(s5);
		System.out.println("s7="+s7);
	}
}	

/*
F:\BHAVAJAVA\EEE>javac StringCreation.java

F:\BHAVAJAVA\EEE>java StringCreation
s1=AITS is our College
s2=AITS
s3=ABCDEFG
s4=CDE
s5=AITSCOLLEGE
s6=COLLEGE
s7=AITSCOLLEGE
*/
		