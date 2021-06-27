package Day04;

import java.util.Scanner;

public class Day04_2 {
	
	// 반복문을 이용한 별 출력
	// 문제 1 : 입력한 개수 만큼 별[*] 출력
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		// 문제1 : 입력한 개수 만큼 별[*] 출력
//		System.out.print( "문제1 정수 입력 : ");
//		int 문제1 = scanner.nextInt();
//		for (int i = 1 ; i <= 문제1 ; i++) {
//			System.out.print("*");
//		}
//		// i는 1부터 입력받은 수까지 i는 1씩증가하면서 반복
//		System.out.println("\n------------");
//		
//		// 문제2 : 입력한 개수만큼 별 [*] 출력 / 단 5개마다 줄바꿈
//		System.out.print( "문제2 정수 입력 : ");
//		int 문제2 = scanner.nextInt();
//		for (int i = 1 ; i <= 문제2 ; i++) {
//			System.out.print("*");
//			if(i%5 == 0) {
//				System.out.println();	// 5의 배수마다 줄바꿈
//			}
//		}
//		
//		System.out.println("\n------------");
//		
		// 문제3 : 입력한 줄 만큼 별 삼각형 출력
//		System.out.print( "문제3 정수 입력 : ");
//		int 문제3 = scanner.nextInt();
//		for (int i = 1 ; i <= 문제3 ; i++) {
//			for (int j = 1 ; j <=i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		// 문제4 : 문제3번 반대로 출력
//		System.out.print( "문제4 정수 입력 : ");
//		int 문제4 = scanner.nextInt();
//		for (int i = 1 ; i <= 문제4 ; i++) {
//			for (int j = 1 ; (문제4 - i+1)>=j  ; j ++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// 문제5
//		System.out.print( "문제5 정수 입력 : ");
//		int 문제5 = scanner.nextInt();
//		for (int i = 1 ; i <= 문제5 ; i++) {
//			for (int j = 1; j <= (문제5 - i ); j++) {
//				System.out.print(" ");
//				}
//			for (int j = 1 ; j <=i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// 문제6
//		System.out.print( "문제6 정수 입력 : ");
//		int 문제6 = scanner.nextInt();
//		for (int i = 1 ; i <= 문제6 ; i++) {
//			for(int j = 1; j < i ; j ++) {
//				System.out.print(" ");
//			}
//			for (int j = 1 ; (문제6 - i+1)>=j  ; j ++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
		// 문제7
//		System.out.print("문제7 정수 입력 : ");
//		int 문제7 = scanner.nextInt();
//		for(int i = 1 ; i < 문제7 ; i++) {
//			for(int j = 1 ; j<(문제7-i); j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1 ; j<=(2*i-1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// 문제8
//		System.out.print("문제8 정수 입력 : ");
//		int 문제7 = scanner.nextInt();
//		for(int i = 1 ; i < 문제8 ; i++) {
//			for(int j = 1 ; j<(문제8-i); j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1 ; j<=(2*i-1); j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
		// 문제9
//		System.out.print("문제9 정수 입력 : ");
//		int 문제9 = scanner.nextInt();
//		for(int i = 1 ; i <= 문제9 ; i++) {
//			for(int j = 1 ; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1 ; j<=2*문제9-(2*i-1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// 문제10
		System.out.print("문제10 정수 입력 : ");
		int 문제10 = scanner.nextInt();
		for (int i = 1 ; i < 문제10-1 ; i++) {
			for (int j =1 ; j < i ; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j =1 ; j<= (2*문제10 -2*i)-3  ; j++) {
				 System.out.print(" ");
			 }
			System.out.println("*");
			if (i == 문제10 - 2) {
				for (int j = 1 ; j<문제10-1; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
		for (int i = 1 ; i < 문제10 - 1 ; i++) {
			for (int j = 1 ; j< 문제10 - 1 - i ; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 1 ; j<=2*i-1   ; j++) {
				 System.out.print(" ");
			}
			System.out.println("*");
			
		}
		
	}
}
