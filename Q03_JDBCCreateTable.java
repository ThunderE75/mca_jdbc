// Que 34

import java.sql.*;

class Q03_JDBCCreateTable {
    public static void main(String args[]) throws SQLException {

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "579520")) {

            if (conn != null) {
                System.out.println("Connected to the database! [jdbc]");
            } else {
                System.out.println("Couldn't connect to the database.");
            }

            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE Amity" +
                    "(id INTEGER not NULL," +
                    "first VARCHAR(255)," +
                    "last VARCHAR(255)," +
                    "age INTEGER," +
                    "PRIMARY KEY(id));";

            stmt.executeUpdate(sql);
            System.out.println("Table created!");
        }
    }
}

