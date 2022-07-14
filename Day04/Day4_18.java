package Day4;

//반복구문
import java.util.*;
public class Day4_18 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
                
        while(true) {
            System.out.println("(1) Square");
            System.out.println("(2) square root");
            System.out.println("(3) iog");
            System.out.print("choose you want(1~3),(done : 0) > ");         
            int input = stdIn.nextInt();

            
            if (input == 0) {
                break;
            } else if(1 <= input && input <= 3){
                System.out.printf("you choosed number %d\n", input);
            } else {
                System.out.println("U got the wrong number");
            }
            
            
        }

        System.out.println("finish the program.");




    }
    
}
