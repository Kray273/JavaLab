package Day123_test;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		BookDAO dao = new BookDAO();
		while(true) {
		System.out.println("=== 도서입력 및 조회 프로그램 ===");
		System.out.println("1.도서정보입력");
		System.out.println("2.도서정보출력");
		System.out.println("3.종료");
		System.out.print("번호 입력 : ");
		Scanner key = new Scanner(System.in);
		int menu = key.nextInt();
		if(menu == 3) {
			System.out.println("프로그램을 종료합니다.");
			break;
		} else if(menu == 1) {
			dao.input();
		} else if (menu == 2) {
			dao.selectBook();
		}
		}//while
	}//main
}//class
