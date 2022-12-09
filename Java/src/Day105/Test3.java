package Day105;

public class Test3 {
    public static void main(String[] args) {
        int books=96;	//도서수
        int cntOfStu = 12; // 학생수
        int giveBooks = books / cntOfStu;
        int remainBooks = books % cntOfStu;
        // 12명의 학생에게 xx권씩 나누어 줍니다.
        System.out.printf("%d학생들에게 %d권씩 나누어 줍니다.",cntOfStu,giveBooks);
        // 남은 도서가 있으면 _남은책은 xx권 입니다.
        if(remainBooks != 0){
            System.out.printf("남은책은 %d권 입니다.",remainBooks);
        } else {
            // 남은 도서가 없으면 _ 출력 x
            System.out.printf("남은책은 없습니다.");
        }

    }//main
}//class Test
