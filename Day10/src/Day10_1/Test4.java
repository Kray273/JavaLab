package Day10_1;

class Exception3{
	public int get50thItem2 (int[] array)
//			throws IllegalArgumentException 
	{ 
		if (array.length < 50) {
			throw new IllegalArgumentException();
		}
		return array[49];
	}
}

 public class Test4 {
	public static void main(String[] args) {
		Exception3 ex = new Exception3();
		int[] array = null;
		array = new int[50];
		array[49] = 100;
		System.out.println("array 배열의 50번쪠 요소의 값 "+ex.get50thItem2(array));
		
		array = new int[49];
		array[48] = 100;
		System.out.println("array 배열의 50번쪠 요소의 값 "+ex.get50thItem2(array));
	}//m
}//c

