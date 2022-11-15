//ObjectEx.java
class Sample {
	void display() {
		System.out.println("From Sample class");
	}
    public String toString() {
		return "AITS is a Great College";
	}
}
class ObjectEx{
	public static void main(String[] args){
		Sample s=new Sample();
		System.out.println("Sample Object 's' hashcode="+s.hashCode());
		System.out.println("S object described="+s);
	}
}	
/*
F:\BHAVAJAVA\UNIT-II>javac ObjectEx.java
F:\BHAVAJAVA\UNIT-II>java ObjectEx
Sample Object 's' hashcode=2018699554
S object described=AITS is a Great College
*/	
	
		
	