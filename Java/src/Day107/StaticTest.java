package Day107;
class Person {
    String name;
    int age;
    static String nation = "한국"; //Person 객체 공유. 1개 메모리 할당. 모든 객체 공통값
}

// run -> 오류검사 -> static 할당 -> main실행 -> 객체 생성
public class StaticTest {
    public static void main(String[] args) {
        System.out.println("모든 사람들의 국적은 " + Person.nation +"입니다."); //new를 하지않아도 static은 사용가능
        //System.out.println("모든 사람들의 국적은 " + p1.nation +"입니다."); //error p1변수는 선언 전!
        Person p1 = new Person();
        p1.name = "고길동";
        p1.age = 29;
        //p1.nation = "한국"; static변수로 불필요, 고정값.
        System.out.println(p1.name + " : " + p1.age + " : " + p1.nation);

        Person p2 = new Person();
        p2.name = "이지금";
        p2.age = 30;
        System.out.println(p2.name + " : " + p2.age + " : " + p2.nation);

    }   //main method
}//class StaticTest
