package java_100;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPrepard_64 {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDrive");

            Connection con = DriverManager.getConnection("jdbc.oracle:thin:@localhost:1521:xe", "system", "oracle");
            PreparedStatement stmt = con.prepareStatement("insert into Emp values(?,?)");
            stmt.setInt(1, 101); // 1. specifies the first parameter in the query
            stmt.setString(2, "Jungle");
            int i = stmt.executeUpdate();
            System.out.println(i + " record inserted");
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e);

        }
    }
}

