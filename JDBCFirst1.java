//STEP 1:import the packages
import java.sql.*;
public class JDBCCSEA{
   public static void main(String[] args) {
		// JDBC driver name and database URL
        String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
        String dbURL= "jdbc:oracle:thin:@localhost:1521:XE";
        //  Database credentials
        String user = "system";
        String pass = "admin"; 
		Connection conn = null;
		Statement stmt = null;
		try{
			//STEP 2: Register JDBC driver
			Class.forName(jdbcDriver);
			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(dbURL,user,pass);
			//STEP 4: Execute a query
			System.out.println("Creating database...");
			stmt = conn.createStatement();
			if(stmt!=null){
				System.out.println("connection established");
				String sqlq = "create table annamacharya(rnum varchar(20),name varchar(20),branch varchar(20))"; 
				stmt.executeUpdate(sqlq);
				System.out.println("Table created successfully...");
			}
		}
		catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		} 		
        System.out.println("Success You are connected with database and created table!");
  }//end main
}