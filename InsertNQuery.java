//Step 1:importing java.sql package
import java.sql.*;
import java.util.*;
public class InsertNQuery{
	public static void main(String args[]) throws Exception{
		//Step 2:Registering with JDBC driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Step 3:Getting Connection object
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		//Step 4:Create Statement object
		PreparedStatement pstmt=con.prepareStatement("insert into studentaits values(?,?,?,?,?)");
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter 5 records to insert");
		int i=0;
		while(i<5){
			System.out.println("Enter Record:"+i);
			System.out.println("Enter Roll");
			String sroll=sin.next();
			System.out.println("Enter Name");
			String sname=sin.next();
			System.out.println("Enter Branch");
			String sbranch=sin.next();
            System.out.println("Enter Gender");
			String sgender=sin.next();
			System.out.println("Enter Address");
			String saddress=sin.next();
	        pstmt.setString(1,sroll);
            pstmt.setString(2,sname);
            pstmt.setString(3,sbranch);
            pstmt.setString(4,sgender);
            pstmt.setString(5,saddress);			
     		//Step 5:SQL Query Execution
		    int x=pstmt.executeUpdate();
		if(x>0)
			System.out.println(x+"Rows inserted");
		i++;
	 }	
	}
}	
	
