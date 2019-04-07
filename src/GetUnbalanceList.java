import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetUnbalanceList {

    public static void main(String[] args){

        List<String> list1 = new ArrayList<String>();
        List<String> list2= new ArrayList<String>();

        list1.add("199");
        list2.add("333");
        list2.add("444");
        list2.add("555");
        list1.add("291");
        List<String> result = getComparedFinal(list1,list2);
        for(String a :result){
            System.err.println(a);
        }
    }




    private static List<String> getComparedFinal(List<String> list1, List<String> list2) {
        List<String> diff = new ArrayList<String>();
        List<String> maxList = list1;
        List<String> minList = list2;
//        if(list2.size()>list1.size())
//        {
//            maxList = list2;
//            minList = list1;
//        }
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
        }
        return diff;
    }
}
