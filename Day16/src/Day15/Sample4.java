package Day15;

public class Sample4 {
	public static void main(String[] args) {
		int[] array = {12,13,11,14,10};
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			} 
		}
		System.out.println("max:"+max);
	}
}
