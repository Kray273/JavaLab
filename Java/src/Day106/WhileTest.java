package Day106;

public class WhileTest {
    public static void main(String[] args) {
        /*
        int i = 1;
        while (i <= 5){
            int test = (int)(Math.random()*100)+1;
            System.out.println(test);
            i++;
        }//end while
        */

        int i = 1;
        while (true){
            int test = (int)(Math.random()*10)+1;
            System.out.println( i + ":" + test);
            i++;
            //if (test == 5){System.out.println("====중단===");break;}
            if (test == 5) break; //for, while, do-while 블록내부 1문장만 포함시 {} 생략가능
        }

    }//end main()
} // end WhileTest
