package Day7_6;
import java.util.*;
class Cal{
	int value;
	
	Cal(){
		this.value = 0;
	}
	
	void add(int val) {
		this.value += val;
		if (this.value > 100) {
			this.value = 100;
		}
	}
	
	int getValue() {
		return this.value;
	}
	
	void minus (int val) {
		this.value -= val;
	}
	
	boolean isOdd (int num) {
		return num %2 == 1;
	}
	
	int avg(int[] data) {
		int total = 0;
		for (int num : data) {
			total += num;
		}
		return total/data.length;
	}

	int avg(ArrayList<Integer> data) {
		int total = 0;
		for (int num : data) {
			total += num;
		}
		return total/data.size();
	}
	
}


public class Sample1 {

	public static void main(String[] args) {
		Cal cal1 = new Cal();
		cal1.add(10);
		cal1.minus(3);
		System.out.println(cal1.getValue()); 
	
		Cal cal2 = new Cal();
		cal2.add(50);
		cal2.add(60);
		System.out.println(cal2.getValue()); 

		Cal cal3 = new Cal();
		System.out.println(cal3.isOdd(3)); 
		System.out.println(cal3.isOdd(4)); 
		
		Cal cal4 = new Cal();
		int[] data1 = {1,3,5,7,9};
		int result1 = cal4.avg(data1);
		System.out.println(result1);
		
		ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1,3,5,7,9,11));
		int result2 = cal4.avg(data2);
		System.out.println(result2);
		
		
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
		ArrayList<Integer> b = a;
		a.add(4);
		System.out.println(b.size());
		System.out.println(a==b);
	}

}
