package Day123_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class ConnectionInform {
	public final static String DRIVER_CLASS = "org.mariadb.jdbc.Driver";
	public final static String JDBC_URL = "jdbc:mariadb://localhost:3306/memberdb";
	public final static String USERNAME = "jdbc";
	public final static String PASSWORD = "jdbc";
}

public class BookDAO {
	void input(){
		BookDTO dto = new BookDTO();
		dto.setBookNo("B004");
		dto.setBookTitle("자바스크립트");
		dto.setBookAuthor("강길동");
		dto.setBookYear("2020-01-01");
		dto.setBookPrice(28000);
		dto.setBookPublisher("새싹출판사");
		insertBook(dto);
	}

	public void insertBook(BookDTO bookDTO)  {
		Connection con = null;
		PreparedStatement pt = null;
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection
					(ConnectionInform.JDBC_URL,ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
			String sql = "insert into book values(?,?,?,?,?,?)";

			pt = con.prepareStatement(sql);
			pt.setString(1, bookDTO.getBookNo());
			pt.setString(2, bookDTO.getBookTitle());
			pt.setString(3, bookDTO.getBookAuthor());
			pt.setString(4, bookDTO.getBookYear());
			pt.setInt(5, bookDTO.getBookPrice());
			pt.setString(6, bookDTO.getBookPublisher());
			int result = pt.executeUpdate();
			System.out.println(result + " 명의 회원정보 입력 완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pt.close();
				con.close();
			} catch (Exception e) {
			}
		}
	}

	public void selectBook(){
		Connection con = null;
		PreparedStatement pt = null;
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			//1.db 연결
			con = DriverManager.getConnection
					(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,ConnectionInform.PASSWORD);
			String sql =
					"SELECT bookNo, bookTitle, bookAuthor, Year(bookYear) as bookYear, bookPrice, bookPublisher FROM book";
			pt = con.prepareStatement(sql);

			ResultSet rs = pt.executeQuery();
			System.out.println("도서번호  도서명  저자  출판년도  가격  출판사  발행월");
			System.out.println("-------------------------------------------------------");
			while (rs.next()){
				System.out.println(rs.getString("bookNo") + " " +  rs.getString("bookTitle") + " "
				+ rs.getString("bookAuthor")+ " " + rs.getString("bookYear") + " "
				+ rs.getInt("bookPrice") + " " + rs.getString("bookPublisher"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pt.close();
				con.close();
			} catch (Exception e) {
			}
		}
	}

}
