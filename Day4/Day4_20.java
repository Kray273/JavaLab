package Day4;

//다시 보기 

import java.util.*;
public class Day4_20 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
                
        outer : while(true) {
            System.out.println("(1) Square");
            System.out.println("(2) square root");
            System.out.println("(3) iog");
            System.out.print("choose you want(1~3),(done : 0) > ");         
            int input = stdIn.nextInt();
            
            if (input == 0) {
                break;
            } else if(1 <= input && input <= 3){
                int tmp;
                while(true){
                    System.out.println("input number?(done : 0, finish : 99)");
                    tmp = stdIn.nextInt();
                    
                    if(tmp == 0){
                        break;
                    } else if(tmp == 99){
                        break outer;
                    } else if( input == 1) {
                        System.out.println("result : " + (tmp * tmp)); 
                    } else if(input== 2) {
                        System.out.println("result : " + (Math.sqrt(tmp)));
                    } else if(input == 3) {
                        System.out.println("result : " + (Math.log(tmp)));
                    }     
                    }
            } else {
                System.out.println("U got the wrong number");
            }
        }
        System.out.println("finish the program.");
        }
    }
