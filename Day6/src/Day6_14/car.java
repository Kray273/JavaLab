package Day6_14;

public class car {
	String name;
	int num;
	
	car() {
		this("이름없음", 0);
	}
	car(String name) {
		this(name, 0);
	}
	car(String name, int num) {
		this.name =name;
		this.num = num;
	}
	
}
