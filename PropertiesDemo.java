import java.util.*;
public class PropertiesDemo {
   public static void main(String args[]) {
      Properties capitals = new Properties();
      //Set states;
      String str;
      capitals.put("Andhra Pradesh", "Amaravathi");
      capitals.put("Telangana", "Hyderabad");
      capitals.put("Tamil Nadu", "Chennai");
      capitals.put("Karnataka", "Bengaluru");
      capitals.put("Kerala", "Tiruvanantapuramu");
      // Show all states and capitals in hashtable.
      Enumeration states=capitals.propertyNames(); 
      while(states.hasMoreElements()){
          String ele=(String)states.nextElement();
		  System.out.println(ele+" :"+capitals.getProperty(ele));
	  }	  
	System.out.println();
  }
}
/*Input and Output
F:\BHAVAJAVA\Collections>javac PropertiesDemo.java
F:\BHAVAJAVA\Collections>java PropertiesDemo
The capital of Karnataka is Bengaluru.
The capital of Tamil Nadu is Chennai.
The capital of Telangana is Hyderabad.
The capital of Andhra Pradesh is Amaravathi.
The capital of Kerala is Tiruvanantapuramu.
*/