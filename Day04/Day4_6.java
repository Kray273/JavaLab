package Day4;
//1부터 n까지의 합

import java.util.*;
public class Day4_6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("how : ");
        int input = stdIn.nextInt();

        System.out.printf("No.%d %n", input);
        
        int sum = 0;
        for(int i=input; i>=1; i--) {
            sum += i;
        }
        System.out.printf("The sum of 1 to n is %d%n", sum);

    


    }
    
}
