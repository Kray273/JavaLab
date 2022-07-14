package JavaProject;

public interface TV {
	public int MIN_VOLUME = 0; //final 생략해도 상수 형태사용 가능
	public int MAX_VOLUME = 100;

	public void turnOn(); // 전원을 키는 기능
	public void turnOff(); 
	public void changeVolume(int volume); 
	public void changeChannel(int Channel); 
	 
}
