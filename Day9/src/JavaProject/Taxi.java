package JavaProject;

public class Taxi implements Master {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("운행을 시작합니다.");
	}
	
	public int BASE_FARE = 3000;

	@Override
	public int stop(int distance) {
		// TODO Auto-generated method stub
		int fare = BASE_FARE + distance *2;
		System.out.println("운행을 종료합니다. 요금은 " + fare + "원입니다.");
		return fare;
	}

}
