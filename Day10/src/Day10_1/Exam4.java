package Day10_1;


class FoolException2 extends Exception{	
}

public class Exam4 {
	
	public void sayNick(String nick) throws FoolException2 {
	
		if ("fool".equals(nick)) {
			throw new FoolException2();
		}
		System.out.println("당신의 별명은 "+ nick+ "이다.");
	}

	public static void main(String[] args) {
		Exam4 s = new Exam4();
		
		try {
			s.sayNick("fool");
			s.sayNick("gen");
		} catch (FoolException2 e) {
			System.err.println("FoolException이 발생했습니다.");
		}
	}
}