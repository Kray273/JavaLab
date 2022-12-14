package Day110.innerclass;

//class Ano {
//    interface I1{
//        void m1();
//    } //내부 인터페이스
//    interface I2{
//        void m2();
//    } //내부 인터페이스

interface I1{
    void m1();
}
interface I2{
    void m2();
}

public class AnonymousTest {
    public static void main(String[] args) {
        //Ano a = new Ano();
        //a.new I1(); //생성불가. 내부클래스는 외부클래스 안에서 객체를 생성하면 접근이 가능하지만
        // 인터페이스의 특성인 객체생성이 불가능 함으로 error

        I1 i1 = new I1(){ //I1 인테페이스 상속 무명 클래스 정의 + 객체 생성문장.
            //이름이 없다보니. 지역변수처럼 사용한다.
            public void m1(){ //m1매서드 오버라이딩
                System.out.println("m1 호출");
            } //m1 매서드
        };//new I1()
        i1.m1();

    }//main
}//class AnonymousTest
