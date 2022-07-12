package JavaProject;

public class MyCalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcu cal = new MyCal();
		
//		cal.plus(3, 4);
		System.out.println(cal.plus(3, 4));
		System.out.println(cal.ecec(5, 9));

		System.out.println(Calcu.ecec2(5, 9));
		//인터페이스에 static매서드를 사용하면 간단한 기능을 가진 유틸리티 성격의 인터페이스를 사용할 수 있다.
	}

}
