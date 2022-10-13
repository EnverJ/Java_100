package java_100;

public class sqlDate_53 {
    public static void main(String[] args) {
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        System.out.println(date);
    }
}
