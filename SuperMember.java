//Demonstration of super keyword to access super class members in sub class
//Demonstration for invoking super class constructor
//SuperMember.java
class Father {
	String hname;
	Father(String hname){
		this.hname=hname;
	}
}
class Son extends Father{
	String hname;
	Son(String fhname,String shname){
		super(fhname);
		this.hname=shname;
	}
	public void displayHouseName(){
		System.out.println("Father House Name="+super.hname); 
		System.out.println("Son House Name="+hname); 
    }
}	
class SuperMember {
	public static void main(String args[]){
		Son s=new Son("Brindavanam","Nandanavanam");
		s.displayHouseName();
	}
}	

/*
F:\BHAVAJAVA\UNIT-II>javac SuperMember.java

F:\BHAVAJAVA\UNIT-II>java SuperMember
Father House Name=Brindavanam
Son House Name=Nandanavanam	
*/
	