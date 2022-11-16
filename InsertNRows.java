//InsertNRows.java
import java.sql.*;
import java.util.*;
class InsertNRows{
	public static void main(String args[]) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		PreparedStatement pstmt=con.prepareStatement("insert into aitsgoogle values(?,?,?)");
		Scanner sin=new Scanner(System.in);
		int i=0;
		while(i<3){
			System.out.println("Enter Record:"+i);
			System.out.println("Enter Employee ID");
			String eid=sin.nextLine();
			System.out.println("Enter Employee Name");
			String ename=sin.nextLine();
			System.out.println("Enter Employee Designation");
			String edes=sin.nextLine();
			pstmt.setString(1,eid);
			pstmt.setString(2,ename);
			pstmt.setString(3,edes);
			pstmt.executeUpdate();
			i++;
		}
	}
}
/*
F:\BHAVAJAVA\jdbc>javac InsertNRows.java

F:\BHAVAJAVA\jdbc>java InsertNRows
Enter Record:0
Enter Employee ID
Google789
Enter Employee Name
Ravi Kiran
Enter Employee Designation
Programmer
Enter Record:1
Enter Employee ID
Google345
Enter Employee Name
Venkatesh
Enter Employee Designation
DevOps Engineer
Enter Record:2
Enter Employee ID
Google999
Enter Employee Name
Vara Kumar
Enter Employee Designation
Senior Architect
*/	
			