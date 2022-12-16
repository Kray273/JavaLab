package Day111;

import java.io.FileNotFoundException;
import java.io.FileReader;

class Test{
    void m1 (int i) throws ArithmeticException, FileNotFoundException {
        //ArithmeticException - 반드시 처리구문 존재 X
        System.out.println(10/i);

        // FileNotFoundException - 반드시 처리구문.
        FileReader ft = new FileReader("none.txt");//"none.txt" file없음.
    }

    void m2(){
        try {
            m1(0); //0을 전달
        } catch (ArithmeticException e){
            try {
                m1(10); //10을 전달할 시 다시 FileNotFoundException이 발생할 수 있음.
            } catch (FileNotFoundException e2){
                System.out.println("파일을 찾지 못하였습니다.");
            }
        } catch (FileNotFoundException e){
            System.out.println("파일을 찾지 못하였습니다.");
        }
    }

    void m3() throws FileNotFoundException{
        m1(10);
    }
}
public class ThrowsTest {
    public static void main(String[] args) throws FileNotFoundException{
        //throws Exception은 main을 호출한 자바 시스템으로 전달
        // 자바 시스템 기본 예외처리기 동작 - 예외메시지 출력
        Test test = new Test();
        test.m2(); //catch의 10을 전달 받아 1 출력
        test.m3();
    } //main
} // ThrowsTest