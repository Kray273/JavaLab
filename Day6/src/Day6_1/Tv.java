package Day6_1;

public class Tv {
		
		// Tv의 속성(멤버변수)
				String color; //색상
				boolean power; //전원상태
				int channel; //채널 
				
				//Tv의 기능(매서드)
				void power() {
					power = !power;
				}// on/off
				void channelUp() {
					++channel;
				}
				void channelDown() {
					--channel;
				}

}
