package Day108;
// 자바 자동 포함 - 생성자, 상속
// java.lang.Object 클래스 라이브러리가 있다.
// java.lang.Object 클래스 변수나 메소드 자바 모든 클래스 자동포함 사용 가능
class Employee/* extends java.lang.Object*/ { //사원
    int id;
    String name;
    String dept ="개발팀";
    double salary;

    void calcSalary(int salary) {
        this.salary = salary * 2;
    }
    void printAll(){
        System.out.printf("사번 : %d, 이름 : %s, 부서명 : %s, 급여 : %.2f.\n", id,name,dept,salary);
    }
}

class Manager extends Employee{ //관리직 사원_ 관리직 사원은 사원 '이다'_ 상속관계
    String job;
    //clacSalary, printAll 매서드 Employee 정의한대호 상속 받아 사용.
    //매서드의 내용이 수정 필요하다면.
    // 상속 후에 하위클래스에서 매소드 내용 재정의 - 매소드 overrideing
    @Override //@엣사인 자바 컴파일러 알려주는 주석문!
    void printAll(){ //매서드 명과 매개변수가 동일해야함.
        System.out.printf("사번 : %d, 이름 : %s, 부서명 : %s, 급여 : %.2f, 관리직종 : %s\n", id,name,dept,salary, job);
    }
}
/*
class A {
    int i = 10;
}
class B {
    int i = 20;
}
class C extends A,B {// 2개 이상 클래스 동시 상속 기능을 가정시
    int k = 30;
    // i가 2개?? 누구를 실행해야 할까?
}
    인터페이스 - 클래스의 돌연변이로 다중 상속을 가능하게 함.
*/
public class ManagerTest {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.id = 100; //상속
        m.name = "깁갑수";//상속
        m.dept = "영업부";//상속
        m.job = "영업관리";//자식
        //System.out.printf("사번 : %d, 이름 : %s, 부서명 : %s, 관리직종 : %s.\n", m.id, m.name, m.dept, m.job);
        m.calcSalary(50000);//상속 받은 그대로.
        m.printAll(); //상속받아 매서드 재정의 = 'override'

    }//main(args)
} // end of class ManagerTest
