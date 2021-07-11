package Day08;

import Day07.Day07_2_Start;
import Day07.Member;

public class 신한은행 extends 계좌 {

	private final int 은행코드 = 0000001;
		// final => 상수
	
	public 신한은행() {
		super();
	}

	public 신한은행(String 계좌번호, int 비밀번호, String 계좌주, int 금액) {
		super(계좌번호, 비밀번호, 계좌주, 금액);
	}

	public 신한은행(String 계좌번호, int 비밀번호, String 계좌주) {
		super(계좌번호, 비밀번호, 계좌주);
	}

	
	@Override
	public void 계좌생성() {
		// TODO Auto-generated method stub
		System.out.println("------ 신한은행 -------");

		System.out.print("계좌번호를 입력하세요 XXX-XXX-XX-XXXXXX : "); // 제어 : 중복제거
		String 계좌번호 = Day08_7_ATM.scanner.next();
		for(계좌 temp : Day08_7_ATM.계좌목록) {
			if(temp.get계좌번호().equals(계좌번호)){
				System.err.println("[실패] : 동일한 계좌번호가 존재합니다.");
				return; // 메소드 종료  : 메소드 반환 : 반환데이터 없음 
			}
		}
		System.out.print("비밀번호 네자리를 입력하세요 : "); // 제어 : 4글자 숫자
		int 비밀번호 = Day08_7_ATM.scanner.nextInt();
		//String s비밀번호 = Integer.toString(비밀번호); // 숫자열 => 문자열
		if ((int)( Math.log10(비밀번호)+1 )!= 4) {
			System.out.println("올바르지 않은 비밀번호 입니다.");
			return;
		}
		System.out.print("계좌주를 입력하세요 : ");
		String 계좌주 = Day08_7_ATM.scanner.next();
		
		신한은행 tmep = new 신한은행(계좌번호, 비밀번호, 계좌주);
		Day08_7_ATM.계좌목록.add(tmep);
		
		System.out.println("[성공] 계좌 생성이 완료 되었습니다.");
	}

	@Override
	public void 입금() {
		// TODO Auto-generated method stub
		super.입금();
	}

	@Override
	public void 출금() {
		// TODO Auto-generated method stub
		super.출금();
	}

	@Override
	public void 이체() {
		// TODO Auto-generated method stub
		super.이체();
	}

	@Override
	public void 계좌찾기() {
		// TODO Auto-generated method stub
		super.계좌찾기();
	}
	
}
	
	

