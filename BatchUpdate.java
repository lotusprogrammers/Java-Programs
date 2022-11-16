//Step 1:importing java.sql package
import java.sql.*;
public class BatchUpdate{
	public static void main(String args[]) throws Exception{
		//Step 2:Registering with JDBC driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Step 3:Getting Connection object
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		con.setAutoCommit(false);
		//Step 4:Create Statement object
		Statement stmt=con.createStatement();
		int a[]=new int[10];
		String q1="insert into aitsgoogle values('Google777','Sankar','AWS Administrator')";
		stmt.addBatch(q1);
		String q2="insert into aitsgoogle values('Google555','Ismail','CEO')";
		stmt.addBatch(q2);
		String q3="update aitsgoogle set empdes='CFO' where empdes='CEO'";
		stmt.addBatch(q3);
		a=stmt.executeBatch();
		for(int i:a)
			System.out.println(i+"\t");
		con.commit();
		
	}
}	
/*
F:\BHAVAJAVA\jdbc>javac BatchUpdate.java
F:\BHAVAJAVA\jdbc>java BatchUpdate
*/	
