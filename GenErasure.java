//GenErasure.java
class GenErasure<T extends Number>{
	T ob;
	GenErasure(T ob){
		this.ob=ob;
	}
    T getOb(){
		return ob;
	}
 }
/*
F:\BHAVAJAVA\GENERICS>javac GenErasure.java

F:\BHAVAJAVA\GENERICS>javap -s GenErasure.class
Compiled from "GenErasure.java"
class GenErasure<T> {
  T ob;
    descriptor: Ljava/lang/Object;
  GenErasure(T);
    descriptor: (Ljava/lang/Object;)V

  T getOb();
    descriptor: ()Ljava/lang/Object;
}
*/