package Day112;

import java.util.ArrayList;

class Employee{
    //toString, equals - 상속 그대로.
    // toString의 결과 : 패키지명.클래스@16진수주소값
    int id;
    String name;
    double pay;

    public Employee(int id, String name, double pay) {
        this.id = id;
        this.name = name;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "{" + id + " - " + name + " - " + pay + '}';
    }
}
public class ArryListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(5);
        list.add("java");
        list.add(10);
        list.add(3.14);
        Employee e1 = new Employee(100, "가보자고",1000000);
        Employee e2 = new Employee(200, "보자고가",2000000);
        Employee e3 = new Employee(300, "자고가보",3000000);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        System.out.println(list.size());

        for(Object o : list) {
            System.out.println(o.getClass().getName() + ":" + o);
            //Objecttype이지만 aotuboxing으로 인해 알맞은 타입이 출력
            //id - name - pay형식 출력 toString오버라이딩 필요
        }
    }
}
