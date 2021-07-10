package Day07;

import java.util.Scanner;
import java.util.ArrayList;

public class Day07_2_Start {

	// 1. 다른 클래스에서 공통적인 메모리 => static
		// 1. scanner
	public static Scanner scan = new Scanner(System.in);
		// 2. 리스트나 배열
	public static ArrayList<Member> member = new ArrayList<>();
		// ArrayList : 리스트 클래스
			//<제네릭> : 리스트객체에 담을 객체의 클래스
				// 리스트명.add(객체명) : 리스트에 객체 담기
				// 리스트명.size() : 리스트내 객체 수
	
				// 리스트명.get(인덱스 번호) : 리스트내 인덱스 번호에 해당하는 객체 호출
	public static void main(String[] args) {
		
		프로그램시작();
	}
	
	// 프로그램 동작 메소드 
	public static void 프로그램시작() {
		// static : 정적변수 : 프로그램 시작시 메모리할당되고 모든 프로그램 종료시 메모리 초기화
			// 단점 : 메모리 효율 감소 [ 모든 클래스에 사용되는 메모리 선언 ]
		
		while(true) {
			System.out.println("---- 회원제 커뮤니티 ----");
			System.out.println("1. 로그인 2. 회원가입 3. 아이디찾기 4. 비밀번호찾기 5. 프로그램종료");
			System.out.print("---- 선택 : "); int 선택 = scan.nextInt();
			// 멤버 임시 객체
			Member member = new Member();
			if ( 선택 == 1 ) {
				
			}
			else if ( 선택 == 2 ) {
				member.회원가입();
			}
			else if ( 선택 == 3 ) {
				
			}
			else if ( 선택 == 4 ) {
	
			}
			else if ( 선택 == 5 ) {
				System.out.println("[종료] 이용해주셔서 감사합니다.");
				break;
			}
			else {
				System.out.println("[경고] 알수 없는 번호입니다.");
			}
		}
	}
}
