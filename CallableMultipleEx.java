import java.sql.*;
import java.util.*;
class CallableMultipleEx{
	public static void main(String args[]) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		String sp="{call getNameandBranch(?,?,?)}";
		CallableStatement cstmt=con.prepareCall(sp);
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Roll Number to search name and branch");
		String roll=sin.next();
		cstmt.setString(1,roll);
		cstmt.registerOutParameter(2,java.sql.Types.VARCHAR);
		cstmt.registerOutParameter(3,java.sql.Types.VARCHAR);
		cstmt.execute();
		String name=cstmt.getString(2);
		String branch=cstmt.getString(3);
		System.out.println(roll+" name="+name+" branch="+branch);
	}
}	
		