package JSONSTRINGOPER;

public class String2Json {

    public static void main(String[] args){
//        StringBuilder sb = new StringBuilder();
//        String aaa = "\"{\\\"imsi\\\":4,\\\"remark\\\":\\\"4---4\\\"}{\\\"imsi\\\":666666666666666,\\\"remark\\\":\\\"张三-123456190001010101-16666666666-无\\\"}{\\\"imsi\\\":666666666666666,\\\"remark\\\":\\\"张无-123456190001010101-16666666666-无\\\"}\"";
//        System.err.println(aaa);
//        aaa = aaa.replace("}","},");
//        System.out.println(aaa);
//        aaa = aaa.substring(1,aaa.length()-2);
//        sb.append("{\"remark\":[").append(aaa).append("]}");
//        System.out.println(sb.toString());
//
//

        String bbb = "{\"imsi\": 4, \"remark\": \"4---4\"},{\"imsi\": 666666666666666, \"remark\": \"张三-123456190001010101-16666666666-无\"}, {\"imsi\": 666666666666666, \"remark\": \"张无-123456190001010101-16666666666-无\"}";
        String ccc = bbb.replaceAll(" ","");
        System.err.println(ccc);
        ccc = ccc.replace("},{","}|{");
        System.out.println(ccc);
        System.err.println(bbb.replace("},{","}|{"));
    }

}
