package Day121;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementTest {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName(ConnectionInform.DRIVER_CLASS);
            con = DriverManager.getConnection
                    (ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
            System.out.println("연결 성공");
            //////////////////////////////////////////////////////////////// SQL 문 입력 구간

            Scanner key = new Scanner(System.in);
            System.out.print("상품명 : ");
            String p_name = key.nextLine();
            System.out.print("가격 : ");
            int price = key.nextInt();
            System.out.print("수량 : ");
            int balance = key.nextInt();
            key.nextLine();

            String sql = "Insert into product(p_name, price, balance)values (?,?,?)";
            PreparedStatement pt = con.prepareStatement(sql);
            pt.setString(1, p_name);
            pt.setInt(2,price);
            pt.setInt(3,balance);
            pt.executeUpdate();

            System.out.print("Code : ");
            String code = key.nextLine();

            sql = "Select * from product where p_code = ?";
            pt = con.prepareStatement(sql);
            pt.setString(1, code);
            rs = pt.executeQuery();

            while (rs.next()){
                int getCode = rs.getInt(1);
                String getName = rs.getString(2);
                int getPrice = rs.getInt(3);
                int getBalance = rs.getInt(4);
                System.out.printf("코드:%d, 이름:%s, 가격:%d, 수량: %d\n",getCode,getName,getPrice,getBalance);
            }


            pt.close();

            ////////////////////////////////////////////////////////////////
        } catch (ClassNotFoundException e) {
            System.out.println("해당드라이버가 발견되지않습니다.");
        } catch (SQLException e) {
            e.printStackTrace(); //sql 오류를 자바에서 보여줌
            System.out.println("연결정보를 확인하세요");
        } finally {
            // 2.연결 해제
            try {
                con.close();
                System.out.println("연결 해제 성공");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
