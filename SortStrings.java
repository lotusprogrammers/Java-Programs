//Sort Sentence Strings
//SortStrings.java
import java.util.*;
class SortStrings{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter line of Text");
		String line=sin.nextLine();
		StringTokenizer st=new StringTokenizer(line," ");
		ArrayList<String> al=new ArrayList<String>();
		int i=0;	   
	    while(st.hasMoreTokens()){
			String token=st.nextToken();
			al.add(token);
		}
        Collections.sort(al);
		String ascString="";
		for(String str:al){
			ascString=ascString+" "+str;
		}
		System.out.println(ascString);
        		
	}
}	