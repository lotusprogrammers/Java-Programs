import java.sql.*;
import java.util.*;
public class CallableMultiple{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
			String sql="{call getNameBranch(?,?,?)}";
			CallableStatement cstmt=con.prepareCall(sql);
			Scanner sin=new Scanner(System.in);
			System.out.println("Enter Student Roll Number available in studentaits table");
			String roll=sin.next();
			cstmt.setString(1,roll);
			cstmt.registerOutParameter(2,java.sql.Types.VARCHAR);
			cstmt.registerOutParameter(3,java.sql.Types.VARCHAR);
			cstmt.execute();
			String name=cstmt.getString(2);
			String branch=cstmt.getString(3);
			System.out.println(roll+" name is "+name+" and branch is "+branch);
		}
		catch(Exception e){
			e.printStackTrace();
		}
    }
}	
