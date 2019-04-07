package DCB;

import java.util.Set;
import java.util.TreeSet;

public class SimpleMockingDCB {

    public static void main(String[] args){
        for(int k = 0; k<11;k++) {
            Set<String> set = new TreeSet<String>();
            while (true) {
                int sui = (int) (Math.random() * 33) + 1;// 获取33以内的数字
                set.add(sui < 10 ? "0" + sui : "" + sui);//将元素存入集合中
                if (set.size() == 6) {//存满六个红色球，则结束循环
                    break;
                }
            }
            Set<String> set2 = new TreeSet<String>();
            int sui2 = (int) (Math.random() * 16) + 1;// 获取16以内的数字
            set2.add(sui2 < 10 ? "0" + sui2 : "" + sui2);
            System.out.println("红球：" + set + " 蓝球：" + set2);
        }
    }



}
