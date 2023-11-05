import java.sql.*;
import java.io.*;

class Q05_InsertPreparedStatement {
    public static void main(String args[]) throws SQLException {

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lib", "root", "579520")) {

            if (conn != null) {
                System.out.println("Connected to the database lib");
            } else {
                System.out.println("Failed to make connection");
            }
            String sql = "INSERT INTO city(Name,City) values(?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your Name: ");
            String Name = br.readLine();
            System.out.print("Enter City: ");
            String City = br.readLine();
            pstmt.setString(1, Name);
            pstmt.setString(2, City);
            pstmt.executeUpdate();
            System.out.println("Values Inserted!");
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// USE jdbc;
// CREATE TABLE city(
// name VARCHAR(20),
// city VARCHAR(20)
// );