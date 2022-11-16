//Step 1:importing java.sql package
import java.sql.*;
public class SelectQuery{
	public static void main(String args[]) throws Exception{
		//Step 2:Registering with JDBC driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Step 3:Getting Connection object
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		//Step 4:Create Statement object
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		String sQuery="select *from aitsgoogle";
		//Step 5:SQL Query Execution
		ResultSet rs=stmt.executeQuery(sQuery);
		int i=1; 
        rs.afterLast(); 		
	    while(rs.previous()){
           System.out.println("--------------------------------");
		   System.out.println("AITS Alumuni Record:"+i);
		   System.out.println("Roll Number:"+rs.getString(1));
           System.out.println("Name:"+rs.getString(2));
           System.out.println("Branch:"+rs.getString(3));
           i++; 
		}
	}	
}	
	
