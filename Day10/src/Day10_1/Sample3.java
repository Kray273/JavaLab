package Day10_1;

public class Sample3 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); //not-do e발생시 구문을 나감.
		} catch (Exception e) {
				System.out.println(5); //not-do
			}
		System.out.println(6);
		
	}//p
}//c

