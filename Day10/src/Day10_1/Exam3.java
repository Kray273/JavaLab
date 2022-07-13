package Day10_1;


class FoolException extends RuntimeException{
	
}

public class Exam3 {
	
	public void sayNick(String nick) {
	try {
		if ("fool".equals(nick)) {
			throw new FoolException();
		}
		System.out.println("당신의 별명은 "+ nick+ "이다.");
		} catch (FoolException e) {
		System.err.println("FoolException이 발생했습니다.");
	}
}
	public static void main(String[] args) {
		Exam3 s = new Exam3();
		
		s.sayNick("fool");
		s.sayNick("gen");
	}

}
