package Day08;

import java.util.Scanner;

public class ���� {
	// �ʵ�
	private String ���¹�ȣ;
	private int ��й�ȣ;
	private String ������;
	private int �ݾ�;
	//������
	public ����() {
		
	}

	public ����(String ���¹�ȣ, int ��й�ȣ, String ������, int �ݾ�) {
		this.���¹�ȣ = ���¹�ȣ;
		this.��й�ȣ = ��й�ȣ;
		this.������ = ������;
		this.�ݾ� = �ݾ�;
	}
	public ����(String ���¹�ȣ, int ��й�ȣ, String ������) {
		this.���¹�ȣ = ���¹�ȣ;
		this.��й�ȣ = ��й�ȣ;
		this.������ = ������;
		this.�ݾ� = 0;
	}
	// �޼ҵ�
	public String get���¹�ȣ() {
		return this.���¹�ȣ;
	}
	public int get��й�ȣ() {
		return this.��й�ȣ;
	}
	
	public void �Ա�ó��(int �Աݾ�) {
		this.�ݾ� +=�Աݾ�;
		System.err.println("[�Ϸ�] �Ա�ó���� �Ϸ�Ǿ����ϴ�.");
		System.out.println("���� �ܰ� : " + this.�ݾ�);
	}
	public void ���ó�� (int ��ݾ�) {
		if (��ݾ�>this.�ݾ�) {
			System.err.println("[����] �ܰ� �����մϴ�.");
			return;
		}
		this.�ݾ� -= ��ݾ�;
		System.err.println("[�Ϸ�] ���ó���� �Ϸ�Ǿ����ϴ�.");
		System.out.println("���� �ܰ� : " + this.�ݾ�);
	}
	public void ���»���() {
		System.out.println("���¹�ȣ�� �Է��ϼ��� XXX-XXX-XX-XXXXXX : ");
		String ���¹�ȣ = Day08_7_ATM.scanner.next();
		System.out.println("��й�ȣ ���ڸ��� �Է��ϼ��� : ");
		int ��й�ȣ = Day08_7_ATM.scanner.nextInt();
		System.out.println("�����ָ� �Է��ϼ��� : ");
		String ������ = Day08_7_ATM.scanner.next();
//		//��ü ����
//		���� ���� = new ����(���¹�ȣ, ��й�ȣ, ������);
//		//����Ʈ ���
//		Day08_7_ATM.���¸��.add(����);
	}
	
	public void �Ա�() {
		System.out.println("------ �Ա� ȭ�� ------");
		System.out.print("���¹�ȣ�� �Է��ϼ��� XXX-XXX-XX-XXXXXX : ");
		String ���¹�ȣ = Day08_7_ATM.scanner.next();
		System.out.print("��й�ȣ ���ڸ��� �Է��ϼ��� : ");
		int ��й�ȣ = Day08_7_ATM.scanner.nextInt();
		System.out.print("�Աݾ� : ");
		int �Աݾ� = Day08_7_ATM.scanner.nextInt();
		for (���� temp : Day08_7_ATM.���¸��) {
			if (temp.get���¹�ȣ().equals(���¹�ȣ)&&temp.get��й�ȣ()==��й�ȣ) {
				// �ڷ����� �� ������ / String�� equals �޼ҵ�
				temp.�Ա�ó��(�Աݾ�);
				return;
			}
			
		}
		System.out.println("[����] ���¹�ȣ�� ��й�ȣ�� �ٸ��ϴ�.");

	}
	
	public void ���() {
		System.out.println("------ ��� ȭ�� ------");
		System.out.print("���¹�ȣ�� �Է��ϼ��� XXX-XXX-XX-XXXXXX : ");
		String ���¹�ȣ = Day08_7_ATM.scanner.next();
		System.out.print("��й�ȣ ���ڸ��� �Է��ϼ��� : ");
		int ��й�ȣ = Day08_7_ATM.scanner.nextInt();
		System.out.print("��ݾ� : ");
		int ��ݾ� = Day08_7_ATM.scanner.nextInt();
		
		for (���� temp : Day08_7_ATM.���¸��) {
			if (temp.get���¹�ȣ().equals(���¹�ȣ)&&temp.get��й�ȣ()==��й�ȣ) {
				// �ڷ����� �� ������ / String�� equals �޼ҵ�
				temp.���ó��(��ݾ�);
				return;
			}
		}
		System.out.println("[����] ���¹�ȣ�� ��й�ȣ�� �ٸ��ϴ�.");
	}
	
	public void ��ü() {
		System.out.println("------ ��ü ȭ�� ------");
		System.out.print("���¹�ȣ�� �Է��ϼ��� XXX-XXX-XX-XXXXXX : ");
		String ���¹�ȣ = Day08_7_ATM.scanner.next();
		System.out.print("��й�ȣ ���ڸ��� �Է��ϼ��� : ");
		int ��й�ȣ = Day08_7_ATM.scanner.nextInt();
		for (���� temp : Day08_7_ATM.���¸��) {
			if (temp.get���¹�ȣ().equals(���¹�ȣ)&&temp.get��й�ȣ()==��й�ȣ) {
		System.out.print("��ü �ݾ� : ");
		int ��ü�ݾ� = Day08_7_ATM.scanner.nextInt();
		if (temp.�ݾ� < ��ü�ݾ�) {
			System.err.println("[����] ���ݾ��� �����մϴ�.");
			return;
		}
		System.out.println("�����ôº��� ���¹�ȣ : ");
		String ���¹�ȣ2 = Day08_7_ATM.scanner.next();
		
		for (���� temp2 : Day08_7_ATM.���¸��) {
			if (temp2.���¹�ȣ.equals(���¹�ȣ2)){
				temp2.�ݾ� += ��ü�ݾ�;
				System.err.println("[�Ϸ�] ��ü�� �����߽��ϴ�.");
				return;
			}
			System.err.println("[����] ���¹�ȣ�� ��й�ȣ�� �ٸ��ϴ�.");
		}
			}

		}
	}
	
	public void ����ã��() {
		
	}

}
