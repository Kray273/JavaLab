package Day7_1;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 2000;
		boolean hasCard = true;
		
		if(money >= 3000 || hasCard) {
			System.out.println("택시를 타고 가라.");
		} else {
			System.out.println("걸어가라.");

		}
	}

}
