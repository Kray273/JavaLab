package Day7_5;

class Animal{
	String name;
	
	void setName(String name) {
		this.name = name;
	}
	
}

class Dog extends Animal{
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseD extends Dog{


	void sleep() { //오버 라이딩-자식이기는 부모 없다. 그래서 부모의 sleep을 개선
		System.out.println(this.name + " zzz in house");
	}
	void sleep(int hour) { //오버로딩 인수가 다르니 다른게 출력 동일한 매서드 이름을 가지더라도
		System.out.println(this.name + " zzz in house for " + hour + " hours");
	}
}
class HouseD2 extends Dog{	
	HouseD2(String name){
		this.setName(name);	
	}
	HouseD2(int type){
		if (type == 1 ) {
			this.setName("york");	
		} else if (type == 2 ) {
			this.setName("bull");	
		}
	}
}


public class Sample {
	public static void main(String[] args) {
		HouseD housedog = new HouseD();
		System.out.println(housedog.name); //name변수에 값을 설정하지 않아서 null이 출력
		housedog.setName("happy");
		housedog.sleep();
		housedog.sleep(3);
		
		HouseD2 happy = new HouseD2("happy");
		HouseD2 yourk = new HouseD2(2);
		System.out.println(happy.name); //happy 출력
		System.out.println(yourk.name); //bull 출력

	}
}
