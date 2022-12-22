package Day116;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ProductInformTCPClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",12000);
        String serverIp = s.getInetAddress().getHostAddress();
        System.out.println("==클라이언트가 " + serverIp + " 서버로 접속 했습니다.==");

////////////////////////////////////////////////////////////////////////////////////////
        //게시물을 요청 = 출력스트림
        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 상품명을 입력하세요.");
        System.out.print("상품명 : ");
        String name = sc.next();

        OutputStream os = s.getOutputStream();
        name = name + " ";
        os.write(name.getBytes());

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
