package Day116;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClientTest {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",10000);
        System.out.println("==클라이언트가 서버로 접속했습니다.==");
        String serverIp = s.getInetAddress().getHostAddress(); //Ip address 추출
        System.out.println("==클라이언트가 " + serverIp + " 서버로 접속 했습니다.==");

////////////////////////////////////////////////////////////////////////////////////////
        //클라이언트가 먼저 1번 게시물을 요청 = 출력스트림
        OutputStream os = s.getOutputStream();
        String request = "1번 게시물 요청\n"; //\n은 종료 키워드로 사용!
        byte[] bytes = request.getBytes();
        os.write(bytes); //os.write(byte[] or int)

////////////////////////////////////////////////////////////////////////////////////////
        //서버로부터 요청을 수락 = 입력스트림
        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String response = br.readLine();
        System.out.printf("==클라이언트가 서버로부터 '%s'요청을 전달받았습니다.==\n",response);
////////////////////////////////////////////////////////////////////////////////////////

        s.close();
        System.out.println("==클라이언트가 서버의 접속을 해지했습니다.==");

    }
}
