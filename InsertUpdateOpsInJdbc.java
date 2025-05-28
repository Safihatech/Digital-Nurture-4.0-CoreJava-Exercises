import java.sql.*;

public class StudentDAO {
    private Connection conn;

    public StudentDAO() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "#Iswarya@12");
    }

    public void insertStudent(int id, String name) throws SQLException {
        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();
    }

    public void updateStudent(int id, String newName) throws SQLException {
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, newName);
        ps.setInt(2, id);
        ps.executeUpdate();
    }

    public static void main(String[] args) throws SQLException {
        StudentDAO dao = new StudentDAO();
        dao.insertStudent(1, "John");
        dao.updateStudent(1, "Johnny");
    }
}
