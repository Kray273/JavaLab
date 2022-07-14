package Day5;
import java.util.*;

public class Day5_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		
		for(int i=0; i < score.length; i++) {
		 sum += score[i]; 	
		}
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %2.1f\n", ((float)sum / score.length));
		
	
		
		
		

}
}