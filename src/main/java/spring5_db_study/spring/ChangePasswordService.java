package spring5_db_study.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class ChangePasswordService {
	
	@Autowired
	private MemberDao memberDao;  //여기 필드에있으면 계속 dao 가리키고있어서 연관관계!! 실선
								  // 연관관계도 세분화하면 두개로 나뉘어진다. 채워진 마름모에 화살표있는거랑, 빈마름모에 화살표있는거
		//원래는 서비스도 인터페이스 따로 만들어야하는디
	
	
	
	
	
	
	//public void setMemberDao(MemberDao memberDao) { //여기 안에만 있으면 점선! 의존관계! 얘가 수해되고나면 사라짐
		//변경하고자 하는 서비스가 이메일에 존재하는앤지 검색해서 패스워드 변경
	//	this.memberDao = memberDao;
	//}
	
	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		if (member == null)
			throw new MemberNotFoundException();
		
		member.changePassword(oldPwd, newPwd); //원래 여기에 true면 업데이트 해야하는거임. 그리고 여기도 예외처리 해야한다.
		memberDao.update(member); 
	}






	public void setMemberDao(MemberDao memberDao) {
		// TODO Auto-generated method stub
		
	}

	
}
