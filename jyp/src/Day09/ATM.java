package Day09;

public interface ATM {

	// �ʵ�
	
	// �߻�޼ҵ�
	public void �޴�();
	public void ���µ��();
	public void ����();
	public void ���();
	public void ��ü();
	public void �ܰ�();
	
	// ����Ʈ�޼ҵ�
	public default void ����() {
		System.err.println("[����] ATM�� �����մϴ�.");
	}
}
