package Day7_1;

import java.util.*;
public class Arraylist_1 {

	public static void main(String[] args) {
		ArrayList <String> pocket = new ArrayList <String>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("monry");
		
		if (pocket.contains("monry")) {
			System.out.println("택시를 타고 가라.");
		} else {
			System.out.println("걸어가라.");

		}
		

	}



}
