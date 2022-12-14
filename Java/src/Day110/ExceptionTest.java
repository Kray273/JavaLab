package Day110;

public class ExceptionTest {
    public static void main(String[] args) {
        //예외발생x
//        int i = Integer.parseInt("100");
//        int j = Integer.parseInt("100");
//        int k = i/j; // 문제 없음. 실행

        // zero exception
//        int i = Integer.parseInt("100");
//        int j = Integer.parseInt("0");
//        int k = i/j; //java.lang.ArithmeticException 실행중단.

        // 맞지 않는 format 예외처리
        int k = 0;
        try{
            int i = Integer.parseInt("100");
            int j = Integer.parseInt("백"); //java.lang.NumberFormatException 실행중단.
            k = i/j;
        } catch(NumberFormatException e){ //예외와 일차하는 객체를 비교.
            System.out.println("예외처리");
            e.printStackTrace();//원인을 추적하는 매서드, 제일 마지막 실행.
        } catch(ArithmeticException | NullPointerException  e){ //catch문을 붙여서 예상되는 예외를 처리할 수 있다.
            // |를 이용하여 여러 종류의 예외를 처리할 수도 있다.
            System.out.println("예외처리");
        } finally{
            System.out.println("이 문장은 반시시 실행 됩니다.");
        }

        System.out.println("나누기 결과 = " + k);
        System.out.println("main 종료");
    }
}
