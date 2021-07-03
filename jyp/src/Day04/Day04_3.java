package Day04;


import java.util.Random;
import java.util.Scanner;

public class Day04_3 {
	
	// 가위바위보 게임
		// 1. 가위 바위 보 중 하나를 입력받아 승패 결정
		// 2. 컴퓨터는 랜덤 사용
		// 3. 게임 여러번 진행해서 최종 승리자
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int playerwin = 0;
		int comwin = 0;
		int game = 1;


		
//		while(true) { // 무한루프
//			System.out.println(game + "번째 게임");
//			System.out.println("가위 [ 0 ] 바위 [ 1 ] 보 [ 2 ] 게임종료 [ 4 ]중 선택 : ");
//			int player = scan.nextInt();
//			if (player == 0 ) System.out.println("플레이어는 가위를 선택했습니다.");
//			else if (player == 1 ) System.out.println("플레이어는 바위를 선택했습니다.");
//			else if (player == 2 ) System.out.println("플레이어는 보를 선택했습니다.");
//			else if (player == 4 ) System.out.println("게임 종료를 선택했습니다."); break;
//			
//			
//			// 컴퓨터 => 랜덤 이용한 난수생성 [ Random : 랜덤 관련된 메소드 제공 ]
//
//			Random random = new Random();
//			int com = random.nextInt(3);
//			if (com == 0 ) System.err.println("컴퓨터는 가위를 선택했습니다.");
//			else if (com == 1 ) System.err.println("컴퓨터는 바위를 선택했습니다.");
//			else if (com == 2 ) System.err.println("컴퓨터는 보를 선택했습니다.");
//
//			//이기는 경우 수 
//			
//			if ((player == 0 && com ==2 )||(player == 1 && com == 0)||(player == 2 && com == 1)) {
//				System.out.println("플레이어가 승리했습니다.");
//				playerwin +=1;
//			}
//			else if (player == com) {
//				System.out.println("비겼습니다.");
//			}
//			else {
//				System.out.println("컴퓨터가 승리했습니다");
//				comwin +=1;
//			}
//			System.out.println("현재 스코어 \n플레이어\t컴퓨터\n  "+playerwin+"\t  "+comwin);
//			
//			game +=1;
//			
//				
//			
//			
//		} // w end
//
//		System.out.println("-------게임종료-------");
//		System.out.println("플레이한 게임 횟수 : " + game);
//		if (comwin == playerwin)System.out.println("최종 결과는 무승부입니다.");
//		else if (comwin>playerwin)System.out.println("최종 승리자는 컴퓨터입니다.");
//		else System.out.println("최종 승리자는 플레이어입니다.");
		
	}
	
}
