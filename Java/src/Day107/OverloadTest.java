package Day107;
class D{
    int add(int i,int j){
        return i + j;
    }
    String add(String i, String j){ //Overloding 같은 이름의 다른 리턴 타입의 기능 구현
        return i + j;
    }
    double add(double i,double j){
        return i + j;
    }
}

public class OverloadTest {
    public static void main(String[] args) {
        D d1 = new D();
        String result1 = d1.add("String", "Spring");
        double result2 = d1.add(2.5, 3.14);
        int result3 = d1.add(2,4);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println(d1.add(3.14,1)); //not-error int를 double 자동 형변환.
    }
}
