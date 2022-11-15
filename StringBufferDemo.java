//StringBufferDemo.java
class StringBufferDemo{
	public static void main(String[] args){
		String str="India is our country.";
		StringBuffer sb=new StringBuffer(str);
		System.out.println("sb="+sb);
		System.out.println("sb capacity="+sb.capacity());
		System.out.println("sb length="+sb.length());
		System.out.println("Append new String to sb...");
		sb.append("All Indians are my brothers and sisters");
		System.out.println("Append Result="+sb);
		System.out.println("Insert new string at 13th character of sb...");
		sb.insert(13,"greatest ");
		System.out.println(sb);
		System.out.println("inserting a 't' charcter at particular position...");
		sb.setCharAt(8,'t');
        System.out.println(sb); 
	}
}	

/*
F:\BHAVAJAVA\EEE>javac StringBufferDemo.java
F:\BHAVAJAVA\EEE>java StringBufferDemo
sb=India is our country.
sb capacity=37
sb length=21
Append new String to sb...
Append Result=India is our country.All Indians are my brothers and sisters
Insert new string at 13th character of sb...
India is our greatest country.All Indians are my brothers and sisters
inserting a 't' charcter at particular position...
India istour greatest country.All Indians are my brothers and sisters
*/
		