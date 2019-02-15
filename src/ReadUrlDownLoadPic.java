import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadUrlDownLoadPic {

    public static void main(String args[]) throws IOException {
        File file = new File("E:/urls_drawings.txt");
        StringBuilder result = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = null ;
        int i = 0;
        String path = "drawingPic/";
        Boolean success = false;
        while ((s = br.readLine())!=null){
            i++;
//            File pic=new File(path+i+".jpg") ;
            String pic = path+i+".jpg";
            System.out.println(s);
            success = downloadPicture(s,pic);
        }
        br.close();
        System.err.println(success);
    }


    public static Boolean downloadPicture(String urlList, String path) {
        URL url = null;
        try {
            url = new URL(urlList);
            DataInputStream dataInputStream = new DataInputStream(url.openStream());
            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int length;
            while ((length = dataInputStream.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            fileOutputStream.write(output.toByteArray());
            dataInputStream.close();
            fileOutputStream.close();
            return  true;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
