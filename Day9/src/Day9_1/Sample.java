package Day9_1;

interface Predator{
	String getFeed();
}

class Animal {
	String name;
	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal implements Predator {	
	public String getFeed() {
		return "apple";
	}
}

class Lion extends Animal implements Predator {	
	public String getFeed() {
		return "banana";
	}
}

class ZooKeeper {
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFeed());
	}
}

public class Sample {
	public static void main(String[] args) {
		ZooKeeper zookeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion  = new Lion();
		
		zookeeper.feed(tiger); 
		zookeeper.feed(lion);
		
	}
}