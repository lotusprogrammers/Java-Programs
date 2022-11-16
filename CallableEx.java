import java.sql.*;
public class CallableEx{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
			String plsql="{call getNameDes(?,?,?)}";
			CallableStatement cstmt=con.prepareCall(plsql);
			cstmt.setString(1,"Google945");
			cstmt.registerOutParameter(2,java.sql.Types.VARCHAR);
			cstmt.registerOutParameter(3,java.sql.Types.VARCHAR);
			cstmt.execute();
			String ename=cstmt.getString(2);
			String edes=cstmt.getString(3);
			System.out.println("Google945's Name="+ename);
			System.out.println("Google945's Designation="+edes);
		}
		catch(Exception e){
			e.printStackTrace();
		}
    }
}
/*
F:\BHAVAJAVA\jdbc>javac CallableEx.java

F:\BHAVAJAVA\jdbc>java CallableEx
501 branch is:CSIT	

*/
