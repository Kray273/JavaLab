package JavaProject;

public interface Master {
	public void start();
	public int stop(int distance);
	
	default void afterMidnight() {
		System.out.println("자정이 넘었습니다. 할증이 필요한 경우 이 메서드를 오버라이딩 하세요.");
	}
}
