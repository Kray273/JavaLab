package Day105;

public class ScoreTest {
    public static void main(String[] args) {
        String name = "홍길동";
        int kor = 100, eng = 50, mat = 74;
        int sum = kor + eng + mat; //총점
        double avg = (double)sum/ 3; //실수 평균
        int avgInt = (int)avg; //정수평균
        String grade = "";

        //switch문
        switch (avgInt/10) {
            //avgInt 90점이상 100점 이하 grade "A"
            case 10 : // case9와 동일함으로 내용이 없어도 돌아감.
            case 9 :
                grade = "A";
                break;
            //avgInt 80점이상 90점 미만 grade "B"
            case 8 :
                grade = "B";
                break;
            //avgInt 70점이상 80점 이하 grade "C"
            case 7 :
                grade = "C";
                break;
            //avgInt 60점이상 70점 이하 grade "D"
            case 6 :
                grade = "D";
                break;
            //avgInt 60점미만 grade "낙제"
            default:
                grade = "낙제";
        } //switch

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
