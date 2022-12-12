package Day108.constructor;

public class VarInitTest {
    // 객체변수들 선언시 = '자동'초기화!
    int a;
    double b;
    String c;

    VarInitTest(int a, double b){
        this.a = a;
        this.b = b;
        //c = "생성자 초기화";
    }//VarInit
    //초기화 블록 : 여러객체 생성시 공통변수값 초기화
    { c = "생성자 초기화";}

    public static void main(String[] args) {
        //System.out.println(a); // static 매소드 안에서는 static변수만 사용가능
        VarInitTest test = new VarInitTest(10, 10.97);// 변수 초기화 객체 생성
        VarInitTest test2 = new VarInitTest(9, 9.98);// 만약 생성자마다 값이 달라지면 생성자를 이용해서 값을 변경하는 것을 추천.
        System.out.printf("a = %d, b = %.2f, c = %s\n",test.a,test.b,test.c);
        System.out.printf("a = %d, b = %.2f, c = %s\n",test2.a,test2.b,test2.c);
        //int d; // 지역변수는 자동 초기화 안됨. 사용자 초기화;
        //System.out.println("d = "+ d);//variable d might not have been initialized 지역변수는 초기화 되지 않음.
        int d = 0; // 지역변수는 초기화 해야한다.
        System.out.println("d = "+ d);

    }//main
}//class VarinitTest
