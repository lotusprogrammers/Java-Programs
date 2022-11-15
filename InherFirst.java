class Eswara{
	public void displaySuper(){
		System.out.println("Eswara");
	}
}
class Parameswara extends Eswara{
	public void displaySub(){
		System.out.println("Parameswara");
	}
}
class InherFirst{
	public static void main(String args[]){
		Parameswara p=new Parameswara();
		p.displaySuper();
		p.displaySub();
	}
}	
	
	
	