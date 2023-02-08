
package rez.iems.info;
import java.io.FileInputStream;
import java.sql.*;

public class customerinfo {
       private final Connection connect;
       public customerinfo(Connection con)
       {
           this.connect=con;
       }
       public  boolean savecustomerinfo(customerentities customer) 
       {
           boolean flag=false;
           try{
               String query = "insert into client(cnid,name,email,phoneno,pass,address,profilepic) values(?,?,?,?,?,?,?)";
               PreparedStatement psmt=this.connect.prepareStatement(query);
                psmt.setString(1,customer.getCnid());
                psmt.setString(2,customer.getName());
                psmt.setString(3,customer.getEmail());
                psmt.setString(4,customer.getContactno());
                psmt.setString(5,customer.getPass());
                psmt.setString(6,customer.getAddress());
                psmt.setString(7,customer.getImg());
                psmt.executeUpdate();
                flag=true;
           }catch(Exception e){
               e.printStackTrace();
           }
           return flag;
       }
       public customerentities getcustomer(String email,String pass)
       {
           customerentities customer = null;
           try{
               String query = "select * from client  where email='"+email+"' and pass='"+pass+"' ";
               PreparedStatement  psmt=connect.prepareStatement(query);
               ResultSet rs=psmt.executeQuery(query);
               while(rs.next())
               {
                   String a = rs.getString("cnid");
                   String b = rs.getString("name");
                   String c = rs.getString("email");
                   String d = rs.getString("phoneno");
                   String e = rs.getString("pass");
                   String f = rs.getString("address");
                   String g = rs.getString("profilepic");
                   customer= new customerentities(a,b,c,d,e,f,g);
                   
               }
            
           }catch(Exception e)
           {
               e.printStackTrace();
           }
           return customer;
       }
}
