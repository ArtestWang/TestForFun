import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SplitWithSlash {
    public static List<String> facefilelist = new ArrayList<String>();
    public static void main(String[] args){
        String a = "D:\\File\\1092.finished";
        String b[] = a.split("\\\\");
        String e = "/home/zed/image/342623199412271412.jpg";

        String id[] = e.split("/");
        System.out.println(id[4]);
        String f[] = id[4].split("\\.");
        System.err.println(f[0]);



        for(int i=0;i<b.length;i++) {
            System.err.println(b[i]);
        }
//        try {
//            readfile("d:/File");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }



    public static boolean readfile(String filepath) throws FileNotFoundException, IOException {
        try {

            File file = new File(filepath);
            if (!file.isDirectory()) {
                System.out.println("文件");
                System.out.println("path=" + file.getPath());
                System.out.println("absolutepath=" + file.getAbsolutePath());
                System.out.println("name=" + file.getName());

            } else if (file.isDirectory()) {
                //System.out.println("文件夹");
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    File readfile = new File(filepath + "\\" + filelist[i]);
                    if (!readfile.isDirectory()) {
                        //System.out.println("path=" + readfile.getPath());
                        facefilelist.add(readfile.getPath());
                        System.out.println(readfile.getPath());
                        String a = readfile.getPath();
                        String c[] = a.split("\\\\");
                        System.out.println(c[2]);


                        int index = a.indexOf("\\");
                        index=a.indexOf("\\", index+1);

                        String b = a.substring(index+1);
                        System.err.println(b);
                        //System.out.println("absolutepath="+ readfile.getAbsolutePath());
                        //System.out.println("name=" + readfile.getName());

                    } else if (readfile.isDirectory()) {
                        readfile(filepath + "\\" + filelist[i]);
                    }
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("readfile()   Exception:" + e.getMessage());
        }
        return true;
    }
}
