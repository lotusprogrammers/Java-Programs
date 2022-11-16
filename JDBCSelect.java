//JDBCSelect.java
import java.sql.*;
class JDBCSelect{
	public static void main(String[] args){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sQuery="select *from aitsgoogle";
			ResultSet rs=stmt.executeQuery(sQuery);
			int i=1;
			rs.afterLast();
			while(rs.previous()){
				System.out.println("Google Employee:"+i);
				System.out.println("********************");
				System.out.print("ID:"+rs.getString("empid")+"\t");
				System.out.print("Name:"+rs.getString("empname")+"\t");
				System.out.print("Designation:"+rs.getString("empdes")+"\n");
				i++;
			}	
			
		}
        catch(ClassNotFoundException e){
			e.printStackTrace();
		}
        catch(SQLException e){
            e.printStackTrace();
		}
	}
}
/*
F:\BHAVAJAVA\jdbc>javac JDBCSelect.java

F:\BHAVAJAVA\jdbc>java JDBCSelect
Google Employee:1
********************
ID:Google979    Name:Y Kavya    Designation:Senior Systems Engineer
Google Employee:2
********************
ID:Google977    Name:V Bhargavi Designation:Cloud Engineer
Google Employee:3
********************
ID:Google945    Name:M Harshavardhan Reddy      Designation:Associate Engineer
Google Employee:4
********************
ID:Google551    Name:Lakshmi Kanth      Designation:Associate Engineer
*/
			
			
			