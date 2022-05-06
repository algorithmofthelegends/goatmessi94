import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exam {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat format2 = new SimpleDateFormat("yyyyMM");
        DateFormat format3 = new SimpleDateFormat("yyyy-MM");
        Calendar cal = Calendar.getInstance();
        //cal.add(Calendar.MONTH, -1);
        String time1 = format3.format(cal.getTime())+"-01";
        //String time2 = format3.format(cal.getTime())+"-31 23:59:59";
        //String time2 = format.format(cal.getTime())+" 00:00:00";
        cal.add(Calendar.MONTH, 1);
        String time2 = format3.format(cal.getTime())+"-01";

        System.out.println(time1);
        System.out.println(time2);
    }
}
