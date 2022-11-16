import java.util.*;
class HashMapDemo {
public static void main(String args[]) {
	// Create a hash map.
	HashMap<String, Double> hm = new HashMap<String, Double>();
	// Put elements to the map
	hm.put("Rajesh", new Double(100.00));
	hm.put("Eswar", new Double(99.99));
	hm.put("Hari", new Double(97.27));
	hm.put("Siva", new Double(75.22));
	hm.put("Satya", new Double(100.100));
	// Get a set of the entries.
	Set<Map.Entry<String, Double>> s = hm.entrySet();
	// Display the set.
	System.out.println("Display Elements from HashMap");
	for(Map.Entry<String, Double> me : s) {//for(type obj:collection){ }
		System.out.print(me.getKey() + ": ");
		System.out.println(me.getValue());
    }
	System.out.println();
	
	/*System.out.println("Rajesh is Alive:"+hm.containsKey("Rajesh"));
    System.out.println("100.100 is Alive:"+hm.containsValue(100.100));
    hm.remove("Eswar");
    for(Map.Entry<String, Double> me : s) {
		System.out.print(me.getKey() + ": ");
		System.out.println(me.getValue());
    } */
	
 }
}
/*
Input and Output
****************
F:\BHAVAJAVA\Collections>javac HashMapDemo.java
F:\BHAVAJAVA\Collections>java HashMapDemo
Display Elements from HashMap
Satya: 100.1
Hari: 97.27
Siva: 75.22
Eswar: 99.99
Rajesh: 100.0
*/