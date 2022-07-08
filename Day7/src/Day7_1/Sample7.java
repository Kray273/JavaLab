package Day7_1;

import java.util.*;
public class Sample7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int value = 0;
		int sum = 0;
		
		do{
			value = scan.nextInt();
			sum += value; 
		} while(value < 100);
		
		System.out.println("sum : "+sum);
		
		
		
	}
}

