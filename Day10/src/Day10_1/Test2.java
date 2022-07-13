package Day10_1;

class Exception2{
	public int get50Item(int[] array) throws ArrayIndexOutOfBoundsException { 
		
		return array[49];
	}
}

public class Test2 {
	public static void main(String[] args) {
		
//		Exception2 ex = new Exception2();
//		int num = ex.get50Item(new int[100]);
//		System.out.println("array 배열의 50번쪠 요소의 값 "+num);
		
		Exception2 ex = new Exception2();
		int num = ex.get50Item(new int[30]);
		System.out.println("array 배열의 50번쪠 요소의 값 "+num);
	}//m
}//c

