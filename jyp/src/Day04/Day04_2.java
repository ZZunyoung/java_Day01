package Day04;

import java.util.Scanner;

public class Day04_2 {
	
	// �ݺ����� �̿��� �� ���
	// ���� 1 : �Է��� ���� ��ŭ ��[*] ���
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		// ����1 : �Է��� ���� ��ŭ ��[*] ���
//		System.out.print( "����1 ���� �Է� : ");
//		int ����1 = scanner.nextInt();
//		for (int i = 1 ; i <= ����1 ; i++) {
//			System.out.print("*");
//		}
//		// i�� 1���� �Է¹��� ������ i�� 1�������ϸ鼭 �ݺ�
//		System.out.println("\n------------");
//		
//		// ����2 : �Է��� ������ŭ �� [*] ��� / �� 5������ �ٹٲ�
//		System.out.print( "����2 ���� �Է� : ");
//		int ����2 = scanner.nextInt();
//		for (int i = 1 ; i <= ����2 ; i++) {
//			System.out.print("*");
//			if(i%5 == 0) {
//				System.out.println();	// 5�� ������� �ٹٲ�
//			}
//		}
//		
//		System.out.println("\n------------");
//		
		// ����3 : �Է��� �� ��ŭ �� �ﰢ�� ���
//		System.out.print( "����3 ���� �Է� : ");
//		int ����3 = scanner.nextInt();
//		for (int i = 1 ; i <= ����3 ; i++) {
//			for (int j = 1 ; j <=i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		// ����4 : ����3�� �ݴ�� ���
//		System.out.print( "����4 ���� �Է� : ");
//		int ����4 = scanner.nextInt();
//		for (int i = 1 ; i <= ����4 ; i++) {
//			for (int j = 1 ; (����4 - i+1)>=j  ; j ++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// ����5
//		System.out.print( "����5 ���� �Է� : ");
//		int ����5 = scanner.nextInt();
//		for (int i = 1 ; i <= ����5 ; i++) {
//			for (int j = 1; j <= (����5 - i ); j++) {
//				System.out.print(" ");
//				}
//			for (int j = 1 ; j <=i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// ����6
//		System.out.print( "����6 ���� �Է� : ");
//		int ����6 = scanner.nextInt();
//		for (int i = 1 ; i <= ����6 ; i++) {
//			for(int j = 1; j < i ; j ++) {
//				System.out.print(" ");
//			}
//			for (int j = 1 ; (����6 - i+1)>=j  ; j ++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
		// ����7
//		System.out.print("����7 ���� �Է� : ");
//		int ����7 = scanner.nextInt();
//		for(int i = 1 ; i < ����7 ; i++) {
//			for(int j = 1 ; j<(����7-i); j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1 ; j<=(2*i-1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// ����8
//		System.out.print("����8 ���� �Է� : ");
//		int ����7 = scanner.nextInt();
//		for(int i = 1 ; i < ����8 ; i++) {
//			for(int j = 1 ; j<(����8-i); j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1 ; j<=(2*i-1); j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
		// ����9
//		System.out.print("����9 ���� �Է� : ");
//		int ����9 = scanner.nextInt();
//		for(int i = 1 ; i <= ����9 ; i++) {
//			for(int j = 1 ; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1 ; j<=2*����9-(2*i-1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		// ����10
		System.out.print("����10 ���� �Է� : ");
		int ����10 = scanner.nextInt();
		for (int i = 1 ; i < ����10-1 ; i++) {
			for (int j =1 ; j < i ; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j =1 ; j<= (2*����10 -2*i)-3  ; j++) {
				 System.out.print(" ");
			 }
			System.out.println("*");
			if (i == ����10 - 2) {
				for (int j = 1 ; j<����10-1; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
		for (int i = 1 ; i < ����10 - 1 ; i++) {
			for (int j = 1 ; j< ����10 - 1 - i ; j++) {
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
