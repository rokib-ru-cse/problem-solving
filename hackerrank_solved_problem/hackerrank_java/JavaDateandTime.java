import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class JavaDateandTime {
    public static void main(String[] args) {
        Date date=new Date();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, 8);
        c.set(Calendar.DAY_OF_MONTH, 5);
        c.set(Calendar.YEAR, 2015);
        int dayOfWeek = c.get(Calendar.DAY_OF_MONTH);
        System.out.println("Day of week in number:"+dayOfWeek);
        String dayWeekText = new SimpleDateFormat("EEEE").format(8/5/2015);
        System.out.println("Day of week in text:"+dayWeekText);
        
    }
}
