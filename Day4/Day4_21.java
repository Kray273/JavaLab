package Day4;

import java.util.*;
public class Day4_21 {
    public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    while(true) {
        System.out.println("number:");
        int input = stdIn.nextInt();
        if(input > 0 ){
        System.out.printf("number : %d\n", input);
        System.out.println("This number is positive ");
        } else if( input < 0 ){
            System.out.printf("number : %d\n", input);
            System.out.println("This number is nagative ");
        } else{
                System.out.println("This number is 0 ");
            }


            System.out.println("retry ? Y:1 N: 0");
            int tmp;
            tmp = stdIn.nextInt();
            if(tmp == 0) {
                break;
            }
            
        }

    }
    }
