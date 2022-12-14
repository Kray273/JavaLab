package Day110;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedTest {
    public static void main(String[] args) {
        // sample.txt 입력용 사용 오픈 허락
        // java.io.FileNotFoundException발생할 것을 알려줌 - 컴파일러 경고
        // 예외처리 반드시 try-catch
        // checkedexception 종류
        // class FileNotFoundException extends Exception
        //FileReader fr = new FileReader("sample.txt"); 예외처리 필수!
        try {
            FileReader fr = new FileReader("sample.txt");
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());//getMessage는 에러의 원인을 알려줌.
        }

        // ArithmeticException 발생 - 컴파일러 경고X
        // Uncheckedexception 종류
        // class RuntimeException extends Exception
        // class ArithmeticException extends RuntimeException
        // error를 알려주지 않고 실행시 발생
        System.out.println(10/0);
    }
}
