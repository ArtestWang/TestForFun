import java.util.regex.Pattern;

public class MacTransfer {

    public static void main(String[] args){
            String mac = "05:DA:DA:DA:DA:DA" ;
            boolean flag = judgeFakeMac(mac);
        System.out.println(flag);
//            String firstPart = mac.substring(1,2);
//            String a = hexString2binaryString(firstPart);
//        System.err.println(a);
//        System.out.println(a.substring(2,3));
//        System.err.println(firstPart);
    }



    public static String hexString2binaryString(String hexString) {
//        if (hexString == null || hexString.length() % 2 != 0)
//            return null;
//        String bString = "", tmp;
//
//            tmp = "0000" + Integer.toBinaryString(Integer.parseInt(hexString, 16));
//            bString = tmp.substring(tmp.length() - 4);
//
//        return bString ;

        int a = Integer.parseInt(hexString,16);
        return Integer.toBinaryString(a);

    }

    public static Boolean judgeFakeMac(String hexString) {

        Boolean flag = false;
        String patternMac="^[A-F0-9]{2}(:[A-F0-9]{2}){5}$";
        if (hexString == null || hexString.equals("")||!Pattern.compile(patternMac).matcher(hexString).find()){
            flag = true;
        }else {
            hexString = hexString.substring(1, 2);
            String bString = "", tmp;

            tmp = "0000" + Integer.toBinaryString(Integer.parseInt(hexString, 16));
            bString = tmp.substring(tmp.length() - 4);
            if (bString.substring(2, 3).equals("1")) {
                flag = true;
            }
        }
        return flag ;
    }




}
