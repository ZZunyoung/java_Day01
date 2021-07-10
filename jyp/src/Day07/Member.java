package Day07;

public class Member {

	
	// 필드
	String 아이디;
	String 비밀번호;
	String 이름;
	int 성별;
	String 이메일;
	int 전화번호;
	int 포인트;
	String 등급;
	
	// 생성자
	// 1. 빈생성자
	public Member() {
	}
	// 2. 전체 필드를 갖는 생성자
		// 마우스 우클릭 => source => 생성자 혹은 메소드 등 자동완성
	public Member(String 아이디, String 비밀번호, String 이름, int 성별, String 이메일, int 전화번호, int 포인트, String 등급) {
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
		this.이름 = 이름;
		this.성별 = 성별;
		this.이메일 = 이메일;
		this.전화번호 = 전화번호;
		this.포인트 = 포인트;
		this.등급 = 등급;
	}
	// 3. 회원가입시 필수로 들어가는 생성자
	public Member(String 아이디, String 비밀번호, String 이름, int 성별, int 전화번호) {
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
		this.이름 = 이름;
		this.성별 = 성별;
		this.전화번호 = 전화번호;
		this.포인트 = 0;
		this.등급 = "일반";
	}
	
	
	// 메소드 [ 행동 ]
	// 1. 회원가입 메소드
	public void 회원가입() {
		
		System.out.println("---- 회원가입 화면 ----");
		System.out.print("아이디 : "); String 아이디 = Day07_2_Start.scan.next();
			//아이디 중복 체크
		for (int i = 0; i < Day07_2_Start.member.size();i++) {
			Member temp = Day07_2_Start.member.get(i);
			if (temp.아이디.equals(아이디)) {
				System.err.println("[경고] 동일한 아이디가 존재합니다.");
				return; // 메소드 종료 : 메소드 반환 : 변환 데이터 없음
			}
		}
		System.out.print("비밀번호 : "); String 비밀번호 = Day07_2_Start.scan.next();
		System.out.print("이름 : "); String 이름 = Day07_2_Start.scan.next();
		System.out.print("성별 [남-1 / 여-2 / 미설정-0] : "); int 성별 = Day07_2_Start.scan.nextInt();
		System.out.print("휴대전화 [- 제외] : "); int 휴대전화 = Day07_2_Start.scan.nextInt();
		
		// 객체 만들기
		Member member = new Member(아이디, 비밀번호, 이름, 성별, 휴대전화);

		// 리스트 혹은 배열에 저장
		Day07_2_Start.member.add(member);
		
		// 회원가입 성공
		System.out.println("[성공] 회원가입에 성공했습니다.");
	}
	// 2. 로그인 메소드
	public void 로그인() {
		
	}
	// 3. 아이디찾기 메소드
	public void 아이디찾기() {
		
	}
	// 4. 비밀번호 찾기 메소드
	public void 비밀번호찾기() {
		
	}
	// 5. 포인트 증가 메소드
	public void 포인트증가() {
		
	}
	// 6. 등급 증가 메소드
	public void 등급증가() {
		
	}
	// 7. 회원 탈퇴 메소드
	public void 회원탈퇴() {
		
	}
	// 8. 회원 수정 메소드
	public void 회원수정() {
		
	}
	
	
	
	
	
	
}
