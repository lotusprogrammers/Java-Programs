//AscDesStr.java
import java.util.*;
class AscDscStr {
	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter no of strings to sort=");
		int n=sin.nextInt();
		String str[]=new String[n];
		System.out.println("Enter array of Strings=");
		for(int i=0;i<n;i++)
			str[i]=sin.next();
		//sort the strings in Ascending Order
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if((str[i].compareTo(str[j]))>0){
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
			    }
            }
        }
		System.out.println("Ascending Order:");
		for(int i=0;i<n;i++)
			System.out.println(str[i]);
		System.out.println("Descending Order:");
		for(int i=n-1;i>=0;i--)
			System.out.println(str[i]);
	}
}	

/*
F:\BHAVAJAVA\BN>javac AscDscStr.java

F:\BHAVAJAVA\BN>java AscDscStr
Enter no of strings to sort=
5
Enter array of Strings=
Ganga
Krishna
Godhavari
Narmada
Saraswathi
Ascending Order:
Ganga
Godhavari
Krishna
Narmada
Saraswathi
Descending Order:
Saraswathi
Narmada
Krishna
Godhavari
Ganga
*/	   