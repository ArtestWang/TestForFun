package StringAndJSON;

import java.net.URLDecoder;

public class UrlTransfer {


public static void main(String[] args){
String url ="http://192.168.7.220:9080/datamanager/qosPage?aoData=%5B%7B%22name%22%3A%22sEcho%22%2C%22value%22%3A1%7D%2C%7B%22name%22%3A%22iColumns%22%2C%22value%22%3A6%7D%2C%7B%22name%22%3A%22sColumns%22%2C%22value%22%3A%22%2C%2C%2C%2C%2C%22%7D%2C%7B%22name%22%3A%22iDisplayStart%22%2C%22value%22%3A0%7D%2C%7B%22name%22%3A%22iDisplayLength%22%2C%22value%22%3A10%7D%2C%7B%22name%22%3A%22mDataProp_0%22%2C%22value%22%3Anull%7D%2C%7B%22name%22%3A%22bSortable_0%22%2C%22value%22%3Afalse%7D%2C%7B%22name%22%3A%22mDataProp_1%22%2C%22value%22%3A%22imsi%22%7D%2C%7B%22name%22%3A%22bSortable_1%22%2C%22value%22%3Atrue%7D%2C%7B%22name%22%3A%22mDataProp_2%22%2C%22value%22%3A%22count%22%7D%2C%7B%22name%22%3A%22bSortable_2%22%2C%22value%22%3Atrue%7D%2C%7B%22name%22%3A%22mDataProp_3%22%2C%22value%22%3A%22sites%22%7D%2C%7B%22name%22%3A%22bSortable_3%22%2C%22value%22%3Atrue%7D%2C%7B%22name%22%3A%22mDataProp_4%22%2C%22value%22%3A%22days%22%7D%2C%7B%22name%22%3A%22bSortable_4%22%2C%22value%22%3Atrue%7D%2C%7B%22name%22%3A%22mDataProp_5%22%2C%22value%22%3A%22dataQuery%22%7D%2C%7B%22name%22%3A%22bSortable_5%22%2C%22value%22%3Afalse%7D%2C%7B%22name%22%3A%22iSortCol_0%22%2C%22value%22%3A0%7D%2C%7B%22name%22%3A%22sSortDir_0%22%2C%22value%22%3A%22asc%22%7D%2C%7B%22name%22%3A%22iSortingCols%22%2C%22value%22%3A1%7D%2C%7B%22name%22%3A%22queryType%22%2C%22value%22%3A%22queryData%22%7D%2C%7B%22name%22%3A%22dataType%22%2C%22value%22%3A%22imsi%22%7D%5D";
String urlDecode= URLDecoder.decode(url);
    System.out.println(urlDecode);
}


}
