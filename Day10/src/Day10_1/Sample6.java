package Day10_1;

public class Sample6 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음.");
			throw e;
			//throw new Exception ("고의로 발생시켰음."); //위의 두 줄을 한줄로.
		} catch (Exception e) {
			System.out.println("예외메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종류됨.");

	}//p
}//c

