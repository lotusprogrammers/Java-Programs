//Array Intitialization Demonstration
class ArrayInit{
	public static void main(String[] args){
		float a[]=new float[5];
		a[0]=5.7F;
		a[4]=9.7F;
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]="+a[i]);
		}	
	}
}
/*
F:\BHAVAJAVA\bhavawipro>javac ArrayInit.java

F:\BHAVAJAVA\bhavawipro>java ArrayInit
a[0]=5.7
a[1]=0.0
a[2]=0.0
a[3]=0.0
a[4]=9.7
*/	
