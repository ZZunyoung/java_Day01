package Day08;

public class vip extends ȸ�� {
	String ȸ�����;

	public vip() {
		super();
	}

	public vip(String ���̵�, String ��й�ȣ , String ȸ�����) {
		super(���̵�, ��й�ȣ);
		this.ȸ����� = ȸ�����;
	}
	
	@Override
	public void ����() {
		super.����();
		
		System.out.println("ȸ�� ��� : "+ this.ȸ�����);
	}
}
