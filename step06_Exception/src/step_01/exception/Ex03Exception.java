package step_01.exception;

import exception.NotAdminException;

public class Ex03Exception {
	/*	관리자 계정 검증
	 * - 고려사항
	 * 	- 관리자인 경우 : 정상실행("관리자 계정 접속 성공")
	 * 	- 관리자가 아닌 경우 : 비정상 실행 -> Exception를 상속받아
	 * 			사용자 정의 예외
	 * 	- NotAdminException
	 */
	
	public static void checkAdmin(String id) throws NotAdminException {
		if("admin".equals(id)) {
			System.out.println("관리자 계정 접속 성공");
		} else {
			//예외 발생 시키기 : throw new xxxException
			throw new NotAdminException("관리자 계정 연결 실패");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkAdmin("aadmin");
		} catch (NotAdminException e) {
			e.printStackTrace();
		}
	}

}
