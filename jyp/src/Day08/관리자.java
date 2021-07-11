package Day08;

public class 관리자 extends 회원{
	String 권한;

	public 관리자() {
		super();
		
	}

	public 관리자(String 아이디, String 비밀번호, String 권한) {
		super(아이디, 비밀번호);
		this.권한 = 권한;
		
	}

	@Override
	public void 정보() {
		super.정보();
		System.err.println("회원 권한 : "+this.권한);
	}
	
	
}
