package Day08;

public class �������� extends ����{

	private final int �����ڵ� = 0000002;

	public ��������() {
		super();
	}

	public ��������(String ���¹�ȣ, int ��й�ȣ, String ������, int �ݾ� ) {
		super(���¹�ȣ, ��й�ȣ, ������, �ݾ�);

	}
	public ��������(String ���¹�ȣ, int ��й�ȣ, String ������) {
		super(���¹�ȣ, ��й�ȣ, ������);
	}

	@Override
	public void ���»���() {
		System.out.println("------ �������� -------");

		System.out.print("���¹�ȣ�� �Է��ϼ��� XXX-XXX-XX-XXXXXX : ");
		String ���¹�ȣ = Day08_7_ATM.scanner.next();
		System.out.print("��й�ȣ ���ڸ��� �Է��ϼ��� : ");
		int ��й�ȣ = Day08_7_ATM.scanner.nextInt();
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
