import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPAddressSimple {

     public static void main(String[] args){
         try
         {
             String wholeAddress = InetAddress.getLocalHost().toString();
             String [] address = wholeAddress.split("/");
             String realAddress = address[1];
             System.out.println("本机的IP = " + realAddress);
         } catch (UnknownHostException e)
         {
             e.printStackTrace();
         }
    }

}
