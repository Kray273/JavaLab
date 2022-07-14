package Day6_1;

public class Tvtest4 {

	public static void main(String[] args) {
		//길이가 3인 tv객체 배열
		Tv[] tvArr = new Tv[3];
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10 ; // 각각 객체의 채널에 다른 값을 저장
		}
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp(); //객체들 마다 채널이 1씩 증가
			System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
		}

	}

}
