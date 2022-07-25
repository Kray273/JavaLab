package Day17_2;

import java.util.*;

public class ArrayExam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사람 수 :");
		int no = sc.nextInt();
		int[] arr = new int[no];
		System.out.println("점수를 입력하세요");
		for (int i = 0; i < no; i++) {
			System.out.print(i+1+"번의 점수 :");
			int arrno = sc.nextInt();
			arr[i] = arrno;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("합계는 "+sum+"점 입니다.");
		System.out.println("평균은 "+(sum/no)+"점 입니다.");
		int max = arr[0]; 
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} 
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최고점은 "+max+"점 입니다.");
		System.out.println("최저점은 "+min+"점 입니다.");
	}
}
