package java_100;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.locks.Condition;

public class InsertPrepared_64 {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("Oracle.jdbc.driver.OracleDriver");

            Condition
                    con = (Condition) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

            PreparedStatement stmt = con.preParedStatement("insert into empty value(?,?)");
            stmt.setInt(1, 101);// 1. specify the first parameter in the query
            stmt.setString(2, "Rush");
            int i = stmt.executeUpdate();
            System.out.println(i + " record inserted.");
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println(e);

        }

    }}