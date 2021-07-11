package Day08;

public class 회원 {

	String 아이디;
	String 비밀번호;
	
	public 회원() {
	}

	public 회원(String 아이디, String 비밀번호) {
		super();
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
	}
	
	public void 정보() {
		System.out.println("회원 아이디 : " + this.아이디);
		System.out.println("회원 비밀번호 : " + this.비밀번호);
	}
}
