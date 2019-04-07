import java.math.BigDecimal;

public class PrintPi {



    private static final BigDecimal FOUR = BigDecimal.valueOf(4);
    private static final int roundingMode = BigDecimal.ROUND_HALF_EVEN;
    private static BigDecimal result;

    public static void main(String[] args) {
        Runnable r= new Runnable() {
            public void run() {
                result = computePi(500
                );
            }
        };
        Thread t=new Thread(r);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(result);

    }

    public static BigDecimal computePi(int diigits){
        int scale = diigits+5;
        BigDecimal arctan1_5 = arctan(5,scale);
        BigDecimal arctan1_239= arctan(239, scale);
        BigDecimal pi = arctan1_5.multiply(FOUR).subtract(arctan1_239).multiply(FOUR);
        return pi.setScale(diigits,BigDecimal.ROUND_HALF_UP);

    }

    private static BigDecimal arctan(int inversex, int scale) {
        BigDecimal result , numer , term;
        BigDecimal invX = BigDecimal.valueOf(inversex);
        BigDecimal invY = BigDecimal.valueOf(inversex*inversex);
        numer = BigDecimal.ONE.divide(invX, scale, roundingMode);
        result = numer;
        int i = 1;
        do{
            numer=numer.divide(invY, scale, roundingMode);
            int denom = 2*i+1;
            term = numer.divide(BigDecimal.valueOf(denom), scale, roundingMode);
            if((i%2)!=0){
                result = result.subtract(term);
            }else {
                result = result.add(term);
            }
            i++;
        }while(term.compareTo(BigDecimal.ZERO)!=0);
        return result;
    }
}



