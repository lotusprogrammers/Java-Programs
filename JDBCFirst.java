//STEP 1:import the packages
import java.sql.*;
public class JDBCFirst{
   // JDBC driver name and database URL
   static final String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
   static final String dbURL= "jdbc:oracle:thin:@localhost:1521:XE";
   //  Database credentials
   static final String user = "system";
   static final String pass = "admin"; 
   public static void main(String[] args) {
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
				String sqlq = "create table studentwipro1(name varchar(20),branch varchar(20))"; 
				stmt.executeUpdate(sqlq);
				System.out.println("Table created successfully...");
			}
		}
		catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		} 		
        finally{
			try{
				//finally block used to close resources
				if(stmt!=null)
					stmt.close();
				if(conn!=null)
					conn.close();
		   	}
			catch(SQLException e){
				e.printStackTrace();
		    }
		}//end finally try
      System.out.println("Goodbye!");
  }//end main
}