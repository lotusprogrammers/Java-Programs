//Strings Creation
class StringEx {
	public static void main(String args[]){
		String s1="Java Programming";
		String s2=new String("James Gosling Sir");
		char ch[]={'J','a','v','a',' ','P','r','o','g','r','a','m','m','e','r'};
		String s3=new String(ch);
		String s7=new String(ch,5,10);
		byte b[]={78,79,80,81};
		String s4=new String(b);
		StringBuffer sb=new StringBuffer("Java String Buffer");
		String s5=new String(sb);
		char ch1[]={'v','i','n','o','d','k','h','o','s','l','a','s','i','r'};
		String s6=new String(ch1,0,5);
		System.out.println("s1="+s1);//Java Programming
		System.out.println("s2="+s2);//James Gosling Sir
		System.out.println("s3="+s3);//Java Programmer
		System.out.println("s7="+s7);//Programmer
		System.out.println("s4="+s4);//NOPQ
		System.out.println("s5="+s5);//Java String Buffer
		System.out.println("s6="+s6);//vinod
	}
}	
/*
F:\BHAVAJAVA\BN>javac StringEx.java
F:\BHAVAJAVA\BN>java StringEx
s1=Java Programming
s2=James Gosling
s3=Java
s4=NOPQ
s5=Java String Buffer
s6=vinod
*/		
