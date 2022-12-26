package Day116;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
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
            FileReader fr = new FileReader("C:\\sba\\Workspace\\JavaLab\\Java\\Product.txt");
            BufferedReader reader = new BufferedReader(fr);
            String compare;
            String response = null;
            while((compare = reader.readLine())!= null) {
                if(compare.contains(name)) {
                    Scanner sc2 = new Scanner(compare);
                    while(sc2.hasNextLine()) {
                        response = sc2.nextLine();
                    }
                    sc2.close();
                }
            }

            if(response == null) response = "해당하는 내용이 없습니다.\n";
            OutputStream os = s.getOutputStream();
            byte[] responseBytes = response.getBytes();
            os.write(responseBytes);

            reader.close();
////////////////////////////////////////////////////////////////////////////////////////
            s.close();//연결해제
        }
    }
}
