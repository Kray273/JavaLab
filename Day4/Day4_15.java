package Day4;

// 3,6,9 게임

public class Day4_15 {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            System.out.printf("i=%d ", i);

            int tmp = i;

            do{ //tmp%10이 3의 배수인지 확인(0제외)
                if (tmp%10%3==0 && tmp%10!=0) {
                    System.out.print("clap"); //tmp /= 10은 tmp =tmp /10과 동일
                } 

            }while((tmp/=10) != 0);
            System.out.println( );




        }
    }
    
}