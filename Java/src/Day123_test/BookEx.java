package Day123_test;

class Book{
    String bookNo, bookTitle, bookAuthor,  bookPublisher;
    int bookYear, bookPrice;

    public Book(String bookNo, String bookTitle, String bookAuthor, String bookPublisher, int bookYear, int bookPrice) {
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.bookYear = bookYear;
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return bookNo + "       " + bookTitle + "   " + bookAuthor + "   " + bookYear+ "   "
                + "   " + bookPrice + "   " + bookPublisher ;
    }
}

class Magazine extends Book{
    int month;
    public Magazine(String bookNo, String bookTitle, String bookAuthor, String bookPublisher, int bookYear, int bookPrice, int month){
        super(bookNo, bookTitle, bookAuthor, bookPublisher, bookYear, bookPrice);
        this.month = month;
    }

    @Override
    public String toString() {
        return bookNo + "       " + bookTitle + "   " + bookAuthor + "   " + bookYear+ "   "
                + "   " + bookPrice + "   " + bookPublisher + "   " + month;
    }

}

class BookList{
    Book[] list;
    int length;
    int count;
    BookList(int length){
        this.length = length;
        this.list = new Book[length];
    }

    void add(Book stb){
        if(count >= list.length) return;
        list[count++] = stb; //전달받은 instance의 주소값을 저장
    }

    public void read(){
        System.out.println("도서번호   도서명           저자     출판년도  가격    출판사       발행월");
        System.out.println("--------------------------------------------------------------------------------");
        for(int i=0; i < list.length; i++){
            System.out.println(list[i].toString());
        }

    }

}
public class BookEx  {
    public static void main(String[] args) {
        BookList bl = new BookList(6);
        bl.add(new Book("B001","자바프로그래밍","홍길동","서울출판사",2021,30000));
        bl.add(new Book("B002","데이터베이스  ","이몽룡","대한출판사",2020,25000));
        bl.add(new Book("B003","HTML/CSS      ","성춘향","민국출판사",2022,18000));
        bl.add(new Magazine("M001","자바 월드     ","홍길동"," 서울출판사",2021,3000,5));
        bl.add(new Magazine("M002","웹 월드       ","이몽룡"," 서울출판사",2021,2500,7));
        bl.add(new Magazine("M003","게임 월드     ","성춘향"," 서울출판사",2022,1000,9));
        bl.read();



    }
}
