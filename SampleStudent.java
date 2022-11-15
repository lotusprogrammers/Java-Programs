class Student{
	String roll;//instance variable
	String name;
	String branch;
	int age;
	float cgpa;
	String book;
	public void setRoll(String roll){//roll is called as argument
		this.roll=roll;
	}
    public void setName(String name){
		this.name=name;
	}
    public void setBranch(String branch){
		this.branch=branch;
	}
    public void setAge(int age){
		this.age=age;
	}
    public void setCgpa(float cgpa){
		float per=cgpa*10;//per is called as local variable
		System.out.println("Percentage="+per);
		this.cgpa=cgpa;
	}
	public String getRoll(){
			return roll;
	}
    public String getName(){
			return name;
	}
    public String getBranch(){
			return branch;
	}
    public int getAge(){
			return age;
	}
    public float getCgpa(){
			return cgpa;
	}
}
class SampleStudent{
	public static void main(String[] args){
		//How to create object for the class
		//ClassName obj=new ClassName(arg_list);
		Student s1=new Student();
		s.setRoll("19701A0501");
		s.setName("Rajesh");
		s.setBranch("CSE");
		s.setAge(18);
		s.setCgpa(9.7F);
		System.out.println("...Student Details...");
		System.out.println("Roll Number="+s.getRoll());
		System.out.println("Name="+s.getName());
		System.out.println("Branch="+s.getBranch());
		System.out.println("Age="+s.getAge());
		System.out.println("Cgpa="+s.getCgpa());
		Student s2=new Student();
		s2.setRoll("19701A0501");
		s2.setName("Rajesh");
		s2.setBranch("CSE");
		s2.setAge(18);
		s2.setCgpa(9.7F);
		System.out.println("...Student Details...");
		System.out.println("Roll Number="+s2.getRoll());
		System.out.println("Name="+s2.getName());
		System.out.println("Branch="+s2.getBranch());
		System.out.println("Age="+s2.getAge());
		System.out.println("Cgpa="+s2.getCgpa());
		Student s3=new Student();
		s3.setRoll("19701A0501");
		s3.setName("Rajesh");
		s3.setBranch("CSE");
		s3.setAge(18);
		s3.setCgpa(9.7F);
		System.out.println("...Student Details...");
		System.out.println("Roll Number="+s3.getRoll());
		System.out.println("Name="+s3.getName());
		System.out.println("Branch="+s3.getBranch());
		System.out.println("Age="+s3.getAge());
		System.out.println("Cgpa="+s3.getCgpa());
	}
}	
	
/*

F:\BHAVAWIPRO23\BhavaWiproMettl>javac SampleStudent.java

F:\BHAVAWIPRO23\BhavaWiproMettl>java SampleStudent
...Student Details...
Roll Number=19701A0501
Name=Rajesh
Branch=CSE
Age=18
Cgpa=9.7
*/		
		
		
		
	
