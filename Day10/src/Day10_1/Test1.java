package Day10_1;

public class Test1 {

	public static void main(String[] args) {
		
		try {
			int[] array = new int[10];
			array[20] = 5;
		} catch (Exception e) {
			System.out.println("배열이 범위를 지나쳤어요.Sample6");
		}
		System.out.println("성공");
	}//m
}//c

