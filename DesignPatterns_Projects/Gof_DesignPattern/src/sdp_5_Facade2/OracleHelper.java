package sdp_5_Facade2;

import java.sql.Connection;

public class OracleHelper {

	public static Connection getOracleDBConnection(){
		//get Oracle DB connection using connection parameters
		System.out.println("get Oracle DB connection");
		return null;
	}
	
	public void generateOraclePDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("generating Oracle PDF report");
	}
	
	public void generateOracleHTMLReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("generating Oracle HTML report");
	}
	
}
