package Day8_1;

class Tv1{
	boolean power; // 전원상태(on/off)
	int channel; //channel

	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;};
	
}

class Tv2 extends Tv1{
	boolean caption; //caption상태
	void displayCaption(String text) {
		if (caption) { //캡션 상태가 on일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

public class Tv {

	public static void main(String[] args) {
		Tv2 ctv= new Tv2();
		ctv.channel = 10;	//조상으로 부터 받은 멤버
		ctv.channelDown();	//조상으로 부터 받은 멤버
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, world:");
		ctv.caption = true; //캡션(자막) 기능을 켠다.
		ctv.displayCaption("Hello, world:");

	}

}
