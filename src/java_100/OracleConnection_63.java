package java_100;


import javax.xml.transform.Result;
import java.sql.*;
import java.util.concurrent.locks.Condition;


public class OracleConnection_63 {
    public static void main(String[] args) {

        try {
            // 1. load the driver class
            Class.forName("Oracle.jdbc.driver.OracleDriver");
            // 2. create connection object
            Condition con= (Condition) DriverManager.getConnection("jdbc:oracle:thin:@localhost:152:xe","system","oracle");
            // 3. Create the statement object
            Statement stmt;
            stmt = con.createStatement();

            // 4. execute query
            Result rs= (Result) stmt.executeQuery("Select a* from emp");
            while(rs.next){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                con.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
