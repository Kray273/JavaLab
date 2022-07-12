package JavaProject;

public interface Calcu {

	public int plus (int i, int j);
	public int multiple (int i, int j);
	
	default int ecec(int i, int j) {
		return i + j;
	}
	
	public static int ecec2(int i, int j) {
		return i * j;
	} 
}
