package Day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Day07_1 {

	// �޸� ���� ���
		// 1. ���� : �ڷ��� [ �޸� ũ�Ⱑ ������ ] �� �̿��� �޸� �Ҵ�
			// �޸𸮰� ������ �ֱ� ������ new ������ x
			// int ������ = 30;
		// 2. ��ü : Ŭ���� [ ���赵 ] �� �̿��� �޸� �Ҵ�
			// �޸��� ũ�Ⱑ ������ ���� �ʱ� ������ new ������ o
			// Scanner ��ü = new Scanner();
			
		
	// �޸� ���� ���
		// 1. �迭 : ������ �ڷ��� / Ŭ������ ������ �޸� ����/����
			// int[] �迭 = new int[30];
		// 2. ����Ʈ : ������ �ڷ��� / Ŭ������ ������ �޸𸮸� ������ �� �ִ� ��ü
			// ArrayList<Integer> ����Ʈ = new ArrayList<>();
					// < ���׸� >
	
	// �޸� ���� ���� ��� => �޸� (�ֱ����ġ) => ���������ġ
		// 1. ����ó��
		// 2. �����ͺ��̽�
		// 3. Ŭ����
	
	// Ŭ���� [ java 100% ��ü���� ] 
		// 1. �ֻ��� Ŭ������ object Ŭ������ ����
			// ��� Ŭ������ object �� ���� ����� �޴´�
		// ����� Ŭ���� �����
			// ��� : 1. �ʵ� 2. ������ 3. �޼ҵ�
			
			Scanner scan = new Scanner(System.in);
			
			
			
			public static void main(String[] args) {
				
				// �迭
				String[] �迭 = new String[3]; // String 3���� ������ �� �ִ� �迭
				�迭[0] = "���缮"; System.out.println(�迭[0]);
				�迭[1] = "��ȣ��"; System.out.println(�迭[1]);
				�迭[2] = "�ŵ���"; System.out.println(�迭[2]);
				
				// ����Ʈ
				ArrayList<String> ����Ʈ = new ArrayList<>();
				����Ʈ.add("���缮"); System.out.println(����Ʈ.get(0));
				����Ʈ.add("��ȣ��"); System.out.println(����Ʈ.get(1));
				����Ʈ.add("�ŵ���"); System.out.println(����Ʈ.get(2));
				
				// ��ü ����� [ ������ �̿� ]
					// 1. Ŭ������ [ ��ü�� ���赵 ]
					// 2. ��ü�� [ ������ �� ]
					// 3. new [ ��ü �޸� �Ҵ� ] �ʼ�
					// 4. ������ 
					// ��ü�� Ŭ������ ��� [ �ʵ�, �޼ҵ� ]�� �����ϴ� ��� [ . ������ ]
					
				// 1. ������ڸ� �̿��� ��ü
				�л� temp1 = new �л�(); // ���빰 ����
				temp1.�̸� = "��ȣ��";
				temp1.���� = 30;
				// 2. ��� �ʵ带 ���� �����ڸ� �̿��� ��ü
				�л� tmep2 = new �л�("���缮" , 20); // ���빰 ����
				
				// �޼ҵ� ȣ��
				System.out.println(temp1.�̸����());
				System.out.println(temp1.�������());
				
				temp1.ȸ������();
				System.out.println(temp1.�л�����(30));
				
				temp1.���̾�����Ʈ(40);
				System.out.println(temp1.����);
			}
			
			
}
