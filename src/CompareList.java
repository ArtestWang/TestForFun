import java.util.*;

public class CompareList {


    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
//        for (int i = 0; i < 10000; i++) {
//            list1.add("test"+i);
//            list2.add("test"+i*2);
//        }
        list1.add("101");
        list1.add("102");
//        list1.add("103");
//        list1.add("104");
        list2.add("102");
        list2.add("103");
        list2.add("104");

//        list1.addAll(list2);
//            HashSet h = new HashSet(list1);
//            list1.clear();
//            list1.addAll(h);


//        for(String a: list1){
//            System.out.println(a);
//        }
//        getDiffrent5(list2,list1);
        //输出：getDiffrent3 total times 61763995

String content = "102,103,104";
        List<String> finalList = listCompare(list2,list1);
        StringBuffer sb = new StringBuffer();

        if(finalList.size()>0){
            for(String site:finalList){
                sb.append(site).append(",");
            }
        }
        System.err.println(sb);
        content = sb.substring(0,sb.length()-1);
        System.out.println(content);
    }



    private static List<String> getDiffrent5(List<String> list1, List<String> list2) {
        long st = System.nanoTime();
        List<String> diff = new ArrayList<String>();
        List<String> maxList = list1;
        List<String> minList = list2;
        if(list2.size()>list1.size())
        {
            maxList = list2;
            minList = list1;
        }
        Map<String,Integer> map = new HashMap<String,Integer>(maxList.size());
        for (String string : maxList) {
            map.put(string, 1);
        }
        for (String string : minList) {
            if(map.get(string)!=null)
            {
                map.put(string, 2);
                continue;
            }
            diff.add(string);
            System.err.println(string);
        }
        for(Map.Entry<String, Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                diff.add(entry.getKey());
                System.err.println(entry.getKey());
            }
        }
        System.out.println("getDiffrent5 total times "+(System.nanoTime()-st));
        return diff;

    }



    private static List<String> listCompare(List<String>applySiteList, List<String> rightSiteList) {
        Map<String,Integer> map = new HashMap<String,Integer>(rightSiteList.size());
        List<String> differentList = new ArrayList<String>();
        for(String a : rightSiteList){
            map.put(a,1);
        }
        for(String b : applySiteList){
            if(map.get(b)==null){
                differentList.add(b);
            }
        }
        return differentList;
    }



}
