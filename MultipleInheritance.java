interface Programmer{
	void displayP();
}
interface Engineer{
	void displayE();
}
interface Innovator{
	void displayI();
}
class AITSStudent implements Programmer,Engineer,Innovator{
	public void displayP(){
		System.out.println("I am good Programmer");
	}	
	public void displayE(){
		System.out.println("I can built a soft product valuable for Country");
	}
	public void displayI(){
		System.out.println("My self architect innovative things");
	}
	public void displayCEO(){
		System.out.println("I can start my own Start Up Company");
	}	
}
class MultipleInheritance{
	public static void main(String[] args){
		AITSStudent s=new AITSStudent();
		s.displayP();
		s.displayE();
		s.displayI();
		s.displayCEO();
	}
}	
	
	
	