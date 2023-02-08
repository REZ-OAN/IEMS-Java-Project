
package rez.iems.info;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class vendorinfo {
    private final Connection connect;
       public vendorinfo(Connection con)
       {
           this.connect=con;
       }
       public boolean savevendorinfo(vendorentities vendor) 
       {
           boolean flag=false;
           try{
               String query = "insert into vendor(code,name,bin,email,pass,address,profilepic,contactno,response) values(?,?,?,?,?,?,?,?,?)";
               
               PreparedStatement psmt=this.connect.prepareStatement(query);
                psmt.setInt(1,vendor.getCode());
                psmt.setString(2,vendor.getName());
                psmt.setString(3,vendor.getBin());
                psmt.setString(4,vendor.getEmail());
                psmt.setString(5,vendor.getPass());
                psmt.setString(7, vendor.getImg());
                psmt.setString(6,vendor.getAddress());
                psmt.setString(8,vendor.getContactno());
                psmt.setDouble(9,vendor.getResponse());                  
                psmt.executeUpdate();
               
             
                flag=true;
           }catch(Exception e){
               e.printStackTrace();
               
           }
           return flag;
       }
       public vendorentities getvendor(String email,String pass)
       {
         
         vendorentities vendor = null;
           try{
               String query = "select * from vendor where email='"+email+"' and pass='"+pass+"' ";
               PreparedStatement  psmt=connect.prepareStatement(query);
               ResultSet rs=psmt.executeQuery(query);
              
               while(rs.next())
               {
                   int a = rs.getInt("code");
                   
                   String b = rs.getString("name");
                   String c = rs.getString("bin");
                   String d = rs.getString("email");
                   String e = rs.getString("pass");
                   String f = rs.getString("address");
                   String g = rs.getString("profilepic");
                   String h = rs.getString("contactno");
                   Double i = rs.getDouble("response");
                           
                   vendorentities ven = new vendorentities(a,b,c,d,e,f,g,h,i);
                   vendor=ven;
               }
             
               
            
           }catch(Exception e)
           {
               e.printStackTrace();
           }
           return vendor;
       }
      
}
