package spring5_db_study.spring;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberListPrinter {
	
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private MemberPrinter printer;

	
//	public MemberListPrinter() {
//		// TODO Auto-generated constructor stub
//	}
//	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
//		this.memberDao = memberDao;
//		this.printer =printer;
//	}
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();  //members가 멤버를 가지고있는 컬렉션인데 그걸 넘겨서
		members.forEach(m->printer.print(m));
	}

}
