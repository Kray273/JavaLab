package Day106;

public class ForTest {
    public static void main(String[] args) {
        char star = '*';
        // 1 ~ 20 난수 발생 한줄에 반복할 수 있는 별의 갯수
        int count = (int)(Math.random() * 20) +1;

        // 1 ~ 5 난수 발생, 별을 출력할 줄 수
        int lines = (int)(Math.random() * 5) +1;

        /*
        System.out.println(count + "개 별을 " + lines+ "줄로 출력");
                for (int j = 1; j <= lines; j++){
            for (int i = 1; i <= count; i++) {
                System.out.print(star);
            }//in for
            System.out.println();
        }//out for
        */

        System.out.println("count : " + count +  ",line : " + lines);
        for (int j = 1; j <= lines; j++){
            for (int i = 1; i <= j; i++) {
                System.out.print(star);
            }//in for
            System.out.println();
        }//out for


    }//main
}//ForTest
