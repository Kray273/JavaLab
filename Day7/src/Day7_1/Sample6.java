package Day7_1;

import java.util.*;
public class Sample6 {
	public boolean IfTest(int age) {

	boolean ret = false;
	
	if ( age<=19 || age>= 60 ) {
		ret = true;
	} else {
		ret = false;
	}
	return ret;
	
	}
	public static void main(String[] args) {
		Sample6 exam = new Sample6(); 
		System.out.println(exam.IfTest(17));
		System.out.println(exam.IfTest(27));
		System.out.println(exam.IfTest(61));
	}
	
}

