package Day107;

/*
class Employee{ //error message 이미 같은 패키지 내에서 정의되어 있는 class 여서
    //회사원 변수(5개) + 매소드
    int id;
    String name;
    String title;
    String dept;
    double salary;
}
*/

public class EmployeeTest2 {
    public static void main(String[] args) {
        // Employee만 담는 배열 객체 생성
        Employee[] arr = new Employee[2]; //2개의 방

        Employee e1 = new Employee();
        e1.id = 100;
        e1.name = "이사원";
        e1.title = "사원";
        e1.dept = "IT개발";
        e1.salary = 10000;
        arr[0] = e1; //Employee instance를 arr에 담는다.

        Employee e2 = new Employee(); //객체는 원하는 만큼 instance를 생성할 수 있다.
        e2.id = 200;
        e2.name = "대리박";
        e2.title = "대리";
        e2.dept = "전략실";
        e2.salary = 20000;
        arr[1] = e2;

        for (int i = 0; i < arr.length; i++){
            System.out.printf("사번 : %d, 이름 : %s, 직급 : %s, 부서명 : %s, 급여 : %.2f입니다.\n",
                    + arr[i].id, arr[i].name, arr[i].title, arr[i].dept, arr[i].salary);
        }

    }//main(args)
}//EmployeeTest
