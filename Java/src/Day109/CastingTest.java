package Day109;
class Parent {
    int su = 10;
    void print(){
        System.out.println("Parent : " + su);
    }
    void mp(){
        System.out.println("Parent Class" ); // non-override매소드

    }
}//class Parent

class Child1 extends Parent {
    //int su = 10; 상속으로 인해 가지고 있음.
    int su = 20;
    void print(){
        System.out.println("Child1 : " + su); // 오버라이딩 된 매서드
    }
    void mc(){
        System.out.println("Child1 Class" ); // 자식만의 매서드
    }
}

class Child2 extends Parent {
    int su = 30;
    void print(){
        System.out.println("Child2 : " + (super.su + su));
    }
    void mc2(){
        System.out.println("Child2 Class" ); // 자식만의 매서드
    }
}
public class CastingTest {
    public static void main(String[] args) {
        Parent p1 = new Parent(); //형변환 발생 X
        System.out.println("p1 : " + p1.su);
        p1.print();
        p1.mp();
        //p1.mc(); //error 자식의 매서드는 할당 되지 않음.
        Child1 c1 = new Child1(); //형변환 발생 X
        System.out.println("c1 : " +c1.su);
        c1.print();
        c1.mp();
        c1.mc();
        Parent p2 = new Child1(); //자동형변환 발생
        System.out.println("p2 : " + p2.su); //사용변수 - Parent
        p2.print(); //override매소드 -child1
        p2.mp(); // 사용 메서드 - Parent
        //p2.mc();//error 메모리에는 할달 되어 있지만 접근 불가.
        //mc() 원래 자식 매서드 포함 매서드
        //Child c2 = (Child) p2;
        //c2.mc();
        if(p2 instanceof Child1){
            ((Child1) p2).mc(); // 한문장으로 정리
        } else {
            System.out.println("p2 Child1 타입 변경 불가");
        }
        Parent p3 = new Child2();   // 자동 형변환 발생
        System.out.println(p3.su); //사용변수 -Parent
        p3.print(); //오버라이딩 매소드 - child2
        //((Child1)p3).mc(); // compile오류X, 실행오류 "main"
        if(p3 instanceof Child2){
            ((Child2)p3).mc2();
        } else {
            System.out.println("p3 Child1 타입 변경 불가");
        }
        //instanceof - t or f

    } //main method
}//CastingTest
