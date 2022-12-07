package Day105;

public class Test2 {
    public static void main(String[] args) {
        int time = 10000; //10000초
        //연산자
        int se = 1;
        int mi = se *60;
        int ho = mi * 60;
        int hour = time / ho;
        int minute = (time % ho)/mi;
        int second = (time % ho)%mi;
        int total = (40)+(46*60)+(3600*2);

        // 10000초는 몇시간 , 몇분 , 몇초 입니다.
        System.out.printf("10000초는 %d시간 , %d분 , %d초 입니다. %d", hour, minute, second,total);
    }//main
}//class Test
