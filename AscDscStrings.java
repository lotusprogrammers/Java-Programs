//Ascending and Descending Order of Strings
//AscDesStrings.java
import java.util.*;
class AscDscStrings{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sin.nextInt();
		//Creation of String array
		String[] str=new String[n];
		System.out.println("Enter Strings...");
		for(int i=0;i<n;i++)
			str[i]=sin.next();//next() method Scanner class is used to read Strings
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(str[i].compareTo(str[j])>0){
					String temp;
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
        }
        System.out.println("Ascending Order of Strings...");
		for(int i=0;i<n;i++)
			System.out.println(str[i]);
		System.out.println("Descending Order of Strings...");
		for(int i=n-1;i>=0;i--)
			System.out.println(str[i]);
	}
}	

/*
F:\BHAVAJAVA\EEE>javac AscDscStrings.java

F:\BHAVAJAVA\EEE>java AscDscStrings
Enter n:
5
Enter Strings...
Sachin
Dhoni
Kohli
Panth
Sreyas
Ascending Order of Strings...
Dhoni
Kohli
Panth
Sachin
Sreyas
Descending Order of Strings...
Sreyas
Sachin
Panth
Kohli
Dhoni
*/			
			