package JavaProject;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켜다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끄다");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨조절");
	}

	@Override
	public void changeChannel(int Channel) {
		// TODO Auto-generated method stub
		System.out.println("채널조절");
	}

}
