package Day17_2;

import java.util.*;

public class ArrayExam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int no = sc.nextInt();
		int[] arr = new int[no];
		System.out.println("요소 수: " + no);
		
		for (int i = 0; i < no; i++) {
			System.out.print("a["+ i + "] = ");
			int arrno = sc.nextInt();
			arr[i] = arrno;
		}
		System.out.print("a = {");
		for (int j = 0; j < no-1; j++) {
			System.out.print(arr[j]+",");
		}
		System.out.println(arr[arr.length-1]+"}");
	}
}
