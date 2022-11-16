// Demonstrate HashSet.
import java.util.*;
class HashSetDemo {
	public static void main(String args[]) {
		// Create a hash set.
		HashSet<String> hs = new HashSet<String>();
		// Add elements to the hash set.
		hs.add("Beta");
		hs.add("Alpha");
		hs.add("Eta");
		hs.add("Gamma");
		hs.add("Gamma");
		hs.add("Epsilon");
		hs.add("Omega");
		System.out.println(hs);
	}
}

/*

F:\BHAVAJAVA\Collections>javac HashSetDemo.java

F:\BHAVAJAVA\Collections>java HashSetDemo
[Gamma, Eta, Alpha, Epsilon, Omega, Beta]

*/