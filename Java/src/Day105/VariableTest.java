package Day105;

public class VariableTest {
    public static void main(String[] args) {
        //정수 - 0 ~ 100
        //byte score = 100; //byte 128까지
        int score = 99;
        System.out.println(score); //100
        //score = score + 100; //error byte의 범위를 넘어선다.
        //score = score + 100;
        System.out.println(score); //200
        int score2 = 95, score3 = 60;

        //평균 : 정수타입 데이터 연산 결과 정수
        int avg = (score + score2 + score3) / 3;
        // 정수 산술연산자 정수 ==> 정수
        // 실수 산술연산자 정수 ==> 실수
        // 실수 산술연산자 실수 ==> 실수
        // 실수 평균?
        double avgDouble = ((score + score2 + score3) / 3.0);

        System.out.println("정수 평균 = " + avg);
        System.out.println("실수 평균 = " + avgDouble);
        System.out.println(Math.round(avgDouble));


        int radius = 5; //반지름
        final double pi = 3.14; //final은 상수 키워드 JS의 const
        // 진리값(원주율 etc) 표현, 여러 객체 공유값 표현, 자바 규칙
        double area = radius * radius * pi;
        radius = 10;
        //pi = pi +1; final이 붙음으로 재정의 불가
        area = radius * radius * pi;

        System.out.println(10); // 자바 int - 4byte
        System.out.println(100000000000L); // 자바 long
        System.out.println(true); // 자바 boolean literal
        System.out.println("a"); // 자바 char

        char c1 = 'a'; //char type은 ''
        String s1 = "java 프로그램"; //String type은 ""
        String s2 = "a";

        int a1 = 10;
        int b1 = 20;

        System.out.println("a1의 값 = " + a1 + ", b1의 값 = " + b1);
        //a1의 값 20 , b1의 값 10 출력
        int emp = a1;
        a1 = b1;
        b1 = emp;
        System.out.println("a1의 값 = " + a1 + ", b1의 값 = " + b1);

        //printf
        System.out.printf("%d을 표현합니다.\n", 10); //%d 정수
        System.out.printf("%f을 표현합니다.\n", 3.14); //%f 실수
        System.out.printf("%s을 표현합니다.\n", "name"); //%s 문자
        System.out.printf("%c을 표현합니다.\n", '웅'); //%c char
        String name2 = "name2";
        System.out.printf("%s을 표현합니다.\n 다음 줄에서 출력\n\n\n", name2); // 변수 삽입가능

        byte b = 127; //byte 127최대값
        // b = b+1; //컴파일 오류
        int ii = b + 1;
        byte b2 = (byte)(b + 1);
        // byte + int => int
        System.out.printf("int데이터 = %d, byte 데이터 = %d\n", ii, b2);
    }
}
