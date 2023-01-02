package Day122;

import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {
	int insertMember(MemberDTO dto) {
		Connection con= null;
		PreparedStatement pt = null;
		int count = 0;
		try {
		Class.forName(ConnectionInform.DRIVER_CLASS);
		//1.db 연결
		con = DriverManager.getConnection
		(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
		String sql = "insert into member values(?,?,?,?,?,?, now())";
		pt = con.prepareStatement(sql);
		pt.setString(1, dto.getId());
		pt.setString(2, dto.getPw());
		pt.setString(3, dto.getName());
		pt.setString(4, dto.getPhone());
		pt.setString(5, dto.getEmail());
		pt.setString(6, dto.getAddress());
		count =  pt.executeUpdate();
		//dto 전달 내용을 member 테이블 입력
		//회원가입일 now() 설정 
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pt.close();
				con.close();
			}catch(Exception e) {}
		}
		return count;
	}//insertMember end
	int getTotalMember() {
		Connection con= null;
		PreparedStatement pt = null;
		int count = 0;
		try {
		Class.forName(ConnectionInform.DRIVER_CLASS);
		//1.db 연결
		con = DriverManager.getConnection
		(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
		String sql = "select count(*) from member";//1행 1열(null / 숫자)
		pt = con.prepareStatement(sql);
		ResultSet rs = pt.executeQuery();
		rs.next();
		if(rs.getString("count(*)") == null) {
			count = 0;
		}
		else {
			count =  rs.getInt("count(*)");
		}
		//dto 전달 내용을 member 테이블 입력
		//회원가입일 now() 설정 
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pt.close();
				con.close();
			}catch(Exception e) {}
		}
		return count;
	}//getTotal	
	
	ArrayList<MemberDTO> getMemberList(int page, int memberPerPage) {
		ArrayList<MemberDTO> list = new ArrayList();
		Connection con= null;
		PreparedStatement pt = null;
		int count = 0;
		try {
		Class.forName(ConnectionInform.DRIVER_CLASS);
		//1.db 연결
		con = DriverManager.getConnection
		(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
		String sql = 
		"SELECT id, insert(pw, 2, char_length(pw)-1, repeat(\"*\",char_length(pw)-1 ) ) as pw, "
		+ " name, indate FROM MEMBER ORDER BY INDATE LIMIT ?, ?";//1행 1열(null / 숫자)
		pt = con.prepareStatement(sql);
		pt.setInt(1,  (page-1) * memberPerPage);// page=1,2, 3   0,3, 6인덱스 
		pt.setInt(2, memberPerPage );
		ResultSet rs = pt.executeQuery();
		while(rs.next()) {
			MemberDTO dto = new MemberDTO
					(rs.getString("id"), rs.getString("name"),rs.getString("indate") );	
			dto.setPw(rs.getString("pw"));
		  list.add(dto);
		}
		//dto 전달 내용을 member 테이블 입력
		//회원가입일 now() 설정 
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pt.close();
				con.close();
			}catch(Exception e) {}
		}
		return list;
	}//getMemberList	

	public MemberDTO getMember(String id, String pw) {
		Connection con = null;
		PreparedStatement pt = null;
		MemberDTO dto= null;

		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,
					ConnectionInform.PASSWORD);

			String sql = "SELECT * FROM member WHERE id =? ";
			pt = con.prepareStatement(sql);
			pt.setString(1, id);
//			pt.setString(2, pw);

			ResultSet rs = pt.executeQuery(); // select
			// rs.next() true 값이 하나여서 true라면 일치, 값이 있다

			if(rs.next()) {
				// db에서 pw가져옴
				String dbpw = rs.getString("pw");
				if(pw.equals(dbpw)) {
					// 암호도 맞다
					dto = new MemberDTO(rs.getString("id"), rs.getString("pw"),rs.getString("name"),
							rs.getString("email"),rs.getString("phone"),
							rs.getString("address"),rs.getString("indate"));
				}else {
					dto = new MemberDTO();
					dto.setId(rs.getString("id"));
					//암호가 다르면 id만 저장한 멤버객체리턴??
					System.out.println("암호 맞지않습니다. 다시 4번 입력하세요.");
				}

			}else { // id가 없다
				System.out.println("1번 가입부터하세요");
			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				pt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
}
