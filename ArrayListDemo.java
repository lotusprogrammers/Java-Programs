//ArrayList Demonstration
import java.util.*;
class ArrayListDemo{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<String> as=new ArrayList<String>();
		as.add("Suresh");
		as.add("Sudheer");
		as.add("Siva");
		System.out.println("Iniatially al size="+al.size());
		//Add elements to ArrayList
		al.add("Rajesh");
		al.add("Ramya");
		al.add("Raju");
		al.add("Rajini");
		al.add("Kiran");
		System.out.println("After adding elements al size="+al.size());
		System.out.println("al="+al);
		al.addAll(3,as);
		System.out.println("After adding as collection to al="+al);
		//Remove elements from ArrayList
		al.remove("Raju");
		al.remove("Rajini");
		System.out.println("After removing elements al size="+al.size());
		System.out.println("al="+al);
	}
}	