package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.DeptDTO;
import model.domain.EmpDTO;
import util.DBUtil;

class DeptDAO {
	// 모든 부서 검색 메소드
	// Query : "SELECT * FROM dept";
	public static ArrayList<DeptDTO> getAllDept() throws SQLException {	
		ArrayList<DeptDTO> allData = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		try {
		// step02
		// DB 연결
		// ip주소(Host), 포트번호, DB이름, User, Password ...
		conn = DBUtil.getConnection();
		// step03
		// SQL 문장 객체
		stmt = conn.createStatement();
		
		// step04
		// SQL문장 객체 실행 - 결과 반환
		rset = stmt.executeQuery("SELECT * FROM dept");
		
		// step05
		// Data 활용
		allData = new ArrayList<DeptDTO>();
		while(rset.next()) {
			allData.add(new DeptDTO(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc")));
		}
				
		// step06
		// DB 종료 *
		} finally {
			DBUtil.close(rset, stmt, conn);
		}
		return allData;
		
	}
	
	// 부서이름으로 특정 부서 검색 메소드
	public static DeptDTO getDept(String dname) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		DeptDTO selectedData = null;
		try {
//			getAllDept().stream().forEach(v -> {
//				if(dname.equals(v.getDname())) {
//					System.out.println(v);
//					selectedData = v;
//				}
//			});
			conn = DBUtil.getConnection();
			String sql = "SELECT * FROM dept WHERE dname = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);
			
			rset = pstmt.executeQuery();
			
			selectedData  = new DeptDTO();
			while(rset.next()) {
				selectedData = new DeptDTO(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			DBUtil.close(rset, pstmt, conn);
		}
		return selectedData;
	}
	
	// 부서 생성 메소드
	// Query : INSERT INTO dept  VALUES(deptno, dname, loc); -> pstmt
	
	public static boolean inserDept(DeptDTO dept) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement( "INSERT INTO dept  VALUES(?, ?, ?)");
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			int r = pstmt.executeUpdate();
			if(r != 0) {
				return true;
			}
			
		} finally {
			DBUtil.close(pstmt, conn);
		}
		
		return false;
		
	}
	
	public static boolean updateDept(int deptno, String loc) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "UPDATE dept SET loc = ? WHERE deptno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loc);
			pstmt.setInt(2, deptno);
			
			int result = pstmt.executeUpdate();
			if(result != 0) {
				return true;
			}
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		return false;
		
	}
	
	public static boolean deleteDept(int deptno) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			String sql = "DELETE FROM dept WHERE deptno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			int result = pstmt.executeUpdate();
			if(result != 0) {
				return true;
			}
		
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		return false;
	}
	
	public static ArrayList<EmpDTO> getEmpByDeptno(int deptno) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<EmpDTO> empData = null;
		
		try {	
			conn = DBUtil.getConnection();
			String sql = "SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm "
							+ "FROM emp e, dept d "
							+ "e.deptno = d.deptno "
							+ "WHERE d.deptno = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, deptno);
			rset = pstmt.executeQuery();
			
			System.out.println(rset);
			empData = new ArrayList<EmpDTO>();
//			while(rset.next()) {
//				empData = new EmpDTO(rset.getInt(e.empno));
//			}
		} finally {
			DBUtil.close(rset, pstmt, conn);
		}
		
		return null;
		
	}
	
	
	public static void main(String[] args) {
		try {
			// 모든 부서 검색
//			for(DeptDTO dept : getAllDept()) {
//				System.out.println(dept);
//			}
			
			// (부서번호로) 특정부서를 검색
//			System.out.println(getDept("ACCOUNTING"));
//			System.out.println(getDept("SALES"));
			
			// 부서 생성
			// boolean insertDept(Dept dept);
//			System.out.println(inserDept(new DeptDTO(50, "PROGRAMMING", "BUSAN")));
			
			// 부서 수정
			// (부서번호로) 검색한 해당 부서의 위치 수정
			// updateDept(50, "SEOUL") -> 50 SEOUL
//			System.out.println(updateDept(50, "SEOUL"));s
			
			// 부서 삭제
			// (부서 번호로) 검색한 해당 부서 삭제
//			System.out.println(deleteDept(50));
			
			// 부서 번호가 20인 사원들 검색
			// getEmpByDeptno
			System.out.println(getEmpByDeptno(20));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
