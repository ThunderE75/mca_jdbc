import java.sql.*;

public class Q04_JDBCInsertExecuteUpdate {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String pass = "579520";
        String sql = "";
        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            if (conn != null) {
                System.out.println("[jdbc] Database Connected!");
                Statement stmt = conn.createStatement();
                System.out.println("Inserting data into the tables");
                sql = "INSERT INTO student_placement (name,email,company) VALUES ('Navneet Dubey','example008@gmail.com','Accenture')";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO student_placement (name,email,company) VALUES ('Shivang Mehlotra','example067@gmail.com','HCL')";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO student_placement (name,email,company) VALUES ('Rishabh Mohan','example067@gmail.com','Infosys')";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO student_placement (name,email,company) VALUES ('Syed Raza Ali','example067@gmail.com','Shell')";
                stmt.executeUpdate(sql);
                System.out.println("Data inserted successfully");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

// USE jdbc;
// CREATE TABLE student_placement(
// id INT PRIMARY KEY AUTO_INCREMENT,
// name VARCHAR(32),
// email VARCHAR(32),
// company VARCHAR(32));
