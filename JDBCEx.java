import java.sql.*;
class JDBCEx{
	public static void main(String args[]){
		String driver="oracle.jdbc.driver.OracleDriver";
		String dbURL="jdbc:oracle:thin:@localhost:1521:XE";
		String user="system";
		String pass="admin";
		Connection conn=null;
		Statement stmt=null;
		try{
			Class.forName(driver);
			System.out.println("Connecting with Database");
			conn=DriverManager.getConnection(dbURL,user,pass);
			System.out.println("Creating Table");
		    stmt=conn.createStatement();
			if(stmt!=null){
				System.out.println("Connection Successful");
				String sqlq="create table student111("+"name varchar(50),"+"branch varchar(50))";
				stmt.executeUpdate(sqlq);
				System.out.print("Table successfully created");
			}
		}
		catch(ClassNotFoundException|SQLException se){
			se.printStackTrace();
		}
		finally{
			try{
				if(stmt!=null){
					stmt.close();
				}
			    if(conn!=null){
					conn.close();
				}
			}
			catch(SQLException e){
				e.printStackTrace();
		    }
		}
		System.out.println("Bye Bye");
	}
}

	
	
			 
				