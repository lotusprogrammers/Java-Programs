//Demonstration of selected String methods.
//StringDemo.java
class StringDemo {
	public static void main(String[] args) {
		String str1="Hello";
		String str2="Java";
		String str3="World";
		String str4=new String(str2);
		System.out.println("str1 length="+str1.length());
		System.out.println("Character at index 3 in str1="+str1.charAt(1));
		System.out.println("Upper case str2="+str2.toUpperCase());
		System.out.println("Lower case str2="+str2.toLowerCase());
		System.out.println("str1 concatenates str2="+str1.concat(str2));
		if(str1.equals(str2))
			System.out.println("str1==str2");
		else
			System.out.println("str1!=str2");
		if(str2.equals(str4))
			System.out.println("str2==str4");
		else
			System.out.println("str2!=str4");
	}
}

/*
F:\BHAVAJAVA\EEE>javac StringDemo.java
F:\BHAVAJAVA\EEE>java StringDemo
str1 length=5
Character at index 3 in str1=e
Upper case str2=JAVA
Lower case str2=java
str1 concatenates str2=HelloJava
str1!=str2
str2==str4
*/

			
