package myServlet;
import java.sql.*;

public class LoginDBO {
    Connection conn;
    Statement stmt;
    public LoginDBO(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wpad","root","111111");
            stmt=conn.createStatement();

        }catch(Exception e)
        {

            e.printStackTrace();
        }
    }
    public String login(String name, String password){
        String message="what the fuck?";
        try {
            message="try it";
            String sql1="select count(0) from users where username='"+name+"'";
            ResultSet rs1=stmt.executeQuery(sql1);
            if(rs1.next()){
                int userCount=rs1.getInt(1);
                if(0==userCount){
                    message="bucunzai";
                    return message;
                }
                String sql2="select count(0) from users where username='"+name+"'or userpass='"+password+"'";
                ResultSet rs2=stmt.executeQuery(sql2);
                if(rs2.next()){
                    int trueUserCount=rs2.getInt(1);
                    if(0==trueUserCount){
                        message="mimacuowu";
                        return message;
                    }
                    message="cenggong";
                }

            }
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e);

        }
        return message;

    }


}