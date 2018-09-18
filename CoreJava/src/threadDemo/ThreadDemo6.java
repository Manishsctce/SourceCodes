package threadDemo;
/* Thread scheduling demo with file generation using Collection and JDBC connection 
 * Here Thread t1 wait for 1st method to complete and generate file. It process the file and make a copy with extension _bank.txt 
 * Thread t2 wait for t1 completion and _bank.txt file
 */
import java.sql.*;
class MyClass{
	//static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	//static final String DB_URL = "jdbc:mysql://localhost/";
	static final String JDBC_DRIVER = "oracle.jdbc.OracleDriver";
	//jdbc:oracle:thin:@hostname:port Number:databaseName
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	static final String USER = "system";
	static final String PASS = "krsna";
	
	public void CreateFile() throws ClassNotFoundException,SQLException{
		Connection con = null;
		Statement stmt = null;
		//STEP 2: Register JDBC driver
	      Class.forName(JDBC_DRIVER);//throw ClassNotFoundException
	    //STEP 3: Open a connection
	     con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","krsna");//throw SQLException 
	     //STEP 4: Execute a query
	      stmt = con.createStatement();
	      ResultSet rs = stmt.executeQuery(" "
	      		+ "select employeenumber,firstname,lastname,email,jobtitle from employees where employeenumber='1002'");
	      //System.out.println(rs);
	      while(rs.next()){
	    	  int empId = rs.getInt(1);
	    	  String firstname = rs.getString(2);
	    	  String lastname = rs.getString(3);
	    	  String email = rs.getString(4);
	    	  String jobtitle = rs.getString("jobtitle");
	    	  System.out.println(jobtitle+" "+empId+" "+firstname+" "+lastname+" "+email);
	      }
	      rs.close();
	}
}

public class ThreadDemo6 {
	public static void main(String[] args) {
		
//1. To create report of all acct open in 1 month
//2. Find all employee whose bd is on sysdate		
//Enter the requirement no :
		MyClass c1 = new MyClass();
		try {
			c1.CreateFile();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
