package spring5_db_study.spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainForAssembler {

//	private static Assembler assembler = new Assembler();
//
//
//	public static void main(String[] args) throws IOException {
//		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		while (true) {
//			System.out.println("명령어를 입력하세요:");
//			String command = reader.readLine();
//			if (command.equalsIgnoreCase("exit")) {
//				System.out.println("종료합니다.");
//				break;
//			}
//			if (command.startsWith("new ")) {
//				processNewCommand(command.split(" "));
//				continue;
//			} else if (command.startsWith("change ")) {
//				processChangeCommand(command.split(" "));
//				continue;
//			}
//			printHelp();
//		}
//	}
//
//	
//
//	private static void processNewCommand(String[] arg) {
//		if (arg.length != 5) {
//			printHelp();
//			return;
//		}
//		MemberRegisterService regSvc = assembler.getMemberRegisterService();   //  assembler.getMemberRegisterService();여기서 가져온다.  regSvg가 담고있는 내용 던져주는거임
//		RegisterRequest req = new RegisterRequest();
//		req.setEmail(arg[1]);
//		req.setName(arg[2]);
//		req.setPassword(arg[3]);
//		req.setConformpassword(arg[4]);
//		
//		if (!req.isPasswordEqualToConformPassword()) {  //패스워드랑 확인패스워드 일치하는지 확인
//			System.out.println("암호와 확인이 일치하지 않습니다.\n");
//			return;
//		}
//		try {//맞으면 등록
//			regSvc.regist(req); //regist안에는 insert있어서 그거호출된거임 문제 발생하면( 등록된 이메일 발생하면) 에러 던져주기
//			System.out.println("등록했습니다.\n");
//		} catch (DuplicateMemberException e) {// 강제하지않음 서비스단해서 해주는게맞음
//			System.out.println("이미 존재하는 이메일입니다.\n");
//		}
//	}
//
//	private static void processChangeCommand(String[] arg) {       //dto에 있는거처럼 네개를 어셈블러에서 가져와서, 각각 여기 넣어서
//		if (arg.length != 4) {
//			printHelp();
//			return;
//		}
//		ChangePasswordService changePwdSvc = 
//				assembler.getChangePasswordService();
//		try {
//			changePwdSvc.changePassword(arg[1], arg[2], arg[3]);
//			System.out.println("암호를 변경했습니다.\n");
//		} catch (MemberNotFoundException e) {
//			System.out.println("존재하지 않는 이메일입니다.\n");
//		} catch (WrongIdPasswordException e) {
//			System.out.println("이메일과 암호가 일치하지 않습니다.\n");
//		}
//	}
//
//	private static void printHelp() {
//		System.out.println();
//		System.out.println("잘못된 명령입니다. 아래 명령어 사용법을 확인하세요.");
//		System.out.println("명령어 사용법:");
//		System.out.println("new 이메일 이름 암호 암호확인");
//		System.out.println("change 이메일 현재비번 변경비번");
//		System.out.println();
//	}
}
