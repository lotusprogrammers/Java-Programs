interface Nature{
   static String generateAir(){
	   return "air";
   }
   static String generateWater(){
       return "Water";	   
}
class Human implements Nature{
	public void useIt(){
		System.out.println("I am Using nature air in right way");
		System.out.println("Nature Resource="+resource);
	}
}
class InterfaceDemo{
	public static void main(String[] args){
		Nature n=new Human();
		n.useIt();
	}
}
	
	
	
