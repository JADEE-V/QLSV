/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bich
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private static final String URL =
        "jdbc:mysql://localhost:3306/quanlysinhvien?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = ""; // XAMPP thường để trống

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // Thêm sinh viên
    public static boolean insertStudent(
            String maSV, String hoTen, String lop,
            String queQuan, String sdt, String email, String maTK) {

        String sql = "INSERT INTO student (maSV, hoTen, lop, queQuan, sdt, email, maTK) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, maSV);
            ps.setString(2, hoTen);
            ps.setString(3, lop);
            ps.setString(4, queQuan);
            ps.setString(5, sdt);
            ps.setString(6, email);
            ps.setString(7, maTK);

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Lấy danh sách tất cả sinh viên
    public static List<String[]> getAllStudents() {
        List<String[]> list = new ArrayList<>();
        String sql = "SELECT * FROM student";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String[] row = new String[7];
                row[0] = rs.getString("maSV");
                row[1] = rs.getString("hoTen");
                row[2] = rs.getString("lop");
                row[3] = rs.getString("queQuan");
                row[4] = rs.getString("sdt");
                row[5] = rs.getString("email");
                row[6] = rs.getString("maTK");
                list.add(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    // Sửa sinh viên theo maSV
public static boolean updateStudent(
        String maSV, String hoTen, String lop,
        String queQuan, String sdt, String email, String maTK) {

    String sql = "UPDATE student SET hoTen=?, lop=?, queQuan=?, sdt=?, email=?, maTK=? WHERE maSV=?";

    try (Connection conn = getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, hoTen);
        ps.setString(2, lop);
        ps.setString(3, queQuan);
        ps.setString(4, sdt);
        ps.setString(5, email);
        ps.setString(6, maTK);
        ps.setString(7, maSV);

        return ps.executeUpdate() > 0;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
}

// Xóa sinh viên theo maSV
public static boolean deleteStudent(String maSV) {
    String sql = "DELETE FROM student WHERE maSV=?";

    try (Connection conn = getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, maSV);
        return ps.executeUpdate() > 0;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
}

}
