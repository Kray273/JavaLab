package Day109;
//import static java.lang.Math; //Math변수와 매소드 사용허락
import static java.lang.Math.*; // Math static 변수와 매소드 사용 허락

public class StaticImportTest {
    public static void main(String[] args) {
        //int ran = (int)(Math.random()* 100)+1; // 1~100난수 발생
        int ran = (int)(random()* 100)+1; // import를 통해 Math.를 생략
        System.out.println(ran);

    } // main(String[] args)
} // end StaticImportTest
