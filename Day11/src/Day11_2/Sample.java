package Day11_2;

import java.util.*;
public class Sample {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		System.out.println(map.get("people")); //사람 출력
		System.out.println(map.get("사람")); //null 출력

	}

}
