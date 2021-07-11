package Day08;

public class 국민은행 extends 계좌{

	private final int 은행코드 = 0000002;

	public 국민은행() {
		super();
	}

	public 국민은행(String 계좌번호, int 비밀번호, String 계좌주, int 금액 ) {
		super(계좌번호, 비밀번호, 계좌주, 금액);

	}
	public 국민은행(String 계좌번호, int 비밀번호, String 계좌주) {
		super(계좌번호, 비밀번호, 계좌주);
	}

	@Override
	public void 계좌생성() {
		System.out.println("------ 국민은행 -------");

		System.out.print("계좌번호를 입력하세요 XXX-XXX-XX-XXXXXX : ");
		String 계좌번호 = Day08_7_ATM.scanner.next();
		System.out.print("비밀번호 네자리를 입력하세요 : ");
		int 비밀번호 = Day08_7_ATM.scanner.nextInt();
		System.out.print("계좌주를 입력하세요 : ");
		String 계좌주 = Day08_7_ATM.scanner.next();
		
		국민은행 tmep = new 국민은행(계좌번호, 비밀번호, 계좌주);
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
