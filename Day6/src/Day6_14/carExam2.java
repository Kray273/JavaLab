package Day6_14;

import Day6_13.Car;

public class carExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car car1 = new car();
		car car2 = new car("자동차");
		car car3 = new car("자동차", 1234);
		
		System.out.println(car1.name + " , "+ car1.num);
		System.out.println(car2.name + " , "+ car2.num);
		System.out.println(car3.name + " , "+ car3.num);
	}

}
