package Day109;
abstract class Shape{
    abstract void area(); //면적
    abstract void circum(); //둘레
    void print(){ // 자식클래스 반드시 오버라이딩 불필요
        System.out.println("면적과 둘레 출력 기능");
    }
} // Shape

class Rectangle{
    int width, height;
} // Rectangle

class Circle{
    int radius;
    static final double pi = 3.14; //값을 변경하지 못하는 채로 공유!

}// Circle

public class shapeTest /* extends Object */{
    public static void main(String[] args) {
        // 명령행 매개변수
        // rect 6 8 - 3개 입력 받고, 첫번째 "rect"이면 Rectangle객체 생성
        // 면적 - area() 호출 - 두, 세번째 가로, 세로 면적 출력

        // cir 5 - 2개 입력 받고, 첫번째 "cir"이면 Circle객체 생성
        // 두번째 반지름, 면적 둘레

        // "면적"과 "둘레"를 구할 수 있어야 한다. 필수 구현
        Shape s = null;
        if(args.length == 2 && args[0].equals("rect")) {
            s = new Rectangle(args[1], args[2]);
        }else if(args.length == 3 && args[0].equals("cir")){
            s = new Circle(args[1]);
        }else {
            System.out.println("지원되지 않는 도형입니다.");
        }
        s.area();
        s.circum();
    }//main(args)
}//class shapeTest
