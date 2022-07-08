package Day7_1;

import java.util.*;
public class Sample {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String monthString = "";
		
		
		while(true) {
			System.out.println("달을 입력해 주세요 :(done :0)");
			int month = stdIn.nextInt();
		
		
		switch(month) {
			case 1 : monthString = "Jan";
			break;
			case 2 : monthString = "Feb";
			break;
			case 3 : monthString = "Mar";
			break;
			case 4 : monthString = "Apr";
			break;
			case 5 : monthString = "May";
			break;
			case 6 : monthString = "Jun";
			break;
			case 7 : monthString = "Jul";
			break;
			case 8 : monthString = "Aug";
			break;
			case 9 : monthString = "Sep";
			break;
			case 10 : monthString = "Oct";
			break;
			case 11: monthString = "Nov";
			break;
			case 12 : monthString = "Dec";
			break;
			default : monthString = "Invalid month";
			break;
		}
		System.out.println(monthString);
		if(month==0) {
			break;
		}
	}
	}
}
