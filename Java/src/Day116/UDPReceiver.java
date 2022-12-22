package Day116;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDPReceiver {
    public static void main(String[] args) throws Exception {
////////////////////////////////////////////////////////////////
        // 포트 생산
        DatagramSocket ds = new DatagramSocket(15000);
        System.out.println("[수신자 : 수신 시작]");
////////////////////////////////////////////////////////////////
        //자료 수신
        byte[] by = new byte[1000]; //수신받은 내용 저장 배열
        DatagramPacket dp = new DatagramPacket(by, by.length);
        ds.receive(dp);
        String contents = new String(by);//byte[]의 내용을 String으로 케스팅
        // 한글 영문 숫자 --> 1문자 2 바이트
        // getBytes() -> 영문 숫자 특수문자 - 1바이트, 한글 - 3바이트
        System.out.printf("발신자 주소 : %s, 포트번호 : %s, 내용 : %s\n",dp.getAddress(),dp.getPort(),contents.trim());
        System.out.println("[수신자 : 수신 처리]");
////////////////////////////////////////////////////////////////
        // 답장 송신
        String time = new SimpleDateFormat("HH시 mm분 ss초").format(new Date());
        DatagramPacket timedp = new DatagramPacket(time.getBytes(), time.getBytes().length, new InetSocketAddress(dp.getAddress(), dp.getPort()));
        ds.send(timedp);
        System.out.println("[수신자 : 응답 처리]");
////////////////////////////////////////////////////////////////
        //종료
        ds.close();
        System.out.println("[수신자 : 수신 종료]");
    }
}
