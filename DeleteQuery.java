//Step 1:importing java.sql package
import java.sql.*;
public class DeleteQuery{
	public static void main(String args[]) throws Exception{
		//Step 2:Registering with JDBC driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Step 3:Getting Connection object
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		//Step 4:Create Statement object
		Statement stmt=con.createStatement();
		String dQuery="delete from studentaits where roll='507'";
		//Step 5:SQL Query Execution
		int i=stmt.executeUpdate(dQuery);
		if(i>0)
			System.out.println(i+"Rows deleted");
		else
			System.out.println("No Rows deleted");
	}
}	
	
