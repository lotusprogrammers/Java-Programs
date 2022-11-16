//Updating Record through ResultSet Object
import java.sql.*;
public class UpdateStudent{
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String q="select roll,name,branch from studentaits";
		ResultSet rs=stmt.executeQuery(q);
		rs.beforeFirst();
		while(rs.next()){
			if((rs.getString("branch")).equals("ce")){
				String newName="Sri "+rs.getString("name");
				rs.updateString("name",newName);
				rs.updateRow();
		    }
		}
        rs.beforeFirst();
        System.out.println("Roll     \t  Name \t  Branch  ");
        System.out.println("*******************************");
        while(rs.next()){
            System.out.println(rs.getString("roll")+"\t"+rs.getString("name")+"\t"+rs.getString("branch"));
		}
  }
}		