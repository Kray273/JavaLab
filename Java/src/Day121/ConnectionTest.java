package Day121;

import java.sql.*;

public class ConnectionTest {
    //드라이버 재사용을 위해 변수
	//final static String DRIVER_CLASS = "org.mariadb.jdbc.Driver";
    //final static String JDBC_URL = "jdbc:mariadb://localhost:3306/empdb";
	//final static String USERNAME = "emp";
    //final static String PASSWORD = "emp";

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // 0. jdbc driver호출_ jdk비포함
            // 외부에 있기때문에 호출
//			Class.forName("org.mariadb.jdbc.Driver");
            Class.forName(ConnectionInform.DRIVER_CLASS);
            // 1.DB연동
            // 주소,계정,비번
            con = DriverManager.getConnection
                    (ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
//			Connection con = ("jdbc:mariadb://localhost:3306/empdb","emp","emp");
            System.out.println("연결 성공");

            //////////////////////////////////////////////////////////////// SQL 문 입력 구간

//            //SQL전송결과 검색 -SELECT * FROM EMP- 만약 예외발생하면 close가 안되기때문에 FINALLY로 보내기
            st= con.createStatement(); // sql저장 전송객체
//            // emp_copy 100 길동 홍 1000 now() 50
//            String sql = "insert into emp_copy values(400, '길동', '홍', 1000, now(),50)"; // jdbc드라이버에서 넣어줌
//
//            int rowcount = st.executeUpdate(sql);
//            System.out.println("삽입행의 갯수 =" + rowcount);

//            Scanner key = new Scanner(System.in);
//            System.out.print("상품명 : ");
//            String p_name = key.nextLine();
//            System.out.print("가격 : ");
//            int price = key.nextInt();
//            System.out.print("수량 : ");
//            int balance = key.nextInt();
//            String sql ="INSERT INTO product(p_name, price, balance)"
//                    + "values('"+ p_name +"'," + price  +","+ balance +")";

            // emp_copy테이블에서 사번 100 사원의 ,이름 신입(나머지) ,성 최(최소1글자) ,현재 급여 10000 인상
            // update테이블명 set 변경컬럼명 = 변경값 where 변경조건
//            Scanner key = new Scanner(System.in);
//            System.out.print("사번 : ");
//            String employee_id = key.nextLine();
//            System.out.print("변동 급여 : ");
//            int change = key.nextInt();
//            String sql ="UPDATE emp_copy SET salary = salary + " + change +" WHERE employee_id = " + employee_id;
//            int rowcount = st.executeUpdate(sql);
//            System.out.println("삽입행의 갯수 =" + rowcount);

//            String sql ="select employee_id, first_name, last_name, salary, hire_date from employees limit 5";
//            //조회 exequeteQuery  행과열의 2차원 테이블 구조
//            ResultSet rs = st.executeQuery(sql);
//            System.out.println("가져온값 =" + rs ); //rs.toString();
//            int line = 0;
//            while (rs.next()){
//                ++line;
//                int id = rs.getInt(1);
//                String name = rs.getString(2) + "-" + rs.getString(3);
//                double salary = rs.getDouble("salary");
//                java.sql.Date d = rs.getDate("hire_date");
//                String d2 = rs.getString(5);
//                System.out.printf("%d => 사번:%d, 이름:%s, 급여:%.2f, 입사일1: %s, 일사일2 : %s\n",line, id,name,salary,d,d2);
//            }

            // product 테이블에서 가격 1000000이상 레코드만 조회
//            String sql =
//            "select * from product where price >= 100000";
//            rs = st.executeQuery(sql);
//            int line = 0;
//            while (rs.next()){
//                ++line;
//                int id = rs.getInt("p_code");
//                String name = rs.getString("p_name");
//                double price = rs.getDouble("price");
//                int balance = rs.getInt("balance");
//                System.out.printf
//                ("%d => 코드:%d, 이름:%s, 가격:%.2f, 수량: %d\n",line, id,name,price,balance);
//            }

            String sql ="SHOW DATABASES";
            sql ="SHOW TABLES";
            sql ="DESCRIBE EMPLOYEES"; // 컬럼이름들
            rs = st.executeQuery(sql);

//            while(rs.next()) { // SHOW DATABASES
//                System.out.println(rs.getString(1));
//            }
            while(rs.next()) { // 널이아니면  값
                System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3));
            }

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
