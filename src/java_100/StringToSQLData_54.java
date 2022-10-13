package java_100;

import java.sql.Date;

public class StringToSQLData_54 {
    public static void main(String[] args) {
        String str="2022-10-13";
        Date date= Date.valueOf(str);// converting string into a sql date
        System.out.println(date);
    }
}
