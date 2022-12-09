package Day107;

class Member{ //회원 관리 프로그램 Member클래스
    //<변수>
    String id; //아이디
    int pw; //암호
    String name; //이름
    int age ; //나이
    //<메소드>
    void insert(String id, int pw,String name, int age){//회원 가입
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
        System.out.printf("--------------------------\n"+
                "아이디 : %s\n" +
                "이름 : %s\n" +
                "나이 : %d\n" +
                "가입 완료되었습니다.\n" +"--------------------------\n", id,name,age);
    }
    void login(String id, int pw){//로그인
        if(this.id.toLowerCase().equals(id)){
            if (this.pw == pw) {
                System.out.printf("--------------------------\n"+
                        "로그인되었습니다.\n" +
                        "--------------------------\n");
            } else {
                System.out.printf("--------------------------\n"+
                        "로그인 정보를 확인하세요.\n" +
                        "--------------------------\n");
            }
        }
    }
    void setPassword(int pw){// 암호 수정
        this.pw = pw;
        System.out.printf("--------------------------\n"+
                "암호를 변경하셨습니다.\n" +
                "--------------------------\n");
    }
    void getMyInfo(){// 자기 정보 조회
        this.pw = pw;
        System.out.printf("--------------------------\n"+
                "아이디 : %s 회원님 정보는 다음과 같습니다.\n" +
                "암호 : %d\n" +
                "이름 : %s\n" +
                "나이 : %d\n" +
                "--------------------------\n",this.id,this.pw,this.name,this.age);
    }
    String logout(){//로그 아웃
        this.id = null;
        this.pw = -1;
        this.name = null;
        this.age = -1;
        System.out.printf("--------------------------\n"+
                "로그로그아웃되었습니다.\n" +
                "--------------------------\n");
        return this.id;
    }

}

class Test2{
    public static void main(String args[]){
        Member mem = new Member();
        mem.insert("test", 1234, "이자바", 25);
        mem.login("test", 4321);
        mem.login("test", 1234);
        mem.setPassword(1111);
        mem.getMyInfo();
        String id  = mem.logout();
        if(id == null){
            System.out.println("다시 로그인하셔야 합니다.");
        }
    }
}





