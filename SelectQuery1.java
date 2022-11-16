import java.sql.*;
public class SelectQuery1{
public static void main(String args[]) throws Exception{
	//Step 2:Registering with JDBC driver
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//Step 3:Getting Connection object
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
    //Step 4:Create Statement object
    Statement stmt=con.createStatement();
    String sQuery="select *from studentaits where roll='577'";
    //Step 5:SQL Query Execution
    ResultSet rs=stmt.executeQuery(sQuery);
    int i=1;
    while(rs.next()){//boolean next() called from ResultSet
         System.out.println("--------------------------------");
         System.out.println("Student Record:"+i);
         System.out.println("Roll Number:"+rs.getInt("roll"));
         System.out.println("Name:"+rs.getString("name"));
         System.out.println("Branch:"+rs.getString("branch"));
         System.out.println("Gender:"+rs.getString("gender"));
         System.out.println("Address:"+rs.getString("address"));
         System.out.println("--------------------------------");
         i++;
    }
  }
} 