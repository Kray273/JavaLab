package Day116;

import java.io.*;
import java.net.URL;

public class URLTest2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com/index.html");
            String filepath = url.getFile(); //서버에서 path 출력
            String filename = filepath.split("/")[filepath.split("/").length-1]; //filename출력
            FileWriter fw = new FileWriter(filename); //file저장
            InputStream is = url.openStream();
            InputStreamReader ir = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(ir);
            while (true) {
                String line = br.readLine();
                if (line ==null) break;
                System.out.println(line);
                fw.write(line + "\n"); //파일로 기록
            }
            br.close();
            fw.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
