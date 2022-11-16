import java.sql.*;
public class UpdateResult{
	public static void main(String args[]) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String sQuery="select empid,empname,empdes from aitsgoogle";
		ResultSet rs=stmt.executeQuery(sQuery);
		int i=1; 
		rs.beforeFirst();
		while(rs.next()){
              if((rs.getString("branch")).equals("cse")){              
			  String newName=rs.getString("name")+" sir";
		       rs.updateString("name",newName);
		       rs.updateRow();
			  }			   
	   }
       rs.beforeFirst();
       System.out.println("roll \t name \t\t branch");        
	   while(rs.next()){
          System.out.println(rs.getString("roll")+"\t"+rs.getString("name")+"\t"+rs.getString("branch"));
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














	
	
