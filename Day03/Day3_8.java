package Day3;
public class Day3_8 {
    //구구단 출력
public static void main(String[] args) {
    

    for(int j = 2; j<=9; j++){              
        for(int i=1; i<=9; i++ ) {
        System.out.printf("%d x %d = %d%n", j, i, i*j);
        } 
    }
}
}