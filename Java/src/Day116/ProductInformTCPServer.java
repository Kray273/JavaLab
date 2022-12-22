package Day116;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ProductInformTCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(12000); //소캣 객체 생성
        System.out.println("[서버는 12000번 포트에서 대기중 입니다.]");
        while (true){
            Socket s = ss.accept();
            String clientIp = s.getInetAddress().getHostAddress();
            System.out.println("[서버는 " + clientIp + " 클라이언트의 접속을 허용합니다.]");
////////////////////////////////////////////////////////////////////////////////////////
            //클라이언트의 요청을 수락 = 입력스트림
            InputStream is = s.getInputStream();
            Scanner sc = new Scanner(is);
            String name = sc.next();
            System.out.printf("[서버는 클라이언트로 부터 '%s'요청을 전달받아 Product.txt에서 일치하는 결과가 있는지 확인합니다.]\n",name);

////////////////////////////////////////////////////////////////////////////////////////
            //클라이언트 요청 - 처리 응답 = 출력 스트림
            Scanner reader = new Scanner(new File("Product.txt"));
            String result = null;
            while (reader.hasNext()){
                if (reader.next().contains(name)){
                    result = reader.next();
                    break;
                }
            }

            reader.close();

            String response;
            if(result != null){
                response = "해당하는 내용이 있습니다.\n"+result;
            }else{
                response = "해당하는 내용이 없습니다.\n";
            }
            OutputStream os = s.getOutputStream();
            byte[] responseBytes = response.getBytes();
            os.write(responseBytes);

////////////////////////////////////////////////////////////////////////////////////////
            s.close();//연결해제
        }
    }
}
