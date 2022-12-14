package Day110.innerclass;
class Outer{
    int i = 10; //맴버변수

    class Inner { //멤버변수 유사 취급
        int j = 20;
        void mi(){
            System.out.println(i - j);
            //내부 클래스에서는 외부클래스의 요소 접근 가능
        }
    }//Inner

    void mo(){
        //System.out.println(i+j); error j의 접근 불가
        //외부클래스의 매서드는 내부클래스 요소에 접근 불가
        System.out.println(i + new Inner().j);
    }
}//Outer

public class InnerClassTest {
    public static void main(String[] args) {
        //Inner i = new Inner(); //객체 생성 불가!
        //Outer.Inner inner = new Outer().new Inner();
        //System.out.println(new Outer().i); //10
        Outer o =  new Outer();
        Outer.Inner inner = o.new Inner(); // Outer클래스 .을 통해 접근 가능
        System.out.println(o.i); //10
        System.out.println(inner.j); //20
    }//main
}//class InnerClassTest
