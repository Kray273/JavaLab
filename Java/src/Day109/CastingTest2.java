package Day109;

public class CastingTest2 {
    void setParent(Parent target){ // 매개변수의 type이 부모면 상속관계의 객체를 모두 전달 받을 수 있다.
        Parent P = target;
    }

    public static void main(String[] args) {
        Parent[] array = new Parent[3];
        //자동형변환 여러가지 타입 객체 1개 타입 통일
        array[0] = new Parent();
        array[1] = new Child1(); //자동형변환
        array[2] = new Child2(); //자동형변환
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getClass().getName() + " : " + i + "번째 인덱스 객체");
            array[i].print();//동일명의 메소드 = 동일 기능? X
            //override매소드는 서로 다르다.
            //Child2 객체인 경우 mc2() 호출
            if(array[i] instanceof Child2){
                System.out.println("if문 : " + i);
                ((Child2)array[i]).mc2();
            }
        }

        CastingTest2 ct2 = new CastingTest2();
        ct2.setParent(new Child1());
        ct2.setParent(new Child2());
        ct2.setParent(new Parent());

    }//main
}//class
