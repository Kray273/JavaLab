package Day107;
class Data{
    int k = 10;
}

class C{
    void add(int i){ // 매개변수 == 입력변수
        System.out.println(i++);
    }
    void addData(Data d){ // 참조형 매개변수
        System.out.println(d.k++);
    }

}
public class CallByValueTest {
    public static void main(String[] args) {
        C c1 = new C();
        int j = 10;
        //매개변수
        c1.add(j); //인수 = 실제로 매개변수로 전달값. //10
        System.out.println("main add종료 후 j의 값:"+ j); //10
        //기본형 - stack 저장값 = 실제 복사 전달 전달 이후에도 메소드(add) 내부 매개변수값(i가 10 →11) 변경하면 인수(j) 변경없다.

        // 참조형 변수 전달 테스트 코드
        Data main_d = new Data();
        c1.addData(main_d); //10
        System.out.println("main에서 addData 종료 후 main_d = " + main_d.k); //11
        //참조형 - stack저장값 = 주소값 전달 복사 (= 객체 동일전달) 인수(main_d)를 매개변수(d)로 “주소”복사(1500) 전달하면
                // 인수와 매개변수는 동일 객체 참조한다.
                // 인수참조객체 내부 변수 값(main_d.k) 변경되면 매개변수 참조객체 내부 변수 값 변경된다.

    }//main(args)
}//class CallByValueTest
