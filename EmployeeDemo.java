//Employee Class
class Employee{
	int id;
	String name;
	String designation;
	public void setId(int id){//accessspecifier return_type method_name(arg_list){//body}
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
    public void setDesignation(String designation){
		this.designation=designation;
	}
    public int getId(){
		return id;
	}
    public String getName(){
		return name;
	}
	public String getDesignation(){
		return designation;
	}
}
class EmployeeDemo{
	public static void main(String[] args){
		Employee emp;//Declaration of reference for Employee;
		emp=new Employee();
		emp.setId(399);
		emp.setName("Rajesh");
		emp.setDesignation("Power Programmer");
		int id=emp.getId();
		System.out.println("Employee ID="+id);
		System.out.println("Employee Name="+emp.getName());
		System.out.println("Employee Designation="+emp.getDesignation());
		if(emp.getDesignation()=="Power Programmer"){
			System.out.println("You got good designation,With your practice you got this");
		}
    }
}

//Class Definition properties and method definitions
//How "this" object referred
//how to take practice for specifying the method names for setting properties of a method and getting properties
//How to declare reference and how to create objects
//How to call the methods to set properties through objects
//How to call methods differently to get properties	
		
/*
F:\BHAVAJAVA\bhavawipro>javac EmployeeDemo.java

F:\BHAVAJAVA\bhavawipro>java EmployeeDemo
Employee ID=399
Employee Name=Rajesh
Employee Designation=Power Programmer
You got good designation,With your practice you got this
*/	
	
		
		
		
	