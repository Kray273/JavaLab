package Day107;
class A {
    int i; // 클래스 내부 변수 = member variable = 프로퍼티
    public void test() { //JS의 function(){}
        int j = 20; //test 매서의 지역변수 local variable
        System.out.println(j);
    } // test()

}//class A

public class MemberLocalTest {
    public static void main(String[] args) {
        A a1 = new A(); //A 객체(instance) 생성
        System.out.println(a1.i); //0출력. A클래스에 설정한 i는 초기화 값이 저장
        a1.test(); //20 출력. test()에 기능
        //a1.j = 200; //error j변수는 찾을 수 없다. test의 지역변수로 설정되어 있다.
        //a1.test().j = 200 매서드 블럭 내부의 지역변수는 접근이 불가
    }//main
}//class MemberLocalTest
