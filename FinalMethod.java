class Parent{
	final void display(){
		System.out.println("This method not overriden");
	}
}
class Child extends Parent{
	void display(){
		System.out.println("From Child class");
	}
}
class FinalMethod {
	public static void main(String[] args){
		Parent p;
		p=new Parent();
		p.display();
		p=new Child();
		p.display();
	}
}	
		
	
	
