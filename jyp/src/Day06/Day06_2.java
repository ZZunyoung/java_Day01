package Day06;

import java.util.Scanner;

public class Day06_2 {
	public static void main(String[] args) {
		// 1. ȸ���� ���α׷�
			// 1. �ִ� 100�� ȸ�� ���� �迭 [ 2���� �迭 ]
				// 1. ���̵�, ��й�ȣ
			// 2. ���ѷ��� [ �޴� ]
				// 1. ȸ������ [ �ߺ� ���̵�x ]
				// 2. �α���
				// 3. ����
			// 3. ���ѷ��� [ �α��ν� ]
				// 1. ȸ��Ż��, �н����庯�� , �α׾ƿ� [ �ʱ�޴��� ]
		String [][] ȸ����� = new String[100][2];
									// [�� = ȸ����][�� = ���̵�, ��й�ȣ]
		// �Է°�ü
		Scanner scan = new Scanner(System.in);
		// �ʱ�޴� => ���ѷ���
		while(true) {
			System.out.println("------ ȸ���� ���α׷� ------");
			System.out.println("1. ȸ������ 2. �α��� 3. ����");
			int �޴� = scan.nextInt();
			if (�޴� == 1) { // ȸ������ : ���̵�, ��й�ȣ �Է¹޾� �迭��
				System.out.println("------ ȸ������ ȭ�� ------");
				System.out.print("ȸ�������� ���̵� �Է��ϼ��� : ");
				String ���̵� = scan.next();
					//�ߺ�üũ
				int �ߺ�üũ = 0; // �ߺ� �⺻��
				for (int i = 0 ; i < ȸ�����.length; i++) {
					if ( ȸ����� [i][0]!=null&&ȸ�����[i][0].equals(���̵�)) {
						System.out.println("\n[ ���� ] �̹� �����ϴ� ���̵��Դϴ�.");
						�ߺ�üũ = 1;
						break;
					}
				}
				if (�ߺ�üũ == 0) { // �ߺ��� ���� ���
					System.out.print("��й�ȣ�� �Է��ϼ��� : ");
					String ��й�ȣ = scan.next();
					// �Է¹��� ���� �迭�� ����
					for (int i = 0; i < ȸ�����.length; i ++) {
						// i �� 0���� �ִ� ȸ������ŭ 1�� ���� �ݺ�
						if (ȸ����� [i][0] == null) { // i��° ���� ���̵� null �̸� 
							ȸ�����[i][0] = ���̵�;		// ���̵� ����
							ȸ�����[i][1] = ��й�ȣ;	// ��й�ȣ ����
							System.err.println("\n [ �Ϸ� ] ȸ�������� �Ǿ����ϴ�.");
							break; // ������ �ݺ��� ������
						}
					}
				}
				if (�ߺ�üũ == 1) {
					
				}
			}
			if (�޴� == 2) {
				System.out.println("------ �α��� ȭ�� -------");
				System.out.print("���̵� �Է����ּ��� : ");
				String ���̵� = scan.next();
				System.out.println("��й�ȣ�� �Է����ּ��� : ");
				String ��й�ȣ = scan.next();
				
				int �α��ο��� = 0;
				for (int i = 0 ; i < ȸ�����.length ; i++) {
					if (ȸ�����[i][0]!=null&&ȸ�����[i][0].equals(���̵�)&&ȸ�����[i][1].equals(��й�ȣ)) {
						System.err.println("\n [ �α��� ���� ] �α��� �Ǿ����ϴ�.");
						�α��ο��� = 1;
						System.out.println("------ ȸ����� ------");
						System.out.println("\t���̵�\t��й�ȣ");
						for(int j = 0 ; j < ȸ�����.length ; j++) {
							if (ȸ�����[j][0]!=null) {
								System.out.println("\t"+ȸ�����[j][0]+"\t"+ȸ�����[j][1]);
							}
						}
						while (true) {
							System.out.print("1. ȸ��Ż�� 2. �н����� ���� 3. �α׾ƿ�"); int ����2 = scan.nextInt();
							if (����2 == 1) { // ���� ȸ���� null�� ���� [ Ż��� ȸ�� �������� �� ȸ���� ��ĭ�� ����
									// i�� ���� �α��ε� ȸ���� �ε���
								ȸ�����[i][0]=null;
								ȸ�����[i][1]=null;
								
									// Ż���� ȸ�� �������� �ڿ� �ִ� ȸ������ ��ĭ�� ����
								for ( int h = i ; h < ȸ�����.length ; h++) {
									if(ȸ�����[h+1][0]!=null) {// ���� ȸ���� ������
										ȸ�����[h][0]=ȸ�����[h+1][0];	// ��ĭ�� ����
										ȸ�����[h][1]=ȸ�����[h+1][1];	// ��ĭ�� ����
									}
									else {
										ȸ�����[h][0] = null;
										ȸ�����[h][1] = null;
										break;
									}
								}
								System.err.println("\n [ ȸ��Ż�� ] ȸ��Ż�� �Ǿ����ϴ�.");
								break;
							}
							if (����2 == 2) {
								System.out.print("������ ��й�ȣ�� �Է����ּ��� : ");
								ȸ�����[i][1]=scan.next();
								System.err.println("\n [ ��й�ȣ ���� ] ��й�ȣ�� ����Ǿ����ϴ�.");
								
							}
							if (����2 == 3) {
								System.err.println("\n [ �α׾ƿ� ] �α׾ƿ� �Ǿ����ϴ�.");
								break;
							}
						}
					}
				}
				
			}
			if (�޴� == 3) {
				System.err.println("[ ���� ]");
				break; // ���尡��� �ݺ��� Ż��
			}
			else {
				System.out.println("");
			}
		}
		
	}
}
