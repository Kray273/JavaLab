package Day112;

public class WrapperTest {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(Integer.toBinaryString(i));//2진수로 변환, returnType String
        System.out.println(Integer.toOctalString(i));//8진수로 변환
        System.out.println(Integer.toHexString(i));//16진수로 변환

        //기본적인 선언
        Integer in = new Integer(10);//Integer의 다양한 매서드를 사용하기 위해 객체 생성
        int i1 = 10; //10정수 , 연산자만 이용.

        // jdk 1.5 추가 : autoBoxing / auto Unboxing : 기본형 변수와 객체 변수의 차이를 같게 취급하겠다.
        int i2 = new Integer(10);
        Integer in2 = 10; //위 코드와 동일한 의미.

        // jdk 1.9 추가 Integer생성자 사용자제 권고. 그래서 Interger에 밑줄이 계속 있음.
        int i3 = 10;
        Integer in3 = 10;

    }
}
