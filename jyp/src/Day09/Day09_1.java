package Day09;

public class Day09_1 {

	// �������̽� : 
		// ���� : ������ �����Ͽ� ������ ��� ����
		// �߻�޼ҵ� : ���� �ϰ� ����[����]�ڵ� X
		// ����Ʈ�޼ҵ� : ����� ���� O
		// ���� : Ŭ������ implements �������̽�
			// extends : ���
				// �ϳ��� Ŭ�������� ���� ����
				// �޸� �Ҵ�
			// implements : �������̽�
				// �������� �������̽����� ���� ����
				// �޸� �Ҵ� x -> Ŭ�����κ��� �޸� �Ҵ� [����]
				// ������ x -> ��ü�����Ұ� [�͸���ü�� ����]
		
	public static void main(String[] args) {
		
		// 1. �������̽� ��ü ����
		������ ������;
		// 2. �������� �޸� �Ҵ� [ Ŭ���� ���� ]
		������ = new �ڷ�����();
		// 3. ������ ����
		������.����();
		������.��������(5);
		������.ä�κ���();
		������.����();
		
		System.out.println("----- ������ ��� ����");
		// 4. �������� �޸� ����
		������ = new �����();
		// 5. ������ ����
		������.����();
		������.��������(5);
		������.ä�κ���();
		������.����();
		
		System.out.println("----- ������ ��� ����");
		// ����Ʈ�ڷ����� Ŭ����
		������ = new ����Ʈ�ڷ�����();
		
		������.����();
		������.��������(5);
		������.ä�κ���();
		������.����();
		
	}
}