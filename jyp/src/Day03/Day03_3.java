package Day03;

import java.util.Scanner;

public class Day03_3 {
	
	// 게임에서 상점 이용하기 프로그램 
		// 조건1: 한명 회원 [ 아이디:qwe 비밀번호 : 1234 ]
			// 로그인창 만들어서 아이디와 비밀번호를 입력받아 동일한 경우 상점 이용 하기 
				// 동일하지 않으면 로그인 실패 
		//조건2 : 기존 5000원 가지고 있음 
				//상품 : 1. 물약 [100원] 2. 과일 [200원] 3. 장신구[300원]
					//장바구니: 상품 번호를 입력받아 장바구니에 담기 => 결제 
	
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {//while 문 시작 괄호 < while 문 안 문장은 들여쓰기 해주는것이 좋다. => 무한루프를 끝내는것은 break 문이다.>
			String id;
			int password;
			System.out.println("--------> 로그인 창");
			System.out.print("아이디를 입력해주세요:");
			id = sc.next();
			System.out.print("비밀번호를 입력해주세요");
			password = sc.nextInt();
			// 조건 1: 아이디[ qwe ] 비밀번호 [1234] 인 경우에만 로그인 성공 
				if(id.equals("qwe")&& (password==1234)){
					System.out.println("------->로그인 성공");
					
					//조건2: 상품 이용하기 
					int 금액 = 5000;// 5000원 추가 
					int 물약구매수 = 0;
					int 과일구매수 = 0;
					int 장신구구매수 = 0;
					System.out.println("-----> 상품 쇼핑");
					while(true) {
						System.out.println(" 1. 물약 [100원] 2. 과일 [200원] 3. 장신구[300원] 4. 결제");
						int 선택 = sc.nextInt();
						if( 선택 == 1) {
							System.out.println("물약을 장바구니에 담았습니다.");
							물약구매수++; //물약구매수+=1// 물약구매수 = 물약구매수 +1 --> 다 같은의미 
						}
						if( 선택 == 2) {
							System.out.println("과일을 장바구니에 담았습니다.");
							과일구매수++; }
						if( 선택 == 3) {
							System.out.println("장신구를 장바구니에 담았습니다.");
							장신구구매수++; 
							}
						if( 선택 == 4) {
							System.out.println("-----> 장바구니 현황");
							System.out.println("제품\t수량\t금액");
							if(물약구매수 != 0) 
								System.out.println("물약\t"+물약구매수+"\t"+ 물약구매수*100);
							if(과일구매수 != 0) 
								System.out.println("과일\t"+과일구매수+"\t"+ 과일구매수*200);
							if(장신구구매수 != 0) 
								System.out.println("장신구\t"+장신구구매수+"\t"+ 장신구구매수*300);
							if (물약구매수==0&&과일구매수==0&&장신구구매수==0)
								System.out.println("------> 장바구니에 제품이 없습니다.");
							System.out.println("총 결제액 : "+((물약구매수*100)+(과일구매수*200)+(장신구구매수*300)));
							break; // 반복문 탈출 => 가장 가까운 while 혹은 for 의 괄호 나가기
						}	
					}
				}
				else 
					System.out.println("아이디 혹은 비밀번호가 다릅니다.");
		} //while 반복문 끝 괄호 
			
			
			
			
			
			
			
			
			
			
	}
}