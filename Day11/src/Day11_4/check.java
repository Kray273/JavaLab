package Day11_4;

import java.util.*;
public class check {

	public static void main(String[] args) {
		if (args.length!=1) {
			System.out.println("Usage : java check\"EXPRESSION\"");
			System.out.println("Example : java check\"{(2+3)*1}+3\"");
			System.exit(0);
		}
		Stack st = new Stack();
		String ex = args[0];
		System.out.println("expression : " +ex);
		try {
				for (int i = 0; i < ex.length(); i++) {
					char ch = ex.charAt(i);
					if(ch=='C') {
						st.push(ch+"");
					} else if (ch==')') {
						st.pop();
					}
				}
				if (st.isEmpty()) {
					System.out.println("괄호가 일치함");
				} else {
					System.out.println("괄호가 일차하지 않음");
				}
		} catch(EmptyStackException e) {
			System.out.println("괄호가 일차하지 않음");
		}
	}
}
