package Day4;


// 합계를 구할 숫자를 입력 받아 0이 나오면 끝

import java.util.*;
public class Day4_13 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("input(if you done input 0) : ");
        
        int num;
        int sum = 0;
        while(true) {
            System.out.print(">>");
            num = stdIn.nextInt();
            if(num != 0){
                sum += num;  //입력받은거 누적   
            }else{ //0을 일력한경우
                break;
            }                
        }
        System.out.println(sum);

    }
    
    }
