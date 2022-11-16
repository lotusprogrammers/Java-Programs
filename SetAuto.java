//Step 1:importing java.sql package
import java.sql.*;
public class SetAuto{
	public static void main(String args[]) throws Exception{
		//Step 2:Registering with JDBC driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Step 3:Getting Connection object
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		con.setAutoCommit(false);
		//Step 4:Create Statement object
		Statement stmt=con.createStatement();
		String uQuery="update aitsgoogle set empdes='R and D Engineer' where empid='Google945'";
		//Step 5:SQL Query Execution
		int i=stmt.executeUpdate(uQuery);
		con.commit();
		if(i>0)
			System.out.println(i+"Rows updated");
	}
}	
	
