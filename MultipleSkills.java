interface Programmer{
	void displayP();
}
interface Engineer{
	void displayE();
}
interface Innovator{
	void displayI();
}
class Student implements Programmer,Engineer,Innovator{
	public void displayP(){
		System.out.println("I am Good Computer Programmer");
	}
	public void displayE(){
		System.out.println("I can built Software Product");
	}
	public void displayI(){
		System.out.println("I have  Innovative Skills");
	}
	public void displayCEO(){
		System.out.println("I can start My own Startup");
	}	
}
class MultipleSkills{
	public static void main(String args[]){
		Student s=new Student();
		s.displayP();
		s.displayE();
		s.displayI();
		s.displayCEO();
	}
}	
	
	