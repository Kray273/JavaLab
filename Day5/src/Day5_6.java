import java.util.*;

public class Day5_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0]; //index 0번째 즉 79를 기준으로 잡는다.
		int min = score[0];
		
		for(int i=1; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			} else if ( min > score[i] ) {
				min = score[i];
			}
				
		}
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
}
}