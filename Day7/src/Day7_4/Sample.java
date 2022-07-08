package Day7_4;

public class Sample{
	int sum(int a, int b) {
		return a + b ;
	}
	
	String say() {
		return "Hi";
	}
	
	void sayNick(String nick) {
		if ("fool".equals(nick)) {
			return;
		}
		System.out.println("나의 별명은 " + nick + "입니다.");
	}
	
	void varTest(int a) {
		a++;
	}
	
	int d;
	void varTest2() {
		this.d++;
	}

	
	public static void main(String[] args) {
			Sample sample = new Sample();
			int a = sample.sum(3, 4);
			System.out.println(a);
			
			String b = sample.say();
			System.out.println(b);
			
			sample.sayNick("angel");
			sample.sayNick("fool"); //출력되지 않는다.
			
			int c = 1;
			sample.varTest(c);
			System.out.println(c);
			
			sample.d = 1;
			sample.varTest2();
			System.out.println(sample.d); //2출력

			
	}


}