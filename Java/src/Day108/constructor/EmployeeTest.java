package Day108.constructor;

class Employee{
    //자바 자동 포함
    Employee(int id, String name, String title, String dept, double salary){ //사용자 정의 생성자.
        //super(); 재정의시 사라짐.
        this.id =id;
        this.name = name;
        this.title = title;
        this.dept = dept;
        this.salary = salary;

        System.out.println("Employee 생성자 호출");
    }

    Employee(int id, String name){ //생성자 오버로딩
        //new Employee(id, name,"직급 미정","배치 이정",-1); 생성자를 다시 생성해서 재정의 할 수 있지만.
        // 생성자를 다시 초기화 하는 것은 원리와 맞지 않다. 따라서 다음과 같은 문법을 제공.
        this(id, name, "직급미정","배치이전",-1); //가장 처음 문장으로 사용되어야함.
        /*
        this.id =id;
        this.name = name;
        title = "직급 미정";
        dept = "배치 이정";
        salary = -1;*/
        System.out.println("2개의 정보를 가진 Employee 생성자 호출");

    }

    Employee() { //생성자 오버로딩
        this(-1, "미정","직급 미정","배치 이전",-1);
        System.out.println("아무 정보 없는 Employee 생성자 호출");
    }

    int id;
    String name;
    String title;
    String dept;
    double salary;
    void printInform(){
        System.out.printf("사번 : %d, 이름 : %s, 직급 : %s, 부서명 : %s, 급여 : %.2f입니다.\n",
                + id, name, title, dept, salary);

    }

}

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee(100,"이사원","사원","IT개발",10000); // 호출시에 생성자가 자동으로 포함되어 있기에 error가 안남.
        e1.printInform();

        Employee e2 = new Employee(200,"대리박"); //title, dept, salary 모름
        e2.printInform();

        Employee e3 = new Employee(); //아무 정보 없는 상태에서 객체 생성.
        e3.printInform();

    }//main(args)
}//EmployeeTest
