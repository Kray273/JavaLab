import java.util.Scanner;
//���ϴ� ���ڸ�ŭ �� ������ �ϱ�
public class Day3_7 {
public static void main(String[] args) {
  Scanner stdIn = new Scanner(System.in);
  System.out.println("tell me What you wnat lines : ");
  int input = stdIn.nextInt();  

    for(int j = 1; j<=input; j++){              
        for(int i=1; i<=j; i++ ) {
        System.out.print("*");
        } 
        System.out.println("");
    } 


    }
}
