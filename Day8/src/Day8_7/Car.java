package Day8_7;

public class Car {
	
	public void run() {
		System.out.println("차가 달립니다.");
	}
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}

	public void horn() {
		System.out.println("경적을 올립니다.");
	}
}

class Bus extends Car{
	
	public void run() {
		System.out.println("차가 달리면서 다음 정거장을 안내합니다");
		return;
	}
	
}
