package Day4;
//세자리 정수값 출력
//돌아가는거 

import java.util.*;
public class Day4_22 {
    public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
   
     while(true) {
        System.out.println("number:");
        int input = stdIn.nextInt();
        
        if( !(100 > input || input > 999)){
            System.out.printf("true input number is %d%n", input);
            break;
        } else{
            System.out.printf("false input number is %d%n", input);
        }

    
    }



}
    
}
