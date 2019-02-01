import java.util.Date;

public class TestIsAfter {
    public static void main(String[] args){

        Date date1 = new Date();
        date1.setTime(1549850981);

        if(date1.after(new Date())){
            System.err.println("date1比new Date迟");
        }else
            System.out.println("date1不比new Date迟");

    }

}
