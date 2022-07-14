package Day4;

// do~while 반드시 한번을 실행 시킬 수 있다. 와일은 실행이 안될 수 있다. 

import java.util.*;
public class Day4_14 {
  public static void main(String[] args) {
    int input = 0, answer = 0;

    answer = (int) (Math.random() * 100) + 1; //1~100사이의 임의의 수 저장
    Scanner stdIn = new Scanner(System.in);

    do{
        System.out.println("input 1 to 100.>");
        input = stdIn.nextInt();

        if(input > answer) {
            System.out.println("Try to smaller number");   
        } else if( input < answer) {
            System.out.println("Try to larger number");
            }
    } while( input != answer);
    
    System.out.println("Good job");



  }  
}
