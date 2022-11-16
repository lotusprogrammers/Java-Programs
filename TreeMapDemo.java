import java.util.*;
class TreeMapDemo {
	public static void main(String args[]) {
		// Create a tree map.		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		// Put elements to the map.
		tm.put("Rajesh", new Double(100.00));
	    tm.put("Eswar", new Double(99.99));
	    tm.put("Hari", new Double(97.27));
	    tm.put("Siva", new Double(75.22));
	    tm.put("Satya", new Double(100.100));
	    // Get a set of the entries.
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        // Display the elements.
        for(Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
        }
     }
}
/*Input and Output
F:\BHAVAJAVA\Collections>javac TreeMapDemo.java
F:\BHAVAJAVA\Collections>java TreeMapDemo
Eswar: 99.99
Hari: 97.27
Rajesh: 100.0
Satya: 100.1
Siva: 75.22
*/