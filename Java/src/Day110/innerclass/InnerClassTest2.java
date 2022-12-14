package Day110.innerclass;
/* public / final 사용가능 */
class Outer2{
    static int i = 10;

    void mo(){
        System.out.println(i + new Inner2().j);
    }

    /*public / protected/ private / static / final 를 붙일 수 있음.
    * inner class는 맴버변수 취급하기에! */
    static class Inner2 {
        static int j = 20;
        static void mi(){
            System.out.println(i - j); //static 내부클래스 매소드는 외부클래스의 static요소만 접근가능!

        }
    }//Inner

}//Outer

public class InnerClassTest2 {
    public static void main(String[] args) {
        Outer2.Inner2.mi(); //객체 생성 없이 사용가능 -10
    }//main
}//class InnerClassTest
