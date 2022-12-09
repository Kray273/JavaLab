package Day106;

public class ScoreTest {
    public static void main(String[] args) {
        String name = "홍길동";
        // 1-100 난수 발생
        //double d =  Math.random(); //0.0 <= ? < 1.0 난수 생성
        //double d =  Math.random() * 100; //0.0 <= ? < 100.0 난수 생성
        //int d =  (int)(Math.random() * 100); //0 <= ? < 100 난수 생성
        int d =  (int)(Math.random() * 100) + 1; //1 <= ? <= 100 난수 생성

        int kor = d;
        int eng = (int)(Math.random() * 100) + 1;
        int mat = (int)(Math.random() * 100) + 1;
        int sum = kor + eng + mat;  //총점
        double avg = (double)sum/ 3; //실수 평균
        int avgInt = (int)avg; //정수평균
        String grade = "";

        //if문
        if(avgInt <= 90 && avgInt >= 100){
            grade = "a";
        } else if (avgInt >= 80) { // && avgInt < 90를 체크하지 않는 이유는 이미 위에서 조건을 걸러서.
            grade = "b";
        } else if (avgInt >= 70 ){
            grade = "c";
        } else if (avgInt >= 60 ){
            grade = "d";
        } else{
            grade = "낙제";
        }

        System.out.printf("%s 학생은 국어=%3d점, 영어=%3d점, 수학=%3d점입니다.\n" //영어 점수와 수학 점수 앞에 공백이 생김.
                +"총점은 %d이고 평균(실수평균)은 %.2f입니다.\n"
                +"등급은 %s등급입니다.\n",name,kor,eng,mat,sum,avg,grade);
    }//main
} //ScoreTest
