package Day10_1;

public class Sample4 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); //not-do e발생시 구문을 나감.
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException) {
				System.out.println("true"); 
				System.out.println("ArithmeticException");
			}
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);

	}//p
}//c

