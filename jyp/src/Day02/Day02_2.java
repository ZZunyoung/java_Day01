package Day02;

public class Day02_2 {
	public static void main(String[] args) {
		
		//����
			// 1. ���ϴ� �� <--> ��� : �����ȼ�
			// 2. �޸� : �ڿ� [ ������ ����� ]
				// ���� ���� : 
					// ��� : ����		int ������;
					// ��ǻ�� : ����	�޸�ũ�� �ּҰ�;

			// 3. �ڷ��� : �̸� ���ǵ� �޸� ũ�� [ �޸� ȿ���� => �ӵ� ���� ]
				// 1��Ʈ : 0, 1
				// 1byte : 8��Ʈ => 0Ȥ��1�� 8�ڸ�
				// 1kb => 1025byte	1024kb => mb => gb
				// boolean : 1��Ʈ [ 0[false], 1[true] ]
				// char : 2byte [ �ƽ�Ű�ڵ� ? ]
					// ���ڿ� => String Ŭ����
				// byte : 1byte : ���� [ +-128 ]
				// short : 2byte : ���� [ +-3������ ]
				// int : 4byte : ���� [ +-20�� ���� ]
				// long : 8byte : ���� [ +-20�� �̻� ���� ]
				// float : 4byte : �Ǽ� 
				// double : 8byte : �Ǽ�

		// ����1
			// 1. ��������
				// �ڷ��� ������;	// �����Ⱚ [ ������ �� ]
				// �ڷ��� ������ = ��;
		
		boolean ������ = true;	//True Ȥ�� false �� ������ �� �ִ� �����
		System.out.println("boolean ���� : " + ������);
		
		char ���ں��� = 'a';
		System.out.println("char ���� : "+ ���ں���);
			//char : �ƽ�Ű�ڵ� [ ���� <--> ���� ����ǥ ] ���
		char ���ں���2 = 97;
		System.out.println("char ���� : " + ���ں���2);
		byte ����Ʈ���� = 100;
		System.out.println("byte ���� : " + ����Ʈ����);
		byte ����Ʈ����2 = 'a';
		System.out.println("byte ���� : " + ����Ʈ����2);
		
		short ��Ʈ���� = 300;
		System.out.println("short ���� : " + ��Ʈ����);
		short ��Ʈ����2 = 'a';
		System.out.println("short ���� : " + ��Ʈ����2);
		
		int ��Ʈ���� = 30000;
		System.out.println("int ���� : " + ��Ʈ����);
		int ��Ʈ����2 = 'a';
		System.out.println("int ���� : " + ��Ʈ����2);
			// ������ �⺻ �ڷ��� : int
		
		long �պ��� = 999999999999999L;
			// long�� ���ڵڿ� L
		System.out.println("long ���� : " + �պ���);
		float �Ǽ����� = 1.511111111111f;
			//float�� ���ڵڿ� f
		System.out.println("float ���� : " + �Ǽ�����);
		double �Ǽ�����2 = 1.5111111111111111;
		System.out.println("double ���� : " + �Ǽ�����2);
			// �Ǽ��� �⺻ �ڷ��� : double
		
		String ���ڿ���ü = "�����";
		System.out.println("String ��ü : " + ���ڿ���ü);
		
	}
}
