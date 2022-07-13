package Day10_1;

public class Sample5 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); //not-do e발생시 구문을 나감.
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외메시지 : " + ae.getMessage());
		}
		System.out.println(6);

	}//p
}//c

