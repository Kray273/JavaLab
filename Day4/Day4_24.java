package Day4;

// 두 정수 사이의 정수를 작은것부터 순서대로 표시
//수정

import java.util.*;
public class Day4_24 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("number of A? ");
        int A = stdIn.nextInt();
        
        System.out.println("number of B? ");
        int B = stdIn.nextInt();

        System.out.printf("number of A : %d\n", A);
        System.out.printf("number of B : %d\n", B);
        if( A>B) {
            int C = A;
            A = B;
            B = C;
        }

        do {
            System.out.print( A + " ");
            A = A +1;
        }while(A<=B);   
        System.out.println();


    }
    
}
