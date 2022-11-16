import java.util.*; 
enum Rainbow{
    RED,ORANGE,YELLOW,GREEN,BLUE,INDINGO,VIOLET
}; 
public class EnumSetDemo{ 
    public static void main(String[] args){  
        // Creating a set 
        EnumSet<Rainbow> set1, set2, set3, set4,set5; 
		EnumSet<Hero> set6;
        // Adding elements 
        set1 = EnumSet.of(Rainbow.RED, Rainbow.GREEN,  
                          Rainbow.BLUE); 
        set2 = EnumSet.complementOf(set1); 
		set3 = EnumSet.allOf(Rainbow.class); 
        set4 = EnumSet.range(Rainbow.YELLOW, Rainbow.INDINGO); 
        System.out.println("Set 1: " + set1); 
        System.out.println("Set 2: " + set2); 
        System.out.println("Set 3: " + set3); 
        System.out.println("Set 4: " + set4); 
	}	
} 

/*
Output
********
F:\Collections>javac EnumSetDemo.java
F:\Collections>java EnumSetDemo
Set 1: [RED, GREEN, BLUE]
Set 2: [ORANGE, YELLOW, INDIGO, VIOLET]
Set 3: [RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET]
Set 4: [RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO]
*/
