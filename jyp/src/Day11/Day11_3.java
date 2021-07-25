package Day11;

import java.util.Scanner;

public class Day11_3 {

	
	public static void main(String[] args) {
		
		
		// 문제1 : 무한루프에서 번호를 계속 입력받기
			// 예외 발생 : 문자입력시 예외처리 발생

		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("번호를 입력해주세요 : ");
			try {
			int 번호 = scanner.nextInt();
			}
			catch(Exception e) {
			System.out.println("정수만 입력 가능합니다.");
			}
		}
	}
}
