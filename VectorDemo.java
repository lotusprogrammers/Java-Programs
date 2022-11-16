// Demonstrate various Vector operations.
import java.util.*;
class VectorDemo {
	public static void main(String args[]) {
		// initial size is 3, increment is 2
        Vector<String> v = new Vector<String>(3,2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " +v.capacity());
        v.addElement("Sachin");
        v.addElement("Dhoni");
		v.addElement("Kohli");
		v.addElement("Kartheek");
		System.out.println("Capacity after four additions:" +v.capacity());
		v.addElement("Saurabh");
		System.out.println("Current capacity:"+v.capacity());
		v.addElement("Lakshman");
		v.addElement("Dravid");
		System.out.println("Current capacity: " +v.capacity());
		v.addElement("Mithali Raj");
		v.addElement("Julan Goswami");
		System.out.println("Current capacity:"+v.capacity());
		v.addElement("Poonam");
		v.addElement("Kapil Dev");
		System.out.println("Current capacity:"+v.capacity());
		System.out.println("First Player in the Team: " + v.firstElement());
		System.out.println("Last Player in the Team: " + v.lastElement());
		// Enumerate the elements in the vector.
		Enumeration<String> vEnum = v.elements();
		System.out.println("\nIndian Favorite Cricket Players:");
		while(vEnum.hasMoreElements())
			System.out.println(vEnum.nextElement() + " ");
		System.out.println();
        if(v.contains("Afridi"))
			System.out.println("Yes,Available");
		else
			System.out.println("Yes,Not Avialable");
	} 		 
}

/*Input and OutputDeviceAssignedF:\BHAVAJAVA\Collections>javac VectorDemo.java

F:\BHAVAJAVA\Collections>java VectorDemo
Initial size: 0
Initial capacity: 3
Capacity after four additions:5
Current capacity:5
Current capacity: 7
Current capacity:9
First Player in the Team: Sachin
Last Player in the Team: Kapil Dev

Indian Favorite Cricket Players:
Sachin
Dhoni
Kohli
Kartheek
Saurabh
Lakshman
Dravid
Mithali Raj
Julan Goswami
Poonam
Kapil Dev

Yes,Indian Team has sachin
*/
