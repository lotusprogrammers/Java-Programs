//Step 1:importing java.sql package
import java.sql.*;
public class InsertQuery{
	public static void main(String args[]) throws Exception{
		//Step 2:Registering with JDBC driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Step 3:Getting Connection object
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		//Step 4:Create Statement object
		Statement stmt=con.createStatement();
		String num="19701A0501";
		String name="Raju";
		String branch="CSE";
		String iQuery="insert into annamacharya9(rnum,name,branch)values('19701A0501','Raju','CSE')";
		//Step 5:SQL Query Execution
		int i=stmt.executeUpdate(iQuery);
		if(i>0)
			System.out.println(i+"Rows inserted");
	}
}	
	
