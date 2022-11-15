//Interface extending another Interface
interface GrandFather{
	void grandFatherResponsibility();
}
interface Father extends GrandFather{
	void fatherResponsibility();
}
interface Teacher{
	void teacherResponsibility();
}	
	
class Child implements Father,Teacher{
	public void grandFatherResponsibility(){
		System.out.println("I am also responsible for GrandFather responsibility");
	}
	public void fatherResponsibility(){
		System.out.println("I implemented Father's Responsibility");
	}
	public void teacherResponsibility(){
		System.out.println("I Implemented Teacher's Responsibility");
	}	
}

class InterInter{
	public static void main(String[] args){
		Child c=new Child();
		c.fatherResponsibility();
		c.grandFatherResponsibility();
		c.teacherResponsibility();
	}
}	
		
	
	
	
	