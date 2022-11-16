import java.sql.*;
import java.util.*;
class SelectRow{
	public static void main(String args[]) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		PreparedStatement pstmt=con.prepareStatement("select *from studentaits where roll=?");
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter roll to search");
		String sroll=sin.next();
		pstmt.setString(1,sroll);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()){
	      System.out.println("Roll Number:"+rs.getString("roll"));
		  System.out.println("Name:"+rs.getString("name"));
          System.out.println("Branch:"+rs.getString("branch"));
          System.out.println("Gender:"+rs.getString("gender"));
          System.out.println("Address:"+rs.getString("address"));
        }
	}
}	
		

			