import java.util.*;
class StringTokenizerDemo{
	public static void main(String args[]){
	  Scanner sin=new Scanner(System.in);
	  System.out.println("Read line of integers separated by , symbol");
	  String line=sin.next();
	  int sum=0;
	  StringTokenizer st=new StringTokenizer(line,"and");
	  while(st.hasMoreTokens()){
		String str=st.nextToken();
		int ele=Integer.parseInt(str);
		sum=sum+ele;
	  }
      System.out.println("Sum of integers="+sum);
     }
}
/*Input and Output
F:\BHAVAJAVA\Collections>javac StringTokenizerDemo.java
F:\BHAVAJAVA\Collections>java StringTokenizerDemo
Read line of integers separated by , symbol
1,2,3,4,5,6,7,8,9
Sum of integers=45
*/
	