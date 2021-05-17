package spring5_db_study.spring;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService {
	@Autowired
	private MemberDao memberDao;

public MemberRegisterService(MemberDao memberDao) {
		// TODO Auto-generated constructor stub
	}

	//	public MemberRegisterService(MemberDao memberDao) {
//		this.memberDao = memberDao;
//	}
	//정식멤버인지, 클라이언트가 등록위해서 요청한건지 구분가기위해서, 저장되기 전까지는  RegisterRequest로 보겠다.
	public Long regist(RegisterRequest req) {  //요기안에 Member로 안하는 이유: 폼에서 등록안했으면 레지스터리퀘스트 쓰고 정식으로 등록된거만 멤버로 할거다. 등록안된애는 멤버로 받지않겠다. (한번더 나눠서 세분화한거임 이게 유지보수에 더 좋다. 헷갈리지 않음)
		Member member = memberDao.selectByEmail(req.getEmail());
		if (member != null) {
			throw new DuplicateMemberException("dup email " + req.getEmail());
		}

		
		
		
		// 얘는 셀렉트나 인서트라서  하나만 하는거라 트랜잭션 안써야한다. 안써야할때 쓰면 안된다. 업데이트할때 는 두개 다 만지기때문에 트랜잭션 해주어야한당. 
		Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), LocalDateTime.now());
		memberDao.insert(newMember);
		return newMember.getId();
	}
}
