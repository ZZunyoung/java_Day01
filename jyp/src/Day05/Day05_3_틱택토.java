package Day05;

import java.util.Scanner;

public class Day05_3_ƽ���� {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		// �� ����
		String[] ������ = {"[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]",
						"[ ]","[ ]","[ ]"};
		
		// ������ ���
		while(true) {
			for (int i = 0; i < ������.length ; i++){
				//3���� ��� �ٹٲ�
				System.out.print(������[i]);
				if (i %3 == 2 )System.out.println();
				}
			// �÷��̾ �Է¹޾� �ش� ��ġ�� �� �α�
			System.out.print("[����] �ΰ��� �ϴ� ��ġ :");
			int �÷��̾� = scanner.nextInt(); // �ε���
			if(������ [�÷��̾�] == "[O]") {
				System.out.println("�̹� ������ ��ġ�Դϴ�.");
			}
			if(�÷��̾�<=8&&�÷��̾�>=0) {
				������ [�÷��̾�] = "[O]"; // �Է¹��� �ε����� �� �α�
			}
//			if(�÷��̾�>8||�÷��̾�<0) {
//				System.out.println("���� �ٽ� �Է��� �ּ���.");
//			}
		}
		
	}
}