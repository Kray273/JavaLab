package Day111;

class Test2{
    void m1(int i) throws NumberFormatException{
        // i 소수인지 판단
        // 소수 - 1 과 자신으로만 나누어지는 자연수
        // 1 - 자신수 나머지 0 경우 2개 소수
        if( i<0){ //예외발생 조건식 필요!
            throw new NumberFormatException("자연수만가능합니다.(음수는 안됩니다.)");
            //예외 강제 발생 아래문장 실행 안된.
            // 예외 처리를 해줘야함.
            // NumberFormatException은 매개변수로 String받는데 예외 발생시 String을 return한다.
        }
        int count = 0;
        for (int index = 1; index <= i ; index++) {
            if ( i % index == 0)  count++;
        }
        if ( count == 2){
            System.out.println(i+"는 소수이다.");
        }else {
            System.out.println(i+"는 소수아니다.");
        }
    }
}
public class ThrowTest {
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        try {
            t2.m1(-13); // 음수. 예외발생 -try 중단 catch이동
            t2.m1(77);
            t2.m1(13);
        } catch (NumberFormatException e) {
            System.out.println("음수, "+ e.getMessage());
        }
    }
}
