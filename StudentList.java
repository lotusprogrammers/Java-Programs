import java.util.*;
class Student{
	String roll;
	String name;
	int age;
	String gender;
	String address;
	Student(String roll,String name,int age,String gender,String address){
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.address=address;
   }
   public String toString(){
		return "Roll Number:"+roll+"\n"+"Name:"+name+"\n"+"Age:"+age+"\n"+"Gender:"+gender+"\n"+"Address:"+address;
   }
}
class StudentList{
	public static void main(String args[]){
		Student s1,s2,s3,s4,s5;
		s1=new Student("501","RAJESH",20,"MALE","RAJAMPET");
		s2=new Student("502","RAJESWARI",18,"FEMALE","RAJAMPET");
		s3=new Student("503","ESWAR",18,"MALE","VARANASI");
		s4=new Student("504","ESWARI",18,"FEMALE","VARRANASI");
		s5=new Student("505","COMPUTER",18,"MALE","EVERY WHERE");
		//ArrayList<Student> as=new ArrayList<Student>();
		//LinkedList<Student> as=new LinkedList<Student>();
		//HashSet<Student> as=new HashSet<Student>();
		as.add(s5);
		as.add(s4);
		as.add(s2);
		as.add(s1);
		as.add(s3);
		for(Student s:as){  
			System.out.println("-------------------------------");
            System.out.println(s);
	    }
	}
}

/*Output
F:\BHAVAJAVA\Collections>javac StudentList.java

F:\BHAVAJAVA\Collections>java StudentList
-------------------------------
Roll Number:501
Name:RAJESH
Age:20
Gender:MALE
Address:RAJAMPET
-------------------------------
Roll Number:502
Name:RAJESWARI
Age:18
Gender:FEMALE
Address:RAJAMPET
-------------------------------
Roll Number:503
Name:ESWAR
Age:18
Gender:MALE
Address:VARANASI
-------------------------------
Roll Number:504
Name:ESWARI
Age:18
Gender:FEMALE
Address:VARRANASI
-------------------------------
Roll Number:505
Name:COMPUTER
Age:18
Gender:MALE
Address:EVERY WHERE
*/	