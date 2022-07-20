package Day15;

public class Sample3 {
	public static void main(String[] args) {
		int sum = 0;
		int[] array = {12,13,11,14,10};
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("sum:"+sum);
	}
}
