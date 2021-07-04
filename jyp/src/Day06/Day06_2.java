package Day06;

import java.util.Scanner;

public class Day06_2 {
	public static void main(String[] args) {
		// 1. 회원제 프로그램
			// 1. 최대 100명 회원 저장 배열 [ 2차원 배열 ]
				// 1. 아이디, 비밀번호
			// 2. 무한루프 [ 메뉴 ]
				// 1. 회원가입 [ 중복 아이디x ]
				// 2. 로그인
				// 3. 종료
			// 3. 무한루프 [ 로그인시 ]
				// 1. 회원탈퇴, 패스워드변경 , 로그아웃 [ 초기메뉴로 ]
		String [][] 회원목록 = new String[100][2];
									// [행 = 회원수][열 = 아이디, 비밀번호]
		// 입력객체
		Scanner scan = new Scanner(System.in);
		// 초기메뉴 => 무한루프
		while(true) {
			System.out.println("------ 회원제 프로그램 ------");
			System.out.println("1. 회원가입 2. 로그인 3. 종료");
			int 메뉴 = scan.nextInt();
			if (메뉴 == 1) { // 회원가입 : 아이디, 비밀번호 입력받아 배열에
				System.out.println("------ 회원가입 화면 ------");
				System.out.print("회원가입할 아이디를 입력하세요 : ");
				String 아이디 = scan.next();
					//중복체크
				int 중복체크 = 0; // 중복 기본값
				for (int i = 0 ; i < 회원목록.length; i++) {
					if ( 회원목록 [i][0]!=null&&회원목록[i][0].equals(아이디)) {
						System.out.println("\n[ 실패 ] 이미 존재하는 아이디입니다.");
						중복체크 = 1;
						break;
					}
				}
				if (중복체크 == 0) { // 중복이 없는 경우
					System.out.print("비밀번호를 입력하세요 : ");
					String 비밀번호 = scan.next();
					// 입력받은 값을 배열에 저장
					for (int i = 0; i < 회원목록.length; i ++) {
						// i 는 0부터 최대 회원수만큼 1씩 증가 반복
						if (회원목록 [i][0] == null) { // i번째 행의 아이디가 null 이면 
							회원목록[i][0] = 아이디;		// 아이디 저장
							회원목록[i][1] = 비밀번호;	// 비밀번호 저장
							System.err.println("\n [ 완료 ] 회원가입이 되었습니다.");
							break; // 저장후 반복문 끝내기
						}
					}
				}
				if (중복체크 == 1) {
					
				}
			}
			if (메뉴 == 2) {
				System.out.println("------ 로그인 화면 -------");
				System.out.print("아이디를 입력해주세요 : ");
				String 아이디 = scan.next();
				System.out.println("비밀번호를 입력해주세요 : ");
				String 비밀번호 = scan.next();
				
				int 로그인여부 = 0;
				for (int i = 0 ; i < 회원목록.length ; i++) {
					if (회원목록[i][0]!=null&&회원목록[i][0].equals(아이디)&&회원목록[i][1].equals(비밀번호)) {
						System.err.println("\n [ 로그인 성공 ] 로그인 되었습니다.");
						로그인여부 = 1;
						System.out.println("------ 회원목록 ------");
						System.out.println("\t아이디\t비밀번호");
						for(int j = 0 ; j < 회원목록.length ; j++) {
							if (회원목록[j][0]!=null) {
								System.out.println("\t"+회원목록[j][0]+"\t"+회원목록[j][1]);
							}
						}
						while (true) {
							System.out.print("1. 회원탈퇴 2. 패스워드 변경 3. 로그아웃"); int 선택2 = scan.nextInt();
							if (선택2 == 1) { // 기존 회원을 null로 변경 [ 탈퇴된 회원 기준으로 뒤 회원들 한칸씩 당기기
									// i는 현재 로그인된 회원의 인덱스
								회원목록[i][0]=null;
								회원목록[i][1]=null;
								
									// 탈퇴한 회원 기준으로 뒤에 있는 회원들은 한칸씩 당기기
								for ( int h = i ; h < 회원목록.length ; h++) {
									if(회원목록[h+1][0]!=null) {// 다음 회원이 있으면
										회원목록[h][0]=회원목록[h+1][0];	// 한칸씩 당기기
										회원목록[h][1]=회원목록[h+1][1];	// 한칸씩 당기기
									}
									else {
										회원목록[h][0] = null;
										회원목록[h][1] = null;
										break;
									}
								}
								System.err.println("\n [ 회원탈퇴 ] 회원탈퇴 되었습니다.");
								break;
							}
							if (선택2 == 2) {
								System.out.print("변경할 비밀번호를 입력해주세요 : ");
								회원목록[i][1]=scan.next();
								System.err.println("\n [ 비밀번호 변경 ] 비밀번호가 변경되었습니다.");
								
							}
							if (선택2 == 3) {
								System.err.println("\n [ 로그아웃 ] 로그아웃 되었습니다.");
								break;
							}
						}
					}
				}
				
			}
			if (메뉴 == 3) {
				System.err.println("[ 종료 ]");
				break; // 가장가까운 반복문 탈출
			}
			else {
				System.out.println("");
			}
		}
		
	}
}
