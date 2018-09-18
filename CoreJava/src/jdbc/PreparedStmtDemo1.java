package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStmtDemo1 {
	public static void main(String[] args) throws SQLException, Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","krsna2");
		
		Statement st1 = con.createStatement();
		
		String sql1 = "Select * from dept" ;
		PreparedStatement st2 = con.prepareStatement(sql1);
		//con.prepareStatement(sql1, , resultSetConcurrency)
		//st2.setInt(1, 20);
		
		st2.execute();
		
		ResultSet rs = st2.getResultSet();
		displayResultSet(rs);
		
		con.close();
		System.out.println("Done");
	}
	
	public static void displayResultSet(ResultSet rs) throws Exception{		
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
	}
}
