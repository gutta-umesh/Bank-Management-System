
package bank.management.system;


import java.sql.*;  
import java.util.*;
public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "maneesha14");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}