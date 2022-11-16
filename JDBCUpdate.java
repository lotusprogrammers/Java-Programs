//JDBCUpdate.java
import java.sql.*;
class JDBCUpdate{
	public static void main(String[] args){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
			Statement stmt=con.createStatement();
			String uQuery="update aitsgoogle set empdes='Associate Engineer' where empid='Google551' ";
			int i=stmt.executeUpdate(uQuery);
			if(i>0){
				System.out.println(i+" record updated");
			}
			else{
                 System.out.println("No Record Updated,Update Operation Unsuccessful");
		    }
		}
        catch(ClassNotFoundException e){
			e.printStackTrace();
		}
        catch(SQLException e){
            e.printStackTrace();
		}
	}
}
/*			
F:\BHAVAJAVA\jdbc>javac JDBCUpdate.java

F:\BHAVAJAVA\jdbc>java JDBCUpdate
1 record updated			
*/			