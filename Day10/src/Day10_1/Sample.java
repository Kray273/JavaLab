package Day10_1;

public class Sample {

	public static void main(String[] args) {
		int n = 100;
		int r = 0;
		
		for (int i = 0; i < 10; i++) {
			try {
				r = n / (int)(Math.random()*10);
				System.out.println(r);
			} catch (ArithmeticException e) {
				System.out.println("0");
			}
		}//f
	}//p
}//c
