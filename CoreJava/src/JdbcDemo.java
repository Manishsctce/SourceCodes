import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Simple Java Program to connect Oracle database by using Oracle JDBC thin driver
 * Make sure you have Oracle JDBC thin driver in your classpath before running this program
 * @author
 */
public class JdbcDemo {

    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        //URL of Oracle database server
    	Class.forName("oracle.jdbc.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
      
        //properties for creating connection to Oracle database
//        Properties props = new Properties();
//        props.setProperty("user", "system");
//        props.setProperty("password", "krishna");
      
        //creating connection to Oracle database using JDBC
        Connection conn = DriverManager.getConnection(url,"system","krsna2");

        String sql ="select sysdate as current_day from dual";

        //creating PreparedStatement object to execute query
        PreparedStatement preStatement = conn.prepareStatement(sql);
    
        ResultSet result = preStatement.executeQuery();
      
        while(result.next()){
            System.out.println("Current Date from Oracle : " +result.getString("current_day"));
        }
        System.out.println("done");
      
    }
}

