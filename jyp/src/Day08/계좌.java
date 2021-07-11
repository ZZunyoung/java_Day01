package Day08;

import java.util.Scanner;

public class 계좌 {
	// 필드
	private String 계좌번호;
	private int 비밀번호;
	private String 계좌주;
	private int 금액;
	//생성자
	public 계좌() {
		
	}

	public 계좌(String 계좌번호, int 비밀번호, String 계좌주, int 금액) {
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.계좌주 = 계좌주;
		this.금액 = 금액;
	}
	public 계좌(String 계좌번호, int 비밀번호, String 계좌주) {
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.계좌주 = 계좌주;
		this.금액 = 0;
	}
	// 메소드
	public String get계좌번호() {
		return this.계좌번호;
	}
	public int get비밀번호() {
		return this.비밀번호;
	}
	
	public void 입금처리(int 입금액) {
		this.금액 +=입금액;
		System.err.println("[완료] 입금처리가 완료되었습니다.");
		System.out.println("현재 잔고 : " + this.금액);
	}
	public void 출금처리 (int 출금액) {
		if (출금액>this.금액) {
			System.err.println("[오류] 잔고가 부족합니다.");
			return;
		}
		this.금액 -= 출금액;
		System.err.println("[완료] 출금처리가 완료되었습니다.");
		System.out.println("현재 잔고 : " + this.금액);
	}
	public void 계좌생성() {
		System.out.println("계좌번호를 입력하세요 XXX-XXX-XX-XXXXXX : ");
		String 계좌번호 = Day08_7_ATM.scanner.next();
		System.out.println("비밀번호 네자리를 입력하세요 : ");
		int 비밀번호 = Day08_7_ATM.scanner.nextInt();
		System.out.println("계좌주를 입력하세요 : ");
		String 계좌주 = Day08_7_ATM.scanner.next();
//		//객체 생성
//		계좌 계좌 = new 계좌(계좌번호, 비밀번호, 계좌주);
//		//리스트 담기
//		Day08_7_ATM.계좌목록.add(계좌);
	}
	
	public void 입금() {
		System.out.println("------ 입금 화면 ------");
		System.out.print("계좌번호를 입력하세요 XXX-XXX-XX-XXXXXX : ");
		String 계좌번호 = Day08_7_ATM.scanner.next();
		System.out.print("비밀번호 네자리를 입력하세요 : ");
		int 비밀번호 = Day08_7_ATM.scanner.nextInt();
		System.out.print("입금액 : ");
		int 입금액 = Day08_7_ATM.scanner.nextInt();
		for (계좌 temp : Day08_7_ATM.계좌목록) {
			if (temp.get계좌번호().equals(계좌번호)&&temp.get비밀번호()==비밀번호) {
				// 자료형은 논리 연산자 / String은 equals 메소드
				temp.입금처리(입금액);
				return;
			}
			
		}
		System.out.println("[오류] 계좌번호나 비밀번호가 다릅니다.");

	}
	
	public void 출금() {
		System.out.println("------ 출금 화면 ------");
		System.out.print("계좌번호를 입력하세요 XXX-XXX-XX-XXXXXX : ");
		String 계좌번호 = Day08_7_ATM.scanner.next();
		System.out.print("비밀번호 네자리를 입력하세요 : ");
		int 비밀번호 = Day08_7_ATM.scanner.nextInt();
		System.out.print("출금액 : ");
		int 출금액 = Day08_7_ATM.scanner.nextInt();
		
		for (계좌 temp : Day08_7_ATM.계좌목록) {
			if (temp.get계좌번호().equals(계좌번호)&&temp.get비밀번호()==비밀번호) {
				// 자료형은 논리 연산자 / String은 equals 메소드
				temp.출금처리(출금액);
				return;
			}
		}
		System.out.println("[오류] 계좌번호나 비밀번호가 다릅니다.");
	}
	
	public void 이체() {
		System.out.println("------ 이체 화면 ------");
		System.out.print("계좌번호를 입력하세요 XXX-XXX-XX-XXXXXX : ");
		String 계좌번호 = Day08_7_ATM.scanner.next();
		System.out.print("비밀번호 네자리를 입력하세요 : ");
		int 비밀번호 = Day08_7_ATM.scanner.nextInt();
		for (계좌 temp : Day08_7_ATM.계좌목록) {
			if (temp.get계좌번호().equals(계좌번호)&&temp.get비밀번호()==비밀번호) {
		System.out.print("이체 금액 : ");
		int 이체금액 = Day08_7_ATM.scanner.nextInt();
		if (temp.금액 < 이체금액) {
			System.err.println("[오류] 예금액이 부족합니다.");
			return;
		}
		System.out.println("받으시는분의 계좌번호 : ");
		String 계좌번호2 = Day08_7_ATM.scanner.next();
		
		for (계좌 temp2 : Day08_7_ATM.계좌목록) {
			if (temp2.계좌번호.equals(계좌번호2)){
				temp2.금액 += 이체금액;
				System.err.println("[완료] 이체에 성공했습니다.");
				return;
			}
			System.err.println("[실패] 계좌번호나 비밀번호가 다릅니다.");
		}
			}

		}
	}
	
	public void 계좌찾기() {
		
	}

}
