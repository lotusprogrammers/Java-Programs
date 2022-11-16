import java.util.*;
public class IdentityHashMapDemo {
    public static void main(String[] args) {        
        // Created HashMap and IdentityHashMap objects
        Map hmo = new HashMap();
        Map io = new IdentityHashMap();
        // Putting  keys and values in HashMap and IdentityHashMap Object
        hmo.put(new String("Placement") ,"Google"); 
        hmo.put(new String("Placement") ,"Microsoft"); 
		hmo.put(new String("Placement"),"AITS");
        io.put(new String("Placement") ,"Google"); 
        io.put(new String("Placement") ,"Microsoft");
        io.put(new String("Placement"),"Amazon");	
        io.put(new String("Placement"),"AITS");		
        // Print HashMap and IdentityHashMap Size : After adding  keys       
        System.out.println("HashMap after adding key :"+ hmo);
        System.out.println("IdentityHashMap after adding key :"+ io); 
                            
 }
}

/*Output
F:\BHAVAJAVA\Collections>javac IdentityHashMapDemo.java
Note: IdentityHashMapDemo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
F:\BHAVAJAVA\Collections>java IdentityHashMapDemo
HashMap after adding key :{Placement=Microsoft}
IdentityHashMap after adding key :{Placement=Google, Placement=Microsoft}
*/