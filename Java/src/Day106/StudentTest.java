package Day106;

public class StudentTest {
    public static void main(String[] args) {
        if(args.length < 5){
            System.out.println("최소 5명의 이름을 입력하셔야 합니다.");
            return; //main 중단
        }
        String[] names = new String[5];
        for(int i = 0; i < names.length; i++){
            names[i] = args[i] + "응시자";
        }
        int[] kor = new int[names.length];
        for (int i = 0; i < kor.length; i++) {
            kor[i] = (int) (Math.random() * 100) +1;
        }
        int eng[] = {96, 100, 66, 89, 49};

        for (int i = 0; i < names.length; i++){
            if (names[i].equals("홍길동응시자")){
                // 입력변수 이름이 홍길동 응시자의 국어 점수,영어 점수, 합계출력
                System.out.printf("홍길동 응시자님의 국어 점수는 %d, 영어점수는 %d이며 합계는 %d입니다.\n",
                        + kor[i],eng[i],(kor[i]+eng[i]));
                // 정수평균은 국어(60%), 영어(40%) 비율로 합계 계산
                System.out.printf("정수 평균은 %d입니다.\n",(int)((kor[i]*0.6)+(eng[i]*0.4)/2));
            }
        }

        int scores [][] = new int[2][names.length];
        scores[0] = kor;
        scores[1] = eng;

        boolean condition = false;
        for(int i =0; i < names.length; i++) {
//			name[i].equals("홍길동 응시자");
//			args[i].equals("홍길동");
//			names[i].substring(0,3).equals("홍길동");

//			System.out.println(names[i]+":"+kor[i]+":"+eng[i]);
            //System.out.println(names[i]+":"+scores[0][i]+":"+scores[1][i]);

            if(names[i].trim().equals("홍길동응시자")) {
                int sum =(int)(scores[0][i] + scores[1][i]);
                System.out.println("홍길동의 총점:"+ sum);
                System.out.println("홍길동의 정수 평균:" + (int)((scores[0][i]*0.6) + (scores[1][i]*0.4)/2));
                condition = true;
            }

        }

        if(condition ==  false) {
            System.out.println("홍길동없다 ");
        }
    }
}
