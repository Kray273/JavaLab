package JavaProject;

public class LedExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv = new LedTV();
		
		tv.turnOn();
		tv.changeVolume(8);
		tv.changeChannel(39);
		tv.turnOff();
	}

}

//참조변수를 타입으로 인터페이스를 사용할 수 있다. 
//인터페이스가 가진 매서드만 사용할 수 있다.