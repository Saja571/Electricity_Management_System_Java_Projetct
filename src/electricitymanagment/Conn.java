package electricitymanagment;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", ""); // replace the password according to your account
            s = c.createStatement();
        } catch (Exception e) {
        }
    }
}