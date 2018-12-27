package ImportAndExtract;

import Entity.FocusPeople;
import Entity.FocusVehicle;
import Entity.Sample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ExtractCSV {


    public static void main(String[] args){
        File file = new File("E:\\1.csv");
        List<String> dataList = new ArrayList<String>();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                dataList.add(line);
            }
        } catch (Exception e) {
        } finally {
            if (br != null) {
                try {
                    br.close();
                    br = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        List<FocusPeople> fpList= new ArrayList<>();
        List<FocusVehicle> fvList= new ArrayList<>();
        FocusPeople fp = new FocusPeople();
        FocusVehicle fv = new FocusVehicle();
        for(String data:dataList){
            String [] dp = data.split(",");
            fp.setImei(dp[0]);
            fp.setImei(dp[0]);
            fp.setImei(dp[0]);
            fp.setImei(dp[0]);
            fp.setImei(dp[0]);
            fp.setImei(dp[0]);
          fpList.add(fp);
        }
    }



}
