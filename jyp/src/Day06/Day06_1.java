package Day06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day06_1 {

	// ���� : �޸� �Ҵ�
	// �迭 : ������ �ڷ����� ���� ������ ���� / ����
		// �ڷ��� �迭�� = new �ڷ��� [����]
			// new : �޸� �Ҵ� ������
		// [�ε���] : �迭�� ����Ǵ� ���� ��ȣ
		// �پ��� �޼ҵ� [�̸� �ۼ��� �ڵ� ] => Array Ŭ���� ���
	public static void main(String[] args) {
		
		// �л����� �Է¹޾� �л�����ŭ �迭�� �޸��Ҵ�
		
		Scanner scan = new Scanner(System.in);
		Integer[] �л����� = null; // ���� �޸𸮰� null �� �迭 ����
			//int		: ���� �ڷ��� [ new X ] => ����
			//integer	: ���� Ŭ���� [ new ] => ��ü
		
		while(true) {	// ���ѷ���
			
			System.out.println("--- �л� ���� ���α׷� ---");
			System.out.println("1. �л��� 2. �����Է� 3. ��� 4. ����");
			int ���� = scan.nextInt();
			if (���� == 1) {
				System.out.print("----> �л��� : "); int �ο��� = scan.nextInt();
				�л����� = new Integer [�ο���];
				System.out.println(�ο��� + "��ŭ �л� ������ �Է��� �� �ֽ��ϴ�.");
			}
			if (���� == 2) {
				for(int i = 0 ; i<�л�����.length ; i++) {
					System.out.print((i+1)+"��° �л� ���� �Է� : ");
					�л�����[i] = scan.nextInt();
				}
			}
			if (���� == 3) {
				// ���� = sort()
				Arrays.sort(�л�����);
				// ���
				System.out.println("--------- �������� ---------");
				for (int i = 0; i < �л�����.length ; i++) {
					System.out.println((i+1)+"��° �л��� ���� : " + �л�����[i]);
				}
				
				// �������� : �������� �ݴ�� [ �⺻ �ڷ��� X ]
				Arrays.sort(�л�����, Collections.reverseOrder());
						// �÷��� : �迭, ����Ʈ
				System.out.println("--------- �������� ---------");
				for (int i = 0; i < �л�����.length ; i++) {
					System.out.println((i+1)+"��° �л��� ���� : " + �л�����[i]);
				}
				
				// ���� ���� ���� ���
				int max = 0;
				int sum = 0;
				for ( int i = 0 ; i < �л�����.length ; i++) {
					// �ִ�
					if (max < �л�����[i])max = �л����� [i];
					// �����հ�
					sum += �л�����[i];
				}
				// �ִ� / ��� ���
				
				System.out.println("��� : " + sum/�л�����.length);
			}
			if (���� == 4) {
				break;
			}
			else {
				System.out.println("�ٽ� �Է��� �ּ���.");
			}
			
			
		} // while end
		
	} // main end
}
