package miniproject;
import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    conn(){
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "user", "");
            s = c.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
