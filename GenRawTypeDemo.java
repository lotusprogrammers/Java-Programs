//GenDemo.java
class Gen<T>{
	T ob;
	Gen(T ob){
		this.ob=ob;
	}
    T getOb(){
		return ob;
	}
 }
class GenRawTypeDemo{
	public static void main(String[] args){
		Gen<Integer> iob=new Gen<Integer>(70);
		System.out.println("Calling Generic Type...");
		System.out.println("Generic is Integer Type...");
		System.out.println("iob value="+iob.getOb());
		System.out.println("Generic is String Type...");
		Gen<String> sob=new Gen<String>("AITS is Great College");
		System.out.println("sob value="+sob.getOb());
		System.out.println("Calling RawType...");
		Gen gi=new Gen(new Integer(70));
		int i=(Integer)gi.getOb();
		System.out.println("Calling gi in Non generic way i="+i);
		Gen gs=new Gen(new String("AITS is Great College"));
		String s=(String)gs.getOb();
		System.out.println("Calling gs in Non generic way s="+s);
	}
}
/*
F:\BHAVAJAVA\GENERICS>javac GenRawTypeDemo.java
Note: GenRawTypeDemo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\BHAVAJAVA\GENERICS>java GenRawTypeDemo
Calling Generic Type...
Generic is Integer Type...
iob value=70
Generic is String Type...
sob value=AITS is Great College
Calling RawType...
Calling gi in Non generic way i=70
Calling gs in Non generic way s=AITS is Great College
*/	
		
	
		
		