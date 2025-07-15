package org.kosa.myproject.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * final field로 DataSource를 선언
 * Constructor Injection
 * 실제 DataSource를 이용해 spring_member table의 회원정보를 조회하여 회원 객체를 리턴한다
 */

@Repository
public class MemberDao {
    private final DataSource dataSource;
    // @Autowired
    MemberDao(DataSource dataSource) { // DI : Constructor Injection
    	super();
        this.dataSource = dataSource;
    }
    
    public MemberVo findMemberById(String memberId) throws SQLException {
		MemberVo memberVo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();
			String sql = "select id,password,name,address from spring_member where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();
			if (rs.next())
				memberVo = new MemberVo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
		} finally {
			closeAll(rs, pstmt, con);
		}
		return memberVo;
	}

	
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		closeAll(pstmt, con);
	}

	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close(); // 컨넥션을 소멸 시키는 것이 아니라 DBCP 에 컨넥션을 반납한다
	}
}
