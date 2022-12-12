package Day108;
class A {
    int i;
    A(String a) { // A class constructor
        //super();자동정의 Object() 생성자 자동호출
      i = 10;
        System.out.println("A 생성자 호출");
    }
}//class A
class B extends A {
    int j;
    B() {// B class constructor
        super("test"); //A()생성자 호출 매개변수 보냄.
        j = 20;
        System.out.println("B 생성자 호출");
    }
}
public class SuperTest {
    public static void main(String[] args) {
        // 자식클래스 객체 생성 = 자식 클래스 변수와 메소드 메모리 할당
        // 부모클래스 객체 생성 = 부모 클래스 변수와 매소드 메모맇 할당
        B b1 = new B();
        // 자식 클래새스 객체 생성 시점 부모클래스 객체 "자동"생성
        // = 자식 변수 + 메소드 + 부모변수 + 매소드
        // 클래스 생성자 첫문장 super(); 자동정의
            // 1. 부모 클래스 생성자 먼저 호출
            // 2. 부모 객체 먼저 호출
            // 3. 기본 생성자 호출
            // 4. 자동호출

        System.out.println(b1.i);
        System.out.println(b1.j);
    }//main(args)
}//class SuperTest
