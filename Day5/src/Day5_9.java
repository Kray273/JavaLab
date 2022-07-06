

import java.util.*;
public class Day5_9 {
	public static void main(String[] args) {
		
		int [] numArr = new int[10];
		int [] counter = new int[10];
		
		Random random = new Random();
			
		for(int i=0; i< numArr.length; i++) {
			 numArr[i] = random.nextInt(10);
			System.out.print(numArr[i]);			 	
		}	System.out.println();
			 
		for(int j=0; j< counter.length; j++) {
			counter[numArr[j]]++;
//			if(counter == j ) {
//			System.out.printf("%d의 개수 : %d\n", j, numArr[j]);
//			}
		}
		
		
		

}
}