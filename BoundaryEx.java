interface Boundary{
	int UPPER_LIMIT=100;
	int LOWER_LIMIT=0;
}
class BoundaryEx{
	public static void main(String args[]){
		System.out.println("Upper Limit="+Boundary.UPPER_LIMIT);
		System.out.println("Lower Limit="+Boundary.LOWER_LIMIT);
	}
}

/*
F:\BHAVAJAVA\UNIT-II>javac BoundaryEx.java
F:\BHAVAJAVA\UNIT-II>java BoundaryEx
Upper Limit=100
Lower Limit=0	
*/	