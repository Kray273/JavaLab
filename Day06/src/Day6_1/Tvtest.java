package Day6_1;

public class Tvtest {
	public static void main(String[] args) {
		
		//Tv 객체 생성, Tv class로 tv instance 생성
		
		//Tv 인스턴스를 참조하기 위한 변수 t1 객체 생성
				
		Tv t1 = new Tv(); //t1 객체 생성
		Tv t2 = new Tv(); //t1 객체 생성
		
		t1.channel = 7; // channel 번호 7로 초기화 
		t1.channelDown (); // 번호 하나 내림 7>6 
		
		t2.channel = 11;  
		t2.channelUp (); 
		
		System.out.println("현재 채널은 " + t1.channel + "입니다.");
		System.out.println("현재 채널은 " + t2.channel + "입니다.");
		
		
	}

}
