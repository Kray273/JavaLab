package Day116;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {
    public static void main(String[] args) {
        // windows ipconfig
        try {
            InetAddress[] iparr = InetAddress.getAllByName("www.naver.com"); //한개 도메인의 IP주소를 배열로 리턴
            for (InetAddress ip : iparr) {
                System.out.println("도메인 명 : " + ip.getHostName() + " ,IP주소 : " + ip.getHostAddress());
            }
        } catch (UnknownHostException e){
            e.printStackTrace();//원인 출력
        }
        System.out.println("================================================================");
        //내 컴퓨터
        try {
            InetAddress myIP = InetAddress.getLocalHost(); //내 IP주소를 한개의 객체로 리턴
            System.out.println("도메인 명 : " + myIP.getHostName() + " ,IP주소 : " + myIP.getHostAddress());
        } catch (UnknownHostException e){
            e.printStackTrace();//원인 출력
        }

    }
}
