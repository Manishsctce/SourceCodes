package cdp_6_Objectpool1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Hashtable;


// Three methods are abstract 
// and therefore must be implemented by the subclass 
  
class JDBCConnectionPool extends ObjectPool<Connection> { 
    String dsn, usr, pwd; 
  
    JDBCConnectionPool(String driver, String dsn, String usr, String pwd) 
    { 
        super(); 
        try { 
            Class.forName(driver).newInstance(); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
        this.dsn = dsn; 
        this.usr = usr; 
        this.pwd = pwd; 
    } 
  
    Connection create() 
    { 
        try { 
            return (DriverManager.getConnection(dsn, usr, pwd)); 
        } 
        catch (SQLException e) { 
            e.printStackTrace(); 
            return (null); 
        } 
    } 
  
    void dead(Connection o) 
    { 
        try { 
            ((Connection)o).close(); 
        } 
        catch (SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
  
    boolean validate(Connection o) 
    { 
        try { 
            return (!((Connection)o).isClosed()); 
        } 
        catch (SQLException e) { 
            e.printStackTrace(); 
            return (false); 
        } 
    } 
} 
  
class Main { 
    public static void main(String args[]) 
    { 
        // Create the ConnectionPool: 
        JDBCConnectionPool pool = new JDBCConnectionPool( 
            "org.hsqldb.jdbcDriver", "jdbc:hsqldb: //localhost/mydb", 
            "sa", "password"); 
  
        // Get a connection: 
        Connection con = pool.takeOut(); 
        // Return the connection: 
        pool.takeIn(con); 
    } 
} 