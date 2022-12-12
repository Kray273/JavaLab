package Day108.Academy; // B클래스 저장 폴더 설정(첫문장!!)

import Day108.sba.A; //A클래스 패키지명 알려줌

import java.util.*; //java.util의 모든 패키지 사용!
/* 1. B클래스 같은 패키지 속한 클래스 자동 import
   2. java.lang.패키지 속한 클래스 자동 import
* */

public class B {
    public static void main(String[] args) {
        //Day108.sba.A a1 = new Day108.sba.A();
        //다른 패키지 명을 앞에 붙이면 다른 패키지의 클래스를 호출한다.
        A a1 = new A(); // import 되어 있어 호출가능
        Date date = new Date();
        HashSet set = new HashSet();//?
    }
}
