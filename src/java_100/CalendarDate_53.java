package java_100;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDate_53 {
    public static void main(String[] args) {
        int day, month, year;
        int second,minute,hour;
        GregorianCalendar date=new GregorianCalendar();

        day=date.get(Calendar.DAY_OF_MONTH);
        month=date.get(Calendar.MONTH);
        year=date.get(Calendar.YEAR);

        second=date.get(Calendar.SECOND);
        minute=date.get(Calendar.MINUTE);
        hour=date.get(Calendar.HOUR);
        System.out.println("current time is: "+month+"-"+date+"-"+year+"  "+hour+":"+minute+":"+second);
    }
}
