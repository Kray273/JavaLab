package Day108;
// 자바 자동 포함 - 생성자, 상속
// java.lang.Object 클래스 라이브러리가 있다.
// java.lang.Object 클래스 변수나 메소드 자바 모든 클래스 자동포함 사용 가능
class Employee/* extends java.lang.Object*/ { //사원
    int id;
    String name;
    String dept ="개발팀";
    double salary;
    String title ="사원_부모클래스";
    void calcSalary(int salary) {
        this.salary = salary * 2;
    }
   /*Default*/ void printAll(){
        System.out.printf("사번 : %d, 이름 : %s, 부서명 : %s, 급여 : %.2f.\n", id,name,dept,salary);
    }
}

class Manager extends Employee{ //관리직 사원_ 관리직 사원은 사원 '이다'_ 상속관계
    public Manager(int id, String name, String dept, String job) {
        super.id =id; // 상속의 변수도 동일하기에 의미는 같다.
        super.name = name;
        this.dept = dept;
        this.job = job;
    }
    String title ="관리직_자식클래스";
    void test() { //상속 X, override X, 현재 추가 매서드
        String title = "test매소드 내부";
        System.out.println(title); //지역 변수
        System.out.println(this.title); //본인 클래스내 맴버변수.
        System.out.println(super.title); //상속 부모의 객체 변수
    }
    String job;
    //clacSalary, printAll 매서드 Employee 정의한대호 상속 받아 사용.
    //매서드의 내용이 수정 필요하다면.
    // 상속 후에 하위클래스에서 매소드 내용 재정의 - 매소드 overrideing
    @Override //@엣사인 자바 컴파일러 알려주는 주석문!
    protected void printAll(){ //매서드 명과 매개변수가 동일해야함.
        super.printAll();//부모의 오버라이드된 매서드를 호출
        //System.out.printf("사번 : %d, 이름 : %s, 부서명 : %s, 급여 : %.2f, 관리직종 : %s\n", id,name,dept,salary, job);
        System.out.printf("관리직종 : %s\n",job); //지워진 내용은 부모클래스에서 출력
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
        Manager m = new Manager(100,"깁갑수","영업부","영업관리");
        /*m.id = 100; //상속
        m.name = "깁갑수";//상속
        m.dept = "영업부";//상속
        m.job = "영업관리";//자식*/
        //System.out.printf("사번 : %d, 이름 : %s, 부서명 : %s, 관리직종 : %s.\n", m.id, m.name, m.dept, m.job);
        m.calcSalary(50000);//상속 받은 그대로.
        m.printAll(); //상속받아 매서드 재정의 = 'override'
        m.test();
        //Employee 상속 매서드 호출
        //super.printAll(); //error extends받은 클래스가 없어서 java.lang.Object를 호출.
        // java.lang.Object에는 printAll()은 없다.

    }//main(args)
} // end of class ManagerTest
