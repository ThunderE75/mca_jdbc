import java.sql.*;
import java.io.*;

class Q06_InsertPreparedStatementLooped {
    public static void main(String args[]) throws SQLException {

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "579520")) {

            if (conn != null) 
                System.out.println("Connected to the database! [jdbc]");
            else System.out.println("Failed to make connection");

            String sql = "INSERT INTO city(Name,City) VALUES (?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            do {
                System.out.print("Enter Name: ");
                String name = br.readLine();
                System.out.print("Enter City: ");
                String city = br.readLine();
                pstmt.setString(1, name);
                pstmt.setString(2, city);
                int i = pstmt.executeUpdate();
                System.out.println(i + " record affected!");
                System.out.println("Do you wish to continue (Y/n): ");
                String s = br.readLine();
                if (s.startsWith("n")) {
                    break;
                }
            } while (true);
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