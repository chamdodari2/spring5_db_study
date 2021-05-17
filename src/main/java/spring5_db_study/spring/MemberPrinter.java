package spring5_db_study.spring;

public class MemberPrinter {
	
	public void print(Member member) {  //한 멤버만 출력하는거. 리스트아님! 근데 전체멤버 출력해야하는디 멤버dao에 있는 목록을 가져와서 멤버프린틀르 그 갯수만큼 돌려주려면 새클래스 만들기 
		System.out.printf("회원 정보 : 아이디=%s, 이메일=%s, 이름=%s, 등록일=%tF %n",
				member.getId(),member.getEmail(),member.getName(),member.getRegisterDateTime());
	}

}
