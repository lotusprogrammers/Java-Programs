import java.sql.*;
public class CallableEx1{
	public static void main(String args[]) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		String sp="{call getBranch(?,?)}";
		CallableStatement cstmt=con.prepareCall(sp);
		cstmt.setString(1,"eswar");
		cstmt.registerOutParameter(2,java.sql.Types.VARCHAR);
		cstmt.execute();
		System.out.println("Student  eswar Branch="+cstmt.getString(2));
    }
} 
	