import java.util.Date;

public class JavaSet {

    public static void main(String[] args) {

        int i= 2147483642;

        long timeInMillis = System.nanoTime();

        for (int j = 0; j < 400000000; j++) {

            boolean b = i % 2 == 0;

        }

        System.out.println(System.nanoTime() - timeInMillis);

        for (int k = 0; k < 400000000; k++) {

            boolean c = (i & 1) == 0;

        }

        System.out.println(System.nanoTime() - timeInMillis);


        System.out.println(new Date());
    }

}