package Day112;

import java.util.Random;

public class RandomClassTest {
    public static void main(String[] args) {
        int mathran = (int)(Math.random() * 100)+1;
        System.out.println("Math.random() 정수 : " + mathran);
        //1 ~ 100 사이의 난수
//        Random ran0 = new Random();
//        System.out.println("Random 정수 : " + (ran0.nextInt(100)+1)); //1부터 시작
//        System.out.println("Random 실수 : " + ran0.nextDouble(100.0));

        Random ran1 = new Random();
        for (int i = 0; i <= 5; i++) {
            System.out.println("Random 정수 : " + ran1.nextInt(100));
        }
        System.out.println("================================================");
        Random ran2= new Random(2); //시드값을 설정시 값을 고정할 수 있음.(2개 실험)
        for (int i = 0; i <= 5; i++) {
            System.out.println("Random 정수 : " + ran2.nextInt(100));
        }
    }
}