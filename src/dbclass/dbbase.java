
package dbclass;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class dbbase {

    
  
    public static Connection connect(){
        Connection con = null;
        
            
    
    String url = "jdbc:mysql://localhost:3306/mystore";
    String user = "root";
    String password = "";
    try{
     Class.forName("com.mysql.jdbc.Driver");
     con = (Connection) DriverManager.getConnection(url, user, password);
    }catch(Exception e){
        System.out.println(e);
    }
    return con;
    }
}
    
    

