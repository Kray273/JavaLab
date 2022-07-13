package Day10_1;

public class Sample7 {

	public static void main(String[] args) {
		try {
			startInstall(); //프로그램 설치 파일 준비
			copyFiles(); //파일 복사
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			deleteTempFiles();	//임시파일 삭제
		}
	}//m
	static void startInstall() {	//설치에 필요한 코드입력
	}
	static void copyFiles() {	//파일복사  코드입력
	}
	static void deleteTempFiles() { //삭제 코드입력
	}
}//c

