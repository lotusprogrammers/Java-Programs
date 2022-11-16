//Inserting new Record through ResultSet object
import java.sql.*;
class InsertResultRecord{
	public static void main(String args[])throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String q="select roll,name,branch,gender,address from studentaits";
		ResultSet rs=stmt.executeQuery(q);
		rs.beforeFirst();
		rs.moveToInsertRow();
		rs.updateString("roll","579");
		rs.updateString("name","Rahim");
		rs.updateString("branch","ece");
		rs.updateString("gender","male");
		rs.updateString("address","Chennai");
		rs.insertRow();
    }
}	