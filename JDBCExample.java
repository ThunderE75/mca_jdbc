
// Que 32
import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        // creates Connection objects
        Connection conn1 = null;

        try {
            // connect way #1
            String user = "root";
            String password = "579520";
            String url = "jdbc:mysql://localhost:3306/jdbc";

            conn1 = DriverManager.getConnection(url, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database!");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}
