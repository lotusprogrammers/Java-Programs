interface Nature{
   static String generateAir(){
	   return "air";
   }
   static String generateWater(){
       return "Water";	   
}
class HumanDemo{
	public static void main(String[] args){
		System.out.println("Access Resource 1="+Nature.generateAir();
	    System.out.println("ACcess Resource 2="+Nature.genearateWater();
	}
}
	
	
	
