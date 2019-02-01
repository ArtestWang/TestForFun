package StringAndJSON;


import net.sf.json.JSONObject;

public class TransferToJSONString {

     public static void main(String[] args) throws Exception{
         String jsonStr = "{mac:98:3b:16:fe:44:70,men:1761MB,storage:3921.16MB,deviceid:15d994b1}";
         System.out.println("转换前：" + jsonStr);
         jsonStr = jsonStr.substring(1, jsonStr.length() - 1);
         String[] strs = jsonStr.split(",");
         StringBuffer stringBuffer = new StringBuffer("{");
         for (int i = 0; i < strs.length; i++) {
             stringBuffer.append("\""
                     + strs[i].substring(0, strs[i].indexOf(":")) + "\":\""
                     + strs[i].substring(strs[i].indexOf(":") + 1) + "\",");
             System.out.println(strs[i].substring(0, strs[i].indexOf(":"))
                     + " = " + strs[i].substring(strs[i].indexOf(":") + 1));
         }
         stringBuffer.replace(stringBuffer.length() - 1,stringBuffer.length(), "}");

         JSONObject jsonObject = JSONObject.fromObject(stringBuffer.toString());
         System.out.println("转换后：" + jsonObject);

    }

}
