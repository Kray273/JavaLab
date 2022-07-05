package Day4;

//일력 받은 갯수 만큼의 별

import java.util.Scanner;
public class Day4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tell me What you wnat Star : ");
        int input = scanner.nextInt();

        for(int i = 1; i<=input; i++) {
            System.out.printf("*", i);
        } 
        System.out.println("");





    }
    
}
