package Day110.innerclass;
class Outer3{
    void test(){
        class Inner3 { // 지역변수 취급 내부클래스
            int j = 20;
            void mi(){
                System.out.println(j);
            }
        }//Inner
        new Inner3().mi(); //main애서는 지역변수취급된 클래스 접근불가 따라서 새로 객체를 생성해줘야함.
    }
}//Outer

public class InnerClassTest3 {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        o.test(); //30
    }//main
}//class InnerClassTest
