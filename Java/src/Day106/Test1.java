package Day106;
public class Test1 {
    public static void main(String[] args) {
        /*입력변수 -5
		       * 공백 4 별 1개
		      *** 공백 3개 */
        char star = '*';
        char blank = ' ';
        int lines = (int)(Math.random() * 5)+1; //최대 5줄로 고정
        System.out.println("line : " + lines);
        for (int i = 1; i <= lines; i++){
            for (int b = lines; b > i; b--){
                System.out.print(blank);
            }
            for (int k = 0; k < i*2-1; k++) {
                    System.out.print(star);
            }
            System.out.println();
        }

    }
}
