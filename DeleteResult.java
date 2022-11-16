import java.sql.*;
public class DeleteResult{
	public static void main(String args[]) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		//con.setAutoCommit(false);
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String sQuery="select empid,empname,empdes from aitsgoogle";
		ResultSet rs=stmt.executeQuery(sQuery);
		int i=1; 
		rs.first();
		//rs.absolute(5);
		rs.deleteRow();
		rs.close();
		//con.commit();
 	}	
}	
	
