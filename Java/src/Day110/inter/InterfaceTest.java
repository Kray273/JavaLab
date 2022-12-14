package Day110.inter;
class StudentWorker implements Student,Worker{
    //interface에 선언된 변수
    /* 교직원 : String dept = "전산학과";
        학생 : double score = 4.5;
    * */
    String title = "조교";
    @Override
    public void work() {
        System.out.println("학교에서 일하다.");
    }

    @Override
    public void study() {
        System.out.println("도서관에서 공부하다.");
    }
    @Override
    public void lunch() {
        System.out.println("학생식당이나 교직원 식당에서 점심먹다.");
    }

    void team() {
        System.out.println("조교모임 참석하다 ");
    }
} //class
public class InterfaceTest {
    public static void main(String[] args) {
        //Worker w = new Worker(); interface는 객체 생성 불가
        //Student s = new Student();
        StudentWorker sw = new StudentWorker();
        sw.study();
        sw.lunch();
        sw.work();
        sw.team();
        System.out.println(sw.title);
        System.out.println(Worker.dept); //Worker 상속_ 자체 클래스명으로 접근
        System.out.println(sw.score); // Student 상속_ implement된 클래스로 접근
        sw.title = "조교아님";
        System.out.println(sw.title);
        //sw.dept = "국문한"; //error interface는 static이지만 final이기도 하다.
        //interface의 변수는 read only

        Worker w = new StudentWorker();
        /*
        1. 자동형변환 이후
        2. w. override 메소드 -> StudentWorker 클래스
        3. Worker 인터페이스 포함 -> StudentWorker
        4. lunch와 work만 사용가능
         */
        //w.study();
        w.lunch();
        w.work();
        //w.team(); //StudentWork의 매서드

        Student s = new StudentWorker();
        /*
        1. 자동형변환 이후
        2. s.override 메소드 -> StudentWorker 클래스
        3. Student 인터페이스 포함 -> StudentWorker
        4. lunch와 study만 사용가능
         */
        s.study();
        s.lunch();
        //s.work();
        //w.team(); //StudentWork의 매서드
    }//main
}//class
