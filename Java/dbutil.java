import java.sql.*;

public class dbutil {
    private static final String username = "root";
    private static final String password = "579520";
    private static final String url = "jdbc:mysql://localhost:3306/jdbc";

    private static Connection con = null;
    static {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return con;
    }
}