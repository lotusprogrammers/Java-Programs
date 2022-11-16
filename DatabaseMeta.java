import java.sql.*;
public class DatabaseMeta{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
			DatabaseMetaData dbmd=con.getMetaData();
			String dname=dbmd.getDriverName();
			String url=dbmd.getURL();
			String dversion=dbmd.getDriverVersion();
			String user=dbmd.getUserName();
			String pname=dbmd.getDatabaseProductName();
			String pversion=dbmd.getDatabaseProductVersion();
			boolean bupdate=dbmd.supportsBatchUpdates();
			System.out.println("Database name="+dname);
			System.out.println("URL="+url);
			System.out.println("Database Version="+dversion);
			System.out.println("Database User Name="+user);
			System.out.println("Database Product name="+pname);
			System.out.println("Database Product Version="+pversion);
			System.out.println("Support Batch Updates?="+bupdate);
			
			}
		catch(Exception e){
			e.printStackTrace();
		}
    }
}	
/*
F:\BHAVAJAVA\jdbc>javac DatabaseMeta.java
F:\BHAVAJAVA\jdbc>java DatabaseMeta
Database name=Oracle JDBC driver
URL=jdbc:oracle:thin:@localhost:1521:XE
Database Version=10.2.0.1.0XE
Database User Name=SYSTEM
Database Product name=Oracle
Database Product Version=Oracle Database 10g Express Edition Release 10.2.0.1.0 - Production
Support Batch Updates?=true
*/