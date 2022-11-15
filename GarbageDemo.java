//Grabage Collection
//Syntax:
//class sub_class extends super_class
class Sample{
	int a[]=new int[20];
	void display() {
		a[0]=2;
		a[1]=3;
		System.out.println("a[0]="+a[0]);
		System.out.println("a[1]="+a[1]);
	}
    //Override finalize method from Object class	
    protected void finalize() {
		a=null;
		System.out.println("Calling finalize method");
    }
}
class GarbageDemo {
	public static void main(String[] args) {
		Sample s=new Sample();
		s.display();
		s=null;
		System.gc();
	}
}	
	