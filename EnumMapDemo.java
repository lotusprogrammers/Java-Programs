import java.util.*; 
enum Rainbow{
    RED,ORANGE,YELLOW,GREEN,BLUE,INDINGO,VIOLET
}; 
public class EnumMapDemo{ 
    public static void main(String[] args){  
        // Creating a set 
        EnumMap<Rainbow, String> rmap = new 
                     EnumMap<Rainbow, String>(Rainbow.class); 
  
        rmap.put(Rainbow.RED,"VIBRANCY"); 
        rmap.put(Rainbow.ORANGE,"CREATIVITY"); 
        rmap.put(Rainbow.YELLOW,"WISDOM"); 
        rmap.put(Rainbow.GREEN,"NATURE"); 
        rmap.put(Rainbow.BLUE,"DIVINITY"); 
        rmap.put(Rainbow.INDINGO,"INFINITY"); 
        rmap.put(Rainbow.VIOLET,"SPIRTUALITY");          
        // Printing size of EnumMap in java 
        System.out.println("Size of EnumMap in java: " +  
                                       rmap.size()); 
        System.out.println("EnumMap: " + rmap); 
	}
} 

/*Output
F:\BHAVAJAVA\Collections>javac EnumMapDemo.java
F:\BHAVAJAVA\Collections>java EnumMapDemo
Size of EnumMap in java: 7
EnumMap: {RED=VIBRANCY, ORANGE=CREATIVITY, YELLOW=WISDOM, GREEN=NATURE, BLUE=DIVINITY, INDINGO=INFINITY, VIOLET=SPIRTUALITY}
*/