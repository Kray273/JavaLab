package Day116;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ProductTCPClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",12000);
        System.out.println("==클라이언트가 서버로 접속했습니다.==");
        String serverIp = s.getInetAddress().getHostAddress();
        System.out.println("==클라이언트가 " + serverIp + " 서버로 접속 했습니다.==");

////////////////////////////////////////////////////////////////////////////////////////
        //게시물을 요청 = 출력스트림
        Scanner sc = new Scanner(System.in);
        System.out.println("상품을 추가합니다.");
        System.out.print("상품명 : ");
        String name = sc.next();
        System.out.print("가격 : ");
        String price = sc.next();
        System.out.print("재고량 : ");
        String stock = sc.next();

        OutputStream os = s.getOutputStream();
        //방법 1.
            //String request = "상품명 :"+name+ ", 가격 :"+price+", 재고량 :"+stock+"\n";
            //byte[] bytes = request.getBytes();
            //os.write(bytes);

        //방법 2.
        name = name + " ";
        price = price + " ";
        stock = stock + " ";
        os.write(name.getBytes());
        os.write(price.getBytes());
        os.write(stock.getBytes());
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
