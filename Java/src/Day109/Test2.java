package Day109;
class Information{
    String id; // 공통 코드
    String name; // 공통 이름
    Information(String id, String name){ //공통 변수 초기화.
        this.id = id;
        this.name = name;
    }
    String print(){ //공통 내용 출력 기능
        return id + " : " + name;
    }
}//class Information

class Product extends Information{
    int price; //상품 가격
    public Product(String id, String name, int price) {
        super(id, name); //공통 변수 초기화ㄷ3
        this.price = price;
    }
    @Override
    String print(){
        return super.print() + " : " + price;
        //super로 부모객체의 print()호출
    }
}//class Product

class Board extends Information{
    String contents; // 게시물 내용
    int viewCount;//조회수
    public Board(String id, String name, String contents, int viewCount) {
        super(id, name);
        this.contents = contents;
        this.viewCount = viewCount;
    }
    @Override
    String print(){
        return super.print() + " : " + contents + " : " + viewCount;
    }
}//class Board

class Member extends Information{
    String email; //이메일 아이디
    String phone; //전화번호

    public Member(String id, String name, String email, String phone) {
        super(id, name);
        this.email = email;
        this.phone = phone;
    }
    @Override
    String print(){
        return super.print() + " : " + email + " : " + phone;
    }
}//class Member

class InformationList{
    Information[] list; //information객채 맴버변수

    InformationList(int num){ // InformationLis로 받아온 매개변수를 이용.
        this.list = new Information[num]; // num의 크기를 사진 배열 생성
    }
    void add(Information sth){ //매개변수로 전달받은 instance들을 배열에 삽입.
        for(int i=0; i < list.length; i++){
            if(list[i] ==null){ //배열의 빈공간을 찾아
                list[i] = sth; //전달받은 instance의 주소값을 저장
                break;//없을시 0번째만 반복적으로 들어감.
            }
        }
    }

    public void read(){
        System.out.println("============================");
        for(int i=0; i < 5; i++){ //5개만 출력할 계획
            System.out.println(list[i].print());//add()에서 형변환이 이루어졌다.
            //따라서 알아서 해당하는 class의 print()를 호출
        }
        System.out.println("============================");
    }

}//class InformationList

public class Test2 {
    public static void main(String[] args) {

        //InformationList[] list = new InformationList[6];
        // InformationList[] != InformationList 이 둘은 같지 않다.
        //InformationList[] 선언시 list.add[?]()는 찾아도 list.read()는 호출할 수 없다.
        InformationList list = new InformationList(6);
        list.add(new Board("1","게시물1","현재 조회수는 10입니다.",10));
        list.add(new Product("100","웅진비데",300000));
        list.add(new Member("hong","홍길동","hong@a.com","010-222-2222"));
        list.add(new Board("2","게시물2","새로운 게시물을 추가합니다.",0));
        list.add(new Product("200","웅진정수기",1000000));
        list.add(new Member("lee","이철수","chul@b.com","010-333-3333"));

        list.read();
    }//main
}//Test

