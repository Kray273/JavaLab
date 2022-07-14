package Day8_3;

public class Casting2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car; //형변환에 오류가 있어서 에러가 뜸. 문제는 car가 참조하고 있는 인스턴스가 Car타입의 인스턴스하는것
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}
