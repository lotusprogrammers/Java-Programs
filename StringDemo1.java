//StringDemo1.java
//This program demonstrates some important methods of String class
class StringDemo1 {
	public static void main(String args[]) {
		String str1="Hello";
		String str2="Java";
		String str3="World";
		String str4=new String(str2);
		System.out.println("str1 length="+str1.length());
		System.out.println("Character at particular index position 3="+str1.charAt(3));
		System.out.println("Upper case for str2="+str2.toUpperCase());
		System.out.println("Lower case for str3="+str3.toLowerCase());
		String str5=str1+" "+str2+" "+str3+"!";
		System.out.println("str5="+str5);
		if(str2.equals(str4))
			System.out.println("str2===str4");
		else
			System.out.println("str2!=str4");
		if(str1.equals(str3))
			System.out.println("str1==str4");
		else
			System.out.println("str1!=str4");
		System.out.println("java==str2 ?"+"java".equals(str2));
		System.out.println("str1 concatentates with str2="+str1.concat(str2));
		System.out.println("str1 concatentates with str2 and result concatentates with str3="+
		                    (str1.concat(str2)).concat(str3));
    }
}	