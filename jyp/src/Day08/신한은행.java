package Day08;

import Day07.Day07_2_Start;
import Day07.Member;

public class �������� extends ���� {

	private final int �����ڵ� = 0000001;
		// final => ���
	
	public ��������() {
		super();
	}

	public ��������(String ���¹�ȣ, int ��й�ȣ, String ������, int �ݾ�) {
		super(���¹�ȣ, ��й�ȣ, ������, �ݾ�);
	}

	public ��������(String ���¹�ȣ, int ��й�ȣ, String ������) {
		super(���¹�ȣ, ��й�ȣ, ������);
	}

	
	@Override
	public void ���»���() {
		// TODO Auto-generated method stub
		System.out.println("------ �������� -------");

		System.out.print("���¹�ȣ�� �Է��ϼ��� XXX-XXX-XX-XXXXXX : "); // ���� : �ߺ�����
		String ���¹�ȣ = Day08_7_ATM.scanner.next();
		for(���� temp : Day08_7_ATM.���¸��) {
			if(temp.get���¹�ȣ().equals(���¹�ȣ)){
				System.err.println("[����] : ������ ���¹�ȣ�� �����մϴ�.");
				return; // �޼ҵ� ����  : �޼ҵ� ��ȯ : ��ȯ������ ���� 
			}
		}
		System.out.print("��й�ȣ ���ڸ��� �Է��ϼ��� : "); // ���� : 4���� ����
		int ��й�ȣ = Day08_7_ATM.scanner.nextInt();
		//String s��й�ȣ = Integer.toString(��й�ȣ); // ���ڿ� => ���ڿ�
		if ((int)( Math.log10(��й�ȣ)+1 )!= 4) {
			System.out.println("�ùٸ��� ���� ��й�ȣ �Դϴ�.");
			return;
		}
		System.out.print("�����ָ� �Է��ϼ��� : ");
		String ������ = Day08_7_ATM.scanner.next();
		
		�������� tmep = new ��������(���¹�ȣ, ��й�ȣ, ������);
		Day08_7_ATM.���¸��.add(tmep);
		
		System.out.println("[����] ���� ������ �Ϸ� �Ǿ����ϴ�.");
	}

	@Override
	public void �Ա�() {
		// TODO Auto-generated method stub
		super.�Ա�();
	}

	@Override
	public void ���() {
		// TODO Auto-generated method stub
		super.���();
	}

	@Override
	public void ��ü() {
		// TODO Auto-generated method stub
		super.��ü();
	}

	@Override
	public void ����ã��() {
		// TODO Auto-generated method stub
		super.����ã��();
	}
	
}
	
	

