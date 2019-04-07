package DCB;

import java.io.BufferedReader;
import java.io.FileReader;

public class AnalyseDCB {

    public static void main(String[] args) throws Exception {

        String str;

        int times = 0;

        //记录出现次数

        FileReader fr = new FileReader("E:\\py\\facepy\\双色球.txt");

        BufferedReader br = new BufferedReader(fr);

        while ((str = br.readLine()) != null) {

            //循环读取每一行

            String str2 = str.substring(0, 2);

            //截取字符串的前两个字符（即开奖号码的第一个球）

            if (str2.equals("01")) {

                //判断是否为01（也可为其它）

                times = times + 1;

                //出现次数+1

            }

        }

        System.out.println(times);

//打印总出现次数

    }

}

