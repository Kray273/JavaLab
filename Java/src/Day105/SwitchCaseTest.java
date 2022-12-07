package Day105;

public class SwitchCaseTest {
    public static void main(String[] args) {
        String condition = "조회수";

        if(condition == "제목"){
            System.out.println("제목 검색");
        } else if(condition == "내용"){
            System.out.println("내용 검색");
        } else {
            System.out.println("검색 불가합니다.");
        }

        switch (condition) { //switch(int or String)
            case "제목": ////condition == "제목" 인지 확인
                System.out.println("제목 검색"); // true시 수행할 문장
                break; //condition == "제목"의 경우 switch종료
            case "내용":
                System.out.println("내용 검색");
                break;
            default:
                System.out.println("불가합니다 검색이. ");
        }

    }//main
}
