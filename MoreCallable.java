import java.sql.*;
import java.util.*;
class MoreCallable{
	public static void main(String args[]) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		String sp="{call getGoogleDetails(?,?)}";
		CallableStatement cstmt=con.prepareCall(sp);
		cstmt.setString(1,"Google789");
		cstmt.registerOutParameter(2,oracle.jdbc.OracleTypes.CURSOR);
		cstmt.execute();
		ResultSet rs=(ResultSet)cstmt.getObject(2);//ResultSet getObject(int index);
		if(rs!=null){
			while(rs.next()){
				System.out.println("Google789's Name:"+rs.getString(1));
				System.out.println("Google789's Designation:"+rs.getString(2));
			}
		}
   }
}
/*
F:\BHAVAJAVA\jdbc>javac MoreCallable.java
F:\BHAVAJAVA\jdbc>java MoreCallable
Student Name:Ashok
Student Branch:CSIT   
*/	
		