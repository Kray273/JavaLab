package Day105;

public class OperatorTest {
    public static void main(String[] args) {
        // 산술 연산자 +  -  *  /  %  ++  --
        int avgInt = 10/3; //3
        //double avgDouble = 10.0 / 3.0;
        double avgDouble = 10 / (double)3;

        System.out.printf("%d\n", avgInt);
        System.out.printf("%f\n", avgDouble);
        System.out.println("나머지 연산 : " + 10 %3); //나머지 연산

        int a = 10;
        int b = 20;
        //a = a + b - 1 * 3 / 5;
        //연산의 우선 순위? () : * / : + - : =
        // 동일한 개층에서는 왼쪽 우선

        a += b; //a = a + b; 와 동일.
        // -=  *=  /=  %=  도 가능
        /* 단항연산자(a++), 이항연산자(a+b)
        산술 연산자 : ++  --(단항)  +-*  /%(이항)
        비교 연산자 : ==  !=  >  >=  <  <=
        논리 연산자 : &&  ||  !
        대입연산자 : =  +=  -=
        조건삼항연산자 : 조건식(t/f)?ture연산결과:false연산결과
        비트연산자 : and? &, or? |, xor? ^
        자바언어에 typeof 연산자 없다.
        자바언어는 데이터타입을 변환해주는 연산자는 있다.(형변환 연산자-단항!)

        연산자의 우선 순위? () : 단항 : 이항(산술 > 비교 > 논리) : 삼항 : =
            단항 계층에서는 해당객체 기준 왼쪽부터 우선 ++i > i++
        */

        /*
        0. 형변환 연산자 형태 - (데이터타입)변수
        1. String 기본형 아니다. - 형변환연산자 사용X
        2. boolean타입 <---> ? 불가능
            int i = 0;
            boolean b = (boolean)i; ===> 오류
        3. 표현범위 작은 타입 ===> 큰 타입 변환 형변환연산자 명시하지 않아도 자동 가능
            char -> int -> long -> float -> double
            byte -> short -> int -> long -> float -> double
                byte b = 127;
                int i = b;
        4. 표현범위 작은 타입 <=== 큰 타입 변환 형변환연산자 명시해야함.
                int i = 383;
                byte b = (byte)i; //b = 127
                double d = 3.5;
                int i = (int)d; //i = 3
        */


    }
}
