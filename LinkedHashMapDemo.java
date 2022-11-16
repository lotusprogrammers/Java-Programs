import java.util.*;
class LinkedHashMapDemo {
public static void main(String args[]) {
	// Create a hash map.
	LinkedHashMap<String, Double> lhm = new LinkedHashMap<String, Double>();
	// Put elements to the map
	lhm.put("Rajesh", new Double(100.00));
	lhm.put("Eswar", new Double(99.99));
	lhm.put("Hari", new Double(97.27));
	lhm.put("Siva", new Double(75.22));
	lhm.put("Satya", new Double(100.100));
	// Get a set of the entries.
	Set<Map.Entry<String, Double>> set = lhm.entrySet();
	// Display the set.
	System.out.println("Display Elements from LinkedHashmap");
	for(Map.Entry<String, Double> me : set) {
		System.out.print(me.getKey() + ": ");
		System.out.println(me.getValue());
    }
	System.out.println();
 }
}
/*
Input and Output
****************
F:\BHAVAJAVA\Collections>javac LinkedHashMapDemo.java
F:\BHAVAJAVA\Collections>java LinkedHashMapDemo
Display Elements from LinkedHashmap
Rajesh: 100.0
Eswar: 99.99
Hari: 97.27
Siva: 75.22
Satya: 100.1
*/