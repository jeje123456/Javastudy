package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.Vector;

public class MemberMgr {

	private DBConnectionMgr pool;
	
	public MemberMgr() {
		try {
			pool = DBConnectionMgr.getInstance();
			// Connection con = pool.getConnection(); 
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println("실패");
			e.printStackTrace();
		}
	} // MemberMgr
	
	// 우편번호 검색, 제네릭 : Vector에서 저장하는 타입의 지정
	public Vector<ZipcodeBean> zipcodeRead(String area3){
		// DB연동에 필요한 변수 선언
		// DB 연동은 공식이 있다.
		// java.sql 패키지 클래스
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<ZipcodeBean> vlist = new Vector<ZipcodeBean>();
		try {
			// DB 연결 객체
			// DBConnectionMgr 생성 -> Connection 만들어짐
			// 필요한곳에 빌려주고 반납받는 기법 : 풀링기법(pool)
			con = pool.getConnection(); // 빌려옴(pool 기법)
			sql = "SELECT * FROM tblzipcode WHERE area3 LIKE ?";
			// aql문을 매개변수로 pstmt 객체를 리턴
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,"%"+area3+"%"); // 1이가 sql문에 ? 순서를 뜻함
			rs = pstmt.executeQuery(); // sql문 실행
			while(rs.next()) {
				String str = rs.getString(1) + "\t";
				str += rs.getString(2)+ "\t";
				str += rs.getString(3)+ "\t";
				str += rs.getString(4)+ "\t";
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, null, rs);
		}
		return vlist;
	}
	
	public static void main(String[] args) {
		MemberMgr mgr = new MemberMgr();
		//mgr.zipcodeRead("강남대로");
		Scanner scanner = new Scanner(System.in);
		System.out.println("도로명을 입력해주세요 : ");
		String x = scanner.nextLine();
		scanner.close();
		mgr.zipcodeRead(x);
	}
}
