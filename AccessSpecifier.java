//Access Specifiers
class Super{
	private int a=2;//private member 
	int b=3;//no modifier member
	protected int c=4;//protected member
	public int d=5;//public member
    void displayPrivate(){//No Modifier Method
		System.out.println("Private Member accessed through nomodifier method="+a);
	}
}
class Sub extends Super{
	public void displayFromSuper(){//public method
		System.out.println("Access From Super class...............");
		System.out.println("Private from Super not accessed");
		displayPrivate();
		System.out.println("no modifer b="+b);
		System.out.println("protecetd  c="+c);
		System.out.println("public d="+d);
	}
}
class NonSub{
	public void displayFromSuper(){//public method
		Super s=new Super();
		System.out.println("Accessed from Super class in NonSub class through object 's'");
		System.out.println("Private from Super not accessed");
		s.displayPrivate();
		System.out.println("Super members accessed through object");
		System.out.println("no modifer b="+s.b);
		System.out.println("protecetd  c="+s.c);
		System.out.println("public d="+s.d);
	}
}
class AccessSpecifier {
	public static void main(String args[]){
		Sub s=new Sub();
		s.displayFromSuper();
	    NonSub ns=new NonSub();
		ns.displayFromSuper();
	}
}	
	    
/*
F:\BHAVAJAVA\UNIT-II>javac AccessSpecifier.java

F:\BHAVAJAVA\UNIT-II>java AccessSpecifier
F:\BHAVAJAVA\UNIT-II>javac AccessSpecifier.java

F:\BHAVAJAVA\UNIT-II>java AccessSpecifier
Access From Super class...............
Private from Super not accessed
Private Member accessed through nomodifier method=2
no modifer b=3
protecetd  c=4
public d=5
Accessed from Super class in NonSub class through object 's'
Private from Super not accessed
Private Member accessed through nomodifier method=2
Super members accessed through object
no modifer b=3
protecetd  c=4
public d=5
*/	
	
	