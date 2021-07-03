package Day05;

import java.util.Scanner;

public class Day05_3_틱택토 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		// 판 생성
		String[] 게임판 = {"[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]"};
		
		// 게임판 출력
		while(true) {
			for (int i = 0; i < 게임판.length ; i++){
				//3개씩 출력 줄바꿈
				System.out.print(게임판[i]);
				if (i %3 == 2 )System.out.println();
				}
			// 플레이어에 입력받아 해당 위치에 알 두기
			System.out.print("[선택] 두고자 하는 위치 :");
			int 플레이어 = scanner.nextInt(); // 인덱스
			게임판 [플레이어] = "[O]"; // 입력받은 인덱스에 알 두기
		}
		
	}
}