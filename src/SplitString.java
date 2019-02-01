import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitString {
    public static void main(String[] args){
        int id = 808;
        String b = "102,103,104,105";
        String contents[] = b.split(",");
            List paramList = new ArrayList();
            Map<String,Object> params = new HashMap<>();
            for(int i=0;i<contents.length;i++){
                params = new HashMap<>();
                params.put("userId",id);
                params.put("roleId",Integer.parseInt(contents[i]));
                paramList.add(params);
            }
        for(int j=0;j<paramList.size();j++) {
            System.err.println(paramList.get(j));
        }
        }

    }


