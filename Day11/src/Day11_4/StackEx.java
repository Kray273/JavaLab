package Day11_4;

import java.util.*;
public class StackEx {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {
		goURL("1.네이버");
		goURL("2.카카오");
		goURL("3.유투브");
		goURL("4.인스타");
		
		ptintSratus();
		
		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		ptintSratus();
		
		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		ptintSratus();
		
		goForword();
		System.out.println("= '앞으로' 버튼을 누른 후 =");
		ptintSratus();

		goURL("codechobo.com");
		System.out.println("= 새로운 주소로 이동 후 =");
		ptintSratus();
		
	}
	
	public static void ptintSratus() {
		System.out.println("back:"+back);
		System.out.println("forword:"+forward);
		System.out.println("현재화면은 '"+back.peek()+"'입니다.");
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) {
			forward.clear();
		}
	}
	public static void goForword() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	}

	public static void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	}
}
