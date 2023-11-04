import java.sql.*;

class Q02_JDBCRetrieve {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "579520")) {

            if (conn != null)
                System.out.println("Connected to the database!");
            else
                System.out.println("Couldn't connect to the database!");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");
            while (rs.next())
                System.out.println(rs.getString(1) + " - " + rs.getString(2));

            conn.close();
        } catch (Exception e) {
        }
    }
}

// CREATE TABLE books (
// id INT,
// name VARCHAR(32));

// INSERT INTO books (id, name) VALUES (1, "Java Complete Reference");
// INSERT INTO books (id, name) VALUES (2, "JDBC Handbook");