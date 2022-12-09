package Day107;

//교육생 객체 표현 클래스
class Student {
    //1. 변수선언 -이름, 과정명, 교육기관, 교육비, 부가금, 환급비 (이름,타입지정해주지않았음)
    String name; //이름
    String subject; //과정명
    //2. 단, 교육기관은 = 새싹으로 모든교육생동일,  공유 static
    static String location = "새싹"; //교육기관
    int fee; //교육비
    //3. 단, 부가금 = 5000으로 수정불가능
    final int addFee = 5000; //부과금
    int returnFee = 0; //환급비


    //4. 메소드 - 타입 알아서 calc()
    void clacReturnFee(String name, String subject, int fee){
        if(subject.equals("자바")){ //4-1. 과정명이 "자바" 이면 환급금 = 교육비의 20% + 부가금
            returnFee = (int) ((fee*0.2) + addFee);
        } else if(subject.toLowerCase().equals("jsp")){//4-2. 과정명이 "jsp" 이면 환급금 = 교육비의 15% + 부가금*2
            returnFee = (int) ((fee*0.15) + (addFee*2));
        } else if(subject.toUpperCase().equals("SPRING")){//4-3. 과정명이 "spring" 이면 환급금 = 교육비의 10% + 부가금
            returnFee = (int) ((fee*0.1) + (addFee));
        }
        //실행 main 메소드클래스
        System.out.printf("이름 : %s\n과정명 : %s\n교육비 : %d\n교육기관 : %s\n부가금 : %d\n환급비 : %d",
                            name, subject, fee, location, addFee, returnFee);
    }
}
public class Test1 {
    public static void main(String[] args) {
        //교육생 a1 = new 교육생();
        Student t1 = new Student();
        //교육생 환급비 계산 메소드 호출
        //이름, 과정명, 교육비 명령행 매개변수 입력값 할당
        t1.clacReturnFee("김사각","자바",30000);
/*
		결과 리턴, 결과 출력
		이름 : xxx
		과정명 : xxx
		교육비 : xxx
		교육기관 : 새싹
		부가금 : 5000
		환급비 : xxx
*/


    }
}