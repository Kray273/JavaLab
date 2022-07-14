package Day4;

//누적 덧셈

public class Day4_12 {
    public static void main(String[] args) {
        int sum = 0, i = 0;

        while( (sum += ++i ) <= 100) {
            System.out.printf("%d - %d%n",i, sum);
        }

    }
    
}
