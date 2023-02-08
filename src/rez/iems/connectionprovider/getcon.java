
package rez.iems.connectionprovider;
import java.sql.*;
public class getcon {
 
    private static Connection connect=null;
    public static Connection getConnection() {
        try {
            String url="jdbc:mysql://localhost:3306/iems";
            String username="root";
            String password="@Bir*^";
            connect=DriverManager.getConnection(url,username,password);
            if(connect!=null)
            {
               System.out.println("Database Connected Successfully");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return connect;
    }
}

