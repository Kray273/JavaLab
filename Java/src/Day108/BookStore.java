package Day108;

class Book{
    //Book 클래스의 제약조건
    //    1. 책 제목(title)과 가격(price)정보를 저장하는 멤버변수가 있어야 한다.
    //    2. 멤버변수는 모두 private 접근제한자를 가져야 한다.
    private String title; //책제목
    private int price; //가격
    //    3. 멤버변수를 모두 초기화하는 생성자 가 있어야 한다.
    Book(){ } //매개변수가 없는 new Book5는 set매서드를 통해 값을 대입하기에 수행하는 문장이 없다.
    Book(String title, int price){ //매개변수가 있는 new Book
        this.title = title;
        this.price = price;
    }

    //    4. 멤버변수에 값을 설정하고 리턴하는 setter/getter 메서드가 있어야 한다.
    //    5. setter/getter 메서드는 모두 public 접근제한자를 가져야 한다.
    //setTitle(String title) : 멤버변수 title 값을 셋팅하는 메소드
    public void setTitle(String title) {
        this.title = title;
    }
    //String getTitle() : 멤버변수 title 값을 반환하는 메소드
    public String getTitle() {
        return title;
    }
    //void setPrice(int price) : 멤버변수 price 값을 셋팅하는 메소드
    public void setPrice(int price) {
        this.price = price;
    }
    //int getPrice() : 멤버변수 price 값을 반환하는 메소드
    public int getPrice() {
        return price;
    }

}
class BookMgr extends Book{
    //BookMgr 클래스의 제약조건
    //    1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다.
    Book[] bookList; //Book이란 자료형을 가진 배열을 선언
    //    2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다.
    BookMgr(Book[] bookList) { //매개변수로 전달된 bookList를 배열인 자료형으로 받기
        this.bookList = bookList;
    } // 생성자 초기화
    //     3. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다.
    void printBooklist(){
        for(int i=0; i< bookList.length; i++){
            System.out.println(bookList[i].getTitle()); //get매서드를 이용해 bookList에 담긴 객체를 하나씩 출력
        }
    }
    //     4. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다.
    int total; // Total을 만들어줄 변수 선언
    void printTotalPrice(){
        for(int i=0; i < bookList.length; i++){
           total += bookList[i].getPrice(); // 반복으로 출력해서 하나씩 누적한다.
        }
        System.out.printf("전체 책 가격의 합 : %d", total);
    }
}


public class BookStore {
    public static void main(String[] args) {
        Book[] booklist = new Book[5];

        Book book1 = new Book("Java Program", 25000);
        Book book2 = new Book("JSP Program", 15000);
        Book book3 = new Book("SQL Fundamentals", 30000);
        Book book4 = new Book("JDBC Program", 28000);
        Book book5 = new Book();
        book5.setTitle("EJB Program");
        book5.setPrice(34000);
        booklist[0] = book1;
        booklist[1] = book2;
        booklist[2] = book3;
        booklist[3] = book4;
        booklist[4] = book5;

        BookMgr mgr = new BookMgr(booklist);
        System.out.println("=== 책 목록 ===");
        mgr.printBooklist();
        System.out.println("");
        System.out.println("=== 책 가격의 총합 ===");
        mgr.printTotalPrice();
    }
}