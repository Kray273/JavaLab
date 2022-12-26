package Day116;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ProductTCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(12000); //소캣 객체 생성
        System.out.println("[서버는 12000번 포트에서 대기중 입니다.]");
        int count = 0;
        while (true){
            Socket s = ss.accept();//소캣 생성 and Open
            String clientIp = s.getInetAddress().getHostAddress(); //Ip address 추출
            System.out.println("[서버는 " + clientIp + " 클라이언트의 접속을 허용합니다.]");
////////////////////////////////////////////////////////////////////////////////////////
            //클라이언트의 요청을 수락 = 입력스트림
            File file = new File("Product.txt");
            FileWriter fW = new FileWriter(file, true);
            InputStream is = s.getInputStream();
            Scanner sc = new Scanner(is);

            //방법1
                //String request = sc.nextLine();
                //fW.write(request+"\n");

            //방법 2 : 클라이언트 3개 " " = 입력스트림
                String name = sc.next();
                String price = sc.next();
                String stock = sc.next();
                fW.write(name+ " - " +  price+ " - " + stock +"\n");
                String request = name+ " - " +  price+ " - " + stock;

            fW.flush(); //버퍼를 비워준다.
            fW.close();

            System.out.printf("[서버는 클라이언트로 부터 '%s'요청을 전달받아 Product.txt에 저장하였습니다.]\n",request);

////////////////////////////////////////////////////////////////////////////////////////
            //클라이언트 요청 - 처리 응답 = 출력 스트림
            String response;
            if(count == 2){
                response = "추가 완료되었습니다. 서버를 종료합니다.\n";
            }else{
                response = "추가 완료되었습니다." + (2-count) +"번 남으셨습니다.\n";
            }
            OutputStream os = s.getOutputStream();
            byte[] responseBytes = response.getBytes();
            os.write(responseBytes);
////////////////////////////////////////////////////////////////////////////////////////
            ++count;
            s.close();//연결해제
            if (count == 3) {
                System.out.println("[서버 종료합니다.]");
                break;
            }
        }
    }
}
