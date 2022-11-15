//Demonstration of Object class
class Student{
	String name,skill1,skill2;
	Student(String name,String skill1,String skill2){
		this.name=name;
		this.skill1=skill1;
		this.skill2=skill2;
	}
    public String toString(){
		String res="";
		if(skill1.equals("Learning Programming")&&skill2.equals("Practice Programming")){
			res="Good Student,becomes Good Software Professional";
    	}
		else if(skill1.equals("Roaming")&&skill2.equals("Over Thinking")){
			res="Not a Good Student,It is late to become Software Professional";
		}
		return res;
	}
}
class AITSStudent{
	public static void main(String[] args){
		Student s1=new Student("Abhi","Learning Programming","Practice Programming");
		System.out.println(s1.name+" is "+s1);
		Student s2=new Student("Dubhi","Roaming","Over Thinking");
		System.out.println(s2.name+" is "+s2);
		System.out.println(s1);
	}
}	
/*
F:\BHAVAWIPRO23>java AITSStudent
Abhi is Good Student,becomes Good Software Professional
Dubhi is Not a Good Student,It is late to become Software Professional
*/	
		