import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetHalfHourAgoTime {
    public static void main(String[] args){
        Calendar now=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String end = sdf.format(now.getTimeInMillis());
        now.add(Calendar.MINUTE,-30);
        String start=sdf.format(now.getTimeInMillis());
        System.out.println(end);
        System.err.println(start);
       
    }

}
