// Demonstrate Hashset.
import java.util.*;
class LinkedHashSetDemo {
	public static void main(String args[]) {
		// Create a Linked hash set.
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		// Add elements to the Linked hash set.
		lhs.add("Beta");
		lhs.add("Alpha");
		lhs.add("Alpha");
		lhs.add("Eta");
		lhs.add("Gamma");
		lhs.add("Epsilon");
		lhs.add("Omega");
		System.out.println(lhs);
	}
}
/*
F:\BHAVAJAVA\Collections>javac LinkedHashSetDemo.java

F:\BHAVAJAVA\Collections>java LinkedHashSetDemo
[Beta, Alpha, Eta, Gamma, Epsilon, Omega]

*/