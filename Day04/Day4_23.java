package Day4;
//숫자 맞추기 게임

import java.util.*;
public class Day4_23 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        int no = 10 + rand.nextInt(99); //맞춰야하는 10~99난수 생성
        System.out.println("Let's start");
        System.out.println("point number 10 to 99");
        int tmp;

        do{
            System.out.println("what is number?");
            tmp = stdIn.nextInt();
            
            if(tmp > no){
                System.out.println("smaller number.");
            }else if(tmp < no){
                System.out.println("larger number.");
            }
        }while(tmp != no);
        System.out.println("good jab.");




    }
    
}
