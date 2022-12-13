package Day109;

class Employee{
    Employee[] employees; //Employee 배열
    int id; //사번
    String name; // 이름
    int sal; // 본봉
    int fee; // 일반 수당
    int totalSal; // 총급여
    Employee(int id, String name, int sal, int fee){ //매개변수를 받을 생성자 재정의
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.fee = fee;
    }
    void calcSalary(){ //총급여 계산 매서드
        this.totalSal = fee + sal;
    }
}//class Employee

class Manager extends Employee{
    int manFee; // 간부수당
    Manager(int id, String name, int sal, int fee, int manFee){
        super(id, name, sal, fee);
        /* super(id, name, sal, fee) 하나로 아래의 코드 작성 불필요
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.fee = fee;*/
        this.manFee = manFee;
    }
    @Override
    void calcSalary(){
        super.calcSalary(); //동일한 기능을 super를 통해 호출
        totalSal += manFee;
    }
}//class Manager

class Engineer extends Employee{
    int enFee;
    int skFee;
    Engineer(int id, String name, int sal, int fee, int enFee,int skFee){
        super(id, name, sal, fee);
        this.enFee = enFee;
        this.skFee = skFee;
    }
    @Override
    void calcSalary() {
        super.calcSalary();
        totalSal += enFee + skFee;
    }
}//class Manager

class Secretary extends Employee{
    int stFee;
    Secretary(int id, String name, int sal, int fee, int stFee){
        super(id, name, sal, fee);
        this.stFee = stFee;
    }
    @Override
    void calcSalary() {
        super.calcSalary();
        totalSal += stFee;
    }
}//class Manager
public class SalaryTest {
    public static void main(String[] args) {
        Employee[] e = new Employee[4];
        e[0] = new Employee(1000, "이사원",10000,5000);
        e[1] = new Manager(2000, "김갑부",20000,10000, 10000);
        e[2] = new Engineer(3000, "박슬기",15000,7500,5000,5000);
        e[3] = new Secretary(4000, "최비서",15000,7000,10000);

        System.out.println("사번 : 이름   : 본봉  : 총급여");
        for(int i=0; i<e.length; i++) {
            e[i].calcSalary();
            System.out.printf("%d : %s : %d : %d",e[i].id,e[i].name,e[i].sal,e[i].totalSal);
            if(e[i] instanceof Engineer){
                System.out.printf("\t기술수당 : %d : 자격수당 : %d",((Engineer) e[i]).enFee,((Engineer) e[i]).skFee);
            }
            System.out.println();
        }
    }//main
}//SalaryTest
