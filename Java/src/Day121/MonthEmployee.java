package Day121;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MonthEmployee {

	ArrayList getEmployees() {

		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pt = null;
		ArrayList emplyees = new ArrayList();
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection
					(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			//////////////////////////////////////////////////////////////// SQL 문 입력 구간

			Scanner key = new Scanner(System.in);
			System.out.print("제외할 월 : ");
			int month = key.nextInt();

			String sql = "Select Month(hire_date) as '입사일', SUM(salary) AS '급여총합' from employees where month(hire_date) != ? Group by 입사일";
			pt = con.prepareStatement(sql);
			pt.setInt(1, month);
			rs = pt.executeQuery();

			while (rs.next()){
				int getMonth = rs.getInt(1);
				int getTotal = rs.getInt(2);
				emplyees.add("입사월 : " + getMonth + "월, 급여총합:" + getTotal);
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
				pt.close();
				rs.close();
				con.close();
				System.out.println("연결 해제 성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return emplyees;
	}

	public static void main(String[] args) {
		ArrayList p = new MonthEmployee().getEmployees();
		for (int i = 0; i < p.size();i++) System.out.println(p.get(i).toString());
	}
}
