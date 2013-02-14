import java.io.*; 
import java.util.*;  
import java.sql.Connection; 
import java.sql.Statement; 
import java.sql.ResultSet; 
import java.sql.DriverManager; 
import java.sql.SQLException;  

// javac -classpath ./mysql-connector-java-5.1.12-bin.jar:./ IBMS.java
// java -classpath ./mysql-connector-java-5.1.12-bin.jar:./ IBMS

public class IBMS{
  
  public ResultSet makeQuery(String text) throws SQLException, ClassNotFoundException
  {
    Class.forName( "com.mysql.jdbc.Driver" );

    Connection conn = DriverManager.getConnection(
     "jdbc:mysql://ramen.cs.man.ac.uk/13_COMP23420_F13",
     "13_COMP23420_F13",
     "jzUfQLA9xyj1jSnY" );

    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(text);

    
    return rs;
  }
}



