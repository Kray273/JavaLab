package Day4;

//

public class Day4_10 {
    public static void main(String[] args) {
  
        int i = 11;
        System.out.println("count down.");
        while(i--!=0) {
            System.out.println(i);
            for(long j=0; j<2_000_000_000_00L;j++){
                ;
            } //다음으로 들어가기 위해 잠시 홀딩
        }
        System.out.println("Game over");

    }
    
}
