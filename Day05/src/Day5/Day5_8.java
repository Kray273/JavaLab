package Day5;


import java.util.*;
public class Day5_8 {
	public static void main(String[] args) {
		
		
		int[] numArr = new int[10];		
		
		for(int i=0; i< numArr.length; i++) {
			 numArr[i] = i;
		System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<numArr.length; i++) {
		 int j = (int)(Math.random() *10);
		 
		 int tmp = numArr[0];
		 numArr[0] = numArr[j];
		 numArr[j] = tmp; 
		}
		
		for(int i=0; i< numArr.length; i++) {
			System.out.print(numArr[i]);	
		}	
		

}
}