package Day116;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPSender {
    public static void main(String[] args) throws Exception {
////////////////////////////////////////////////////////////////
        // 포트 생산
        DatagramSocket ds = new DatagramSocket(); //랜덤 포트
        System.out.println("[발신자 : 발신 시작]");
////////////////////////////////////////////////////////////////
        //자료 송신
        String data = "지금 몇시에요?";
        byte[] by = data.getBytes();
        DatagramPacket dp = new DatagramPacket(by,by.length, new InetSocketAddress("127.0.0.1", 15000));//"127.0.0.1" = localhost
        ds.send(dp);
        System.out.println("[발신자 : 발신 처리]");
////////////////////////////////////////////////////////////////
        //응답 수신
        byte[] b = new byte[1000]; //수신받은 내용 저장 배열
        DatagramPacket receiveDp = new DatagramPacket(b, b.length);
        ds.receive(receiveDp);
        String contents = new String(b);
        System.out.printf("전달 받은 시간 : %s\n",contents.trim());
        System.out.println("[발신자 : 수신 처리]");
////////////////////////////////////////////////////////////////
        //종료
        ds.close();
        System.out.println("[발신자 : 발신 종료]");
    }
}
