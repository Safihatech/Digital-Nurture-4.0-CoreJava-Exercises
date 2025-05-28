import java.sql.*;

public class TransactionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        try (Connection conn = DriverManager.getConnection(url, "root", "#Iswarya@12")) {
            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE accounts SET balance = balance - 500 WHERE id = 1");
            stmt.executeUpdate("UPDATE accounts SET balance = balance + 500 WHERE id = 2");

            conn.commit();
            System.out.println("Transaction successful.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
