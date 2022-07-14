package Day6_2;

public class Cardtest {

	public static void main(String[] args) {
		
		//class variable, 객체 생성 없어도 바로 호출 가능, 많이 안씀 왜 객체마다 유지하는게 어렵다. 
		System.out.println("Card width = " + Card.width);
		System.out.println("Card height = " + Card.height);
		
		//instance variable은 객체를 생성해야 호출 가능
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + "," + c1.number + " 이며 크기는 (" 
				+ c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + "," + c2.number + " 이며 크기는 (" 
				+ c2.width + ", " + c2.height + ")");
		
		System.out.println("c1의 width와 heigh을 50, 80으로 변경");
		c1.width = 50;
		c1.height = 80;
		
		//c1만 변경했는데 c2까지 변경된 이유는 class variable은 동시에 변경
		System.out.println("c1은 " + c1.kind + "," + c1.number + " 이며 크기는 (" 
				+ c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + "," + c2.number + " 이며 크기는 (" 
				+ c2.width + ", " + c2.height + ")");
		
	}

}
