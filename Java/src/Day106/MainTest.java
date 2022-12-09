package Day106;

import java.sql.SQLOutput;

public class MainTest {
    public static void main(String[] args) {
        // alt + shift + f10 에서 Edit Config... build and run에 (100 45 인재개발부 사원) 매개변수 입력
        System.out.println("입력한 변수의 갯수 = " + args.length);
        System.out.println("입력한 내용은 다음과 같습니다.");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("==============");
        //입력변수 갯수 +1 크기를 가진 배열 생성
        String userarray[] = new String[args.length+1];

        for(int i =0; i < args.length; i++) {
            userarray[i] = args[i]; // 입력받은 변수 복사
            System.out.println(userarray[i]);
            //null
        }
        System.out.println("==============");
        userarray[args.length] = "내가 추가한 문자열";
        for (int i = 0; i < userarray.length; i++) {
            System.out.println(userarray[i]);
        }
        System.out.println("==============");
        //100 45 2개 입력 덧샘
        System.out.println(args[0] + args[1]); // 10045출력 문자열 임으로!
        //매개변수에 대해서는 즉각적인 형변환이 어려움. String으로 메인에서 고정됨.
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1])); //145
        // Integer.parseInt(String)은 int로 변경시킴
        // Double.parseDouble(String)은 Double로 변경시킴_실수모양의 문자열이여야함.

    }//main
}//end class MainTest
