package Day08;

public class �л� extends ���{

	// �ʵ�
	int �г�;

	
	// ������ 
	public �л�(int �г�) {
		super();
		this.�г� = �г�;
	}

	public �л�() {
		super();
		
	}


	public �л�(String �̸�, int ���� , int �г�) {
		super(�̸�, ����);
		this.�г� = �г�;
	}

	// �������̵� : �̸� �ۼ����� �޼ҵ带 �ٽ� ����
	@Override
	public void ���� () {
		System.out.println("�л��� �̸� : " + this.�̸�);
	}
	
	
}
