import java.sql.*;
public class UpdateResultAITS{
	public static void main(String args[]) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String sQuery="select empid,empname,empdes from aitsgoogle";
		ResultSet rs=stmt.executeQuery(sQuery);
		int i=1; 
		rs.beforeFirst();
		while(rs.next()){
               String ename=rs.getString("empname");
			   String newName="Great " +ename;
			   rs.updateString("empname",newName);
			   String newDes=rs.getString("empdes")+" Google";
			   rs.updateString("empdes",newDes);
		       rs.updateRow();
	   }
       rs.beforeFirst();
       System.out.println("EmpID \t EMPNAME \t\t EMPDES");        
	   while(rs.next()){
          System.out.println(rs.getString("empid")+"\t"+rs.getString("empname")+"\t"+rs.getString("empdes"));
	   } 	  
	}	
}


/*
F:\BHAVAJAVA\jdbc>javac UpdateResult.java

F:\BHAVAJAVA\jdbc>java UpdateResult
roll     name            branch
501     Sri ravi sir sir        cse
502     Sri chandra sir sir     cse
503     Sri siva sir sir        cse
577     Raghu sir       cse
579     Rahim   ece
507     raghu sir       cse
108     ramesh  ce
108     ramesh  ce
108     ramesh  ce
108     ramesh  ce
1201    Abdul   CSIT
1202    Ashok   CSIT
1203    Chaitanya       CSIT
1204    Ganesh  CSIT
1205    Gopi    CSIT
599     Siva Kumar sir  cse
401     eswar   ece
402     nisar   ece
403     kiran   eee
201     mahesh  me
202     venkatesh       me
101     Sri lakshmi     ce

F:\BHAVAJAVA\jdbc>

*/














	
	
