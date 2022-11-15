class Sample {
	Sample(){
		System.out.println("From Anonynomous Sample class");
	}
}
class AnonymousOb {
	public static void main(String args[]) {
		new Sample();
	}
}	