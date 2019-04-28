import java.util.regex.Pattern;

public class IMSIRegex {
    public static void main(String[] args){
    judgeIfIMSI("234561234567890");

    }
    public static Boolean judgeIfIMSI(String imsi){
        Boolean flag = false;
        String IMSIRegEx ="^460[0,1,2,3,4,5,6,7,8,9]d{11}$";
        String  IMSIRegEx2 ="^45[0,1,2,3,4,5,6,7,8,9]d{12}$";
        if(!Pattern.compile(IMSIRegEx).matcher(imsi).find()||!Pattern.compile(IMSIRegEx2).matcher(imsi).find()){
            flag = true;

        }
        System.out.println(flag);
        return flag;
    }

}
