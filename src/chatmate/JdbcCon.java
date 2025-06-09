/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatmate;

import java.awt.BorderLayout;
import java.sql.*;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class JdbcCon {
     Connection con;
    PreparedStatement ps;
    ResultSet rs; 
     public JdbcCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql",
                    "root","moiz.1");
            System.out.println("Connection ok ...!");
        }catch(Exception e ){
      e.printStackTrace();
    }
  }
    boolean search (String uname, String pass)throws Exception{
    ps= con.prepareStatement("select * from firstdb.login where username= ? and password = ?");
    ps.setString(1,uname);
    ps.setString(2,pass);
    rs = ps.executeQuery();
    if (rs.next())
        return true;
        else 
        return false;
                
    }
    void insert(String uname,String pass)throws Exception{
        ps = con.prepareStatement("insert into firstdb.login  (username,password ) values(?,?)");
        ps.setString(1,uname);
        ps.setString(2,pass);
        ps.executeUpdate();
            }   
    void add(String uname)throws Exception{
        ps = con.prepareStatement("create table firstdb."+uname+ "( send varchar(1000) , receive varchar(1000) , chatT TIME )");
     
        ps.executeUpdate();

    }
    void addChat(String uname, String chat) throws Exception{
         LocalTime currentTime = LocalTime.now();
         Time time= Time.valueOf(currentTime);
        ps= con.prepareStatement("insert into firstdb."+uname+" values(?,?,?)");
        ps.setString(1, chat);
        ps.setString(2,"");
        ps.setTime(3, time);
        ps.executeUpdate();
    }
    void addRecieve(String uname, String chat) throws Exception{
        LocalTime currentTime = LocalTime.now();
        Time time= Time.valueOf(currentTime);

        ps= con.prepareStatement("insert into firstdb."+uname+" values(?,?,?)");
        ps.setString(1, "");
        ps.setString(2,chat);
        ps.setTime(3,time);
        
        ps.executeUpdate();
    }
    
    public void getMessage(String uname) throws SQLException{
        ClientSide cb = new ClientSide();
        Statement sta= con.createStatement();
        ResultSet rs = sta.executeQuery("select * from firstdb."+uname);
        while(rs.next()){
           System.out.println(rs.getString("send"));
           System.out.println(rs.getTime("chatT"));
//            JPanel right = new JPanel(new BorderLayout());
//            right.add(panel2, BorderLayout.LINE_END);
//            cb.vertical.add(right);    
        }
    }
   
}


