package Day4;

//n까지 합계 과정까지 출력


import java.util.*;
public class Day4_7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("how : ");
        int input = stdIn.nextInt();

        System.out.printf("N is %d %n", input);
        
        int sum = 0;
        for(int i=1; i<input; i++) {
            System.out.print(i + "+");
            sum += i;
        }
        System.out.print(input +  " = ");
        sum += input;
        System.out.println(sum);

    }    
}
