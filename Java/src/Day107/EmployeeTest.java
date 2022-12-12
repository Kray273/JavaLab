package Day107;
//규칙 !! 자바 클래스명 = 자바파일명
// 예외의 경우 : public 키워드 1개의 main 클래스에만 선언.(main이 있는 class는 파일명과 동일!)

/*
class Employee{ //Employee instance의 틀인 class정의
    //회사원 변수(5개) + 매소드
    int id;
    String name;
    String title;
    String dept;
    double salary;

}
*/
class Employee{
    int id;
    String name;
    String title;
    String dept;
    double salary;
    void printInform(String name){
        int id = 1000;
        System.out.printf("사번 : %d, 이름 : %s, 직급 : %s, 부서명 : %s, 급여 : %.2f입니다.\n",
                + id, name, this.title, dept, salary);
        //this는 원하는 변수의 위치를 찾아가는 것으로
            // this.id가 되면 객체변수 id
             // id가 되면 지역변수 id
        // 매개변수에 대해서
            // this.mame 이되면 객체변수 name
            // name이 되면, 매개변수 name
    }

}

public class EmployeeTest {
    //변수들
    //메소드

    //자바 어플리케이션 클래스(특정기능부여)- "대장"은 main!!
    public static void main(String[] args) {

        Employee e1 = new Employee(); //class는 내가 정한 참조 자료형. 사용을 원할 시 new로 메모리 할당해야함.
        System.out.println(e1.name); //null e1은 정의되지 않아서!

        // Employee class로 만든 instance에 데이터 할당
        e1.id = 100; //객체주소 참조변수명, 객체변수명
        e1.name = "이사원";
        e1.title = "사원";
        e1.dept = "IT개발";
        e1.salary = 10000;

        /*System.out.printf("사번 : %d, 이름 : %s, 직급 : %s, 부서명 : %s, 급여 : %.2f입니다.\n",
                + e1.id,e1.name,e1.title,e1.dept,e1.salary);*/
        e1.printInform("전달");

        Employee e2 = new Employee(); //객체는 원하는 만큼 instance를 생성할 수 있다.
        e2.id = 200;
        e2.name = "대리박";
        e2.title = "대리";
        e2.dept = "전략실";
        e2.salary = 20000;

 /*       System.out.printf("사번 : %d, 이름 : %s, 직급 : %s, 부서명 : %s, 급여 : %.2f입니다.\n",
                + e2.id,e2.name,e2.title,e2.dept,e2.salary);
*/          e2.printInform("전달");

    }//main(args)
}//EmployeeTest
