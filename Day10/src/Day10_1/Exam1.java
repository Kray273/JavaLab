package Day10_1;

public class Exam1 {

	public static void main(String[] args) {
//		int c = 4/0 ; //by zero
	
//		int[] a = {1,2,3};  // ArrayIndexOutOfBoundsException:
//		System.out.println(a[3]);
		
		int c;
		try {
			c = 4/0;
		} catch (ArithmeticException e) {
			System.out.println("에러 발생");//예외가 발생해 이 문장이 실해
		}
		
	
		try {
			int[] a = {1,2,3};
			System.out.println(a[2]);
		} catch (ArrayIndexOutOfBoundsException d) {
			System.out.println("에러 발생");//예외가 발생해 이 문장이 실해
		} finally {
			System.out.println("에러가 유무와 상관없이 실행");
		}
	
	
	}

}
