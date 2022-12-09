package Day106;

public class Moving {
    public static void main(String[] args) {

        int i = 1;
        while (true){
            int test = (int)(Math.random()*10)+1;
            i++;
            //5를 제외하고 출력
            if (test == 5) continue;
            System.out.println( i + ":" + test);
            //10이 오면 종료
            if (test  == 10) break;
        } //end while

    }//end main()
} // end Moving
